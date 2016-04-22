package model;

import DAO.PacienteDAO;
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
		
		Paciente p1 = new Paciente("001","Ana Maria","2016-02-20");
	    Paciente p2 = new Paciente("002","Pedro","2016-02-20");
	    Paciente p3 = new Paciente("006","Henrique","2016-02-20");
	    Paciente p4 = new Paciente("005","Nicole","2016-02-20");
	    Paciente p5 = new Paciente("004","Joao","2016-02-20");
	    Paciente p6 = new Paciente("003","Mariana","2016-02-20");
	    PacienteDAO ListaPaciente = new PacienteDAOVetor();
	    ListaPaciente.addPaciente(p1);
	    ListaPaciente.addPaciente(p2);
	    ListaPaciente.addPaciente(p3);
	    ListaPaciente.addPaciente(p4);
	    ListaPaciente.addPaciente(p5);
	    ListaPaciente.addPaciente(p6);
	    MostrarLista(ListaPaciente);
	    }
	    
	    public static void MostrarLista(PacienteDAO lista){
	       for (int i = 0; i < 6; i++) {
			System.out.println(lista.toString()); 
			
		}
	    }
	
}
