package model;
import java.util.ArrayList;
import java.util.Scanner;

public class PacienteParser implements CSVParser {
	private static ArrayList<Paciente> listaPacientes = new ArrayList<>();  

	public ArrayList<Paciente> getListaPacientes() {
		return listaPacientes;
	}
	
	public void parseObject (Scanner leitor){
		while (leitor.hasNext()) {			
			Paciente p = new Paciente(leitor.next(),leitor.next(),leitor.next());
			getListaPacientes().add(p);
		} 		
	}
}
