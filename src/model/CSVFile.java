package model;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

public class CSVFile<T> {
	private CSVParser<T> objectParser;
	
	public T setParser(Scanner leitor){
		T elemento = objectParser.parseObject(leitor);
		return elemento;
	}

	public void openFile(){
		try {
			FileReader fr = new FileReader("paciente.csv");
			Scanner leitor = new Scanner(fr);
			leitor.useDelimiter("[,\n]");
			while (leitor.hasNext()) {
        		T iterador;
        		iterador = setParser(leitor);
        		System.out.println("---------------------------------------");
        		System.out.println(iterador.toString());
        	}
       	   Close(leitor);
		} catch (FileNotFoundException fnfe) {
			System.err.println("ERRO! Arquivo não Encontrado");
		}
	}
	public void readObject(Scanner leitor){
		
	}
	public void Close(Scanner leitor){
		leitor.close();
	}

	
}
