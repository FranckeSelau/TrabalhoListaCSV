package model;
import java.util.Scanner;

public class PacienteParser implements CSVParser<Paciente> {	
		
	public Paciente parseObject (Scanner leitor){
		Paciente p = new Paciente(leitor.next(),leitor.next(),leitor.next());
		return p;
	}


}

