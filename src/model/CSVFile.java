package model;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Scanner;

public class CSVFile {
	
	CSVParser paciente = new PacienteParser(); //instancia novo pacienteparser com o m�todo da interface
	
	public void openFile(){
		try {
			FileReader fr = new FileReader("paciente.csv");
			Scanner leitor = new Scanner(fr);
			leitor.useDelimiter("[,\n]");
			paciente.parseObject(leitor); // metodo da interface
			leitor.close();
		} catch (FileNotFoundException fnfe) {
			System.err.println("ERRO! Arquivo n�o Encontrado");
		}
		readObject();
	}
	public void readObject(){
		PacienteParser lista = new PacienteParser();
		int a = 0;
		for (Paciente p : lista.getListaPacientes()) {
			a++;
			System.out.println("Paciente "+a+" - "+p);
		}
	}
}
