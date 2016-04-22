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
	    PacienteDAOVetor VetorPaciente = new PacienteDAOVetor();
	    VetorPaciente.addPaciente(p1);
	    VetorPaciente.addPaciente(p2);
	    VetorPaciente.addPaciente(p3);
	    VetorPaciente.addPaciente(p4);
	    VetorPaciente.addPaciente(p5);
	    VetorPaciente.addPaciente(p6);
	        System.out.println("XXXXXXXXXX ACHOU PELO RG XXXXXXXXXXXXX");
	    Paciente t = VetorPaciente.getPaciente("001");
	        System.out.println("Achado: "+t.toString());
	        System.out.println("XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX");
	        System.out.println("************ Vetor de Pacientes Ordenado pelo RG ************");
	    
	        System.out.println("************************************");

	    }
	    }
	

