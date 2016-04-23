package model;

import DAO.PacienteDAO;
import DAO.PacienteDAOLista;
import DAO.PacienteDAOVetor;



public class TestApplication {

	public static void main(String... args) {

		/*CSVFile<Paciente> paciente = new CSVFile<Paciente>();
		CSVFile<Medicamento> medicamento = new CSVFile<Medicamento>();
		
		PacienteParser p = new PacienteParser();
		MedicamentoParser m = new MedicamentoParser();

		//String arquivo = "paciente.csv";

		//paciente.setParser(p);
		//paciente.Open(arquivo);
		
		String arquivoM = "medicamento.csv";
		
		medicamento.setParser(m);
		medicamento.Open(arquivoM);
		
		/*String hexNumber = "234a11bce75";
				Long decimal = Long.parseLong(hexNumber, 16);
				System.out.println("Hex value is " + decimal);*/
		
	}
}

