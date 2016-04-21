package model;

public class TestApplication {

	public static void main(String... args) {

		CSVFile<Paciente> paciente = new CSVFile<Paciente>();
		PacienteParser p = new PacienteParser();

		String arquivo = "paciente.csv";

		paciente.setParser(p);
		paciente.Open(arquivo);
	}
}
