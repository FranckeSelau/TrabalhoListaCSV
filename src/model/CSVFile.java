package model;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

public class CSVFile<T> {
	private CSVParser<T> objectParser;
	private Scanner leitor;

	public void open(String arquivo) {
		try {
			FileReader fr = new FileReader(arquivo);
			leitor = new Scanner(fr);
			leitor.useDelimiter("[\n]");
			while (leitor.hasNext()) {
				
				T objeto;
				objeto = readObject();
				System.out.println(objeto.toString());
			}
			close();
		} catch (FileNotFoundException fnfe) {
			System.err.println(fnfe.getMessage());
		}
	}

	public T readObject() {
		T elemento = objectParser.parseObject(leitor.next());
		return elemento;
	}

	public void close() {
		leitor.close();
	}

	public void setParser(CSVParser<T> parser) {
		this.objectParser = parser;
	}
}
