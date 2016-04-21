package model;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;



public class CSVFile<T> {
	private CSVParser<T> objectParser;
	
	public void setParser(CSVParser<T> objectParser){
		this.objectParser = objectParser;
	}

	public void openFile(){
		try {
			FileReader fr = new FileReader("paciente.csv");
			Scanner leitor = new Scanner(fr);
			leitor.useDelimiter("[,\n]");
			while (leitor.hasNext()) {
        		T iterador;
        		iterador = readObject(leitor);
        		System.out.println("---------------------------------------");
        		System.out.println(iterador.toString());
        	}
       	   Close(leitor);
		} catch (FileNotFoundException fnfe) {
			System.err.println("ERRO! Arquivo não Encontrado");
		}
	}
	public T readObject(Scanner leitor){
		T elemento = objectParser.parseObject(leitor);
		return elemento;
	}
	public void Close(Scanner leitor){
		leitor.close();
	}

	
}
