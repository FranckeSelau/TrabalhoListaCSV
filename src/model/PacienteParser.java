package model;

public class PacienteParser implements CSVParser<Paciente> {	
		
	public Paciente parseObject(String Dados) {
		String array[] = new String[3];
		array = Dados.split(",");
		Paciente p = new Paciente(array[0],array[1],array[2]);
		return p;
	}
}

