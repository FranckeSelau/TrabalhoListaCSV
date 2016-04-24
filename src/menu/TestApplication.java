
package menu;

import dao.PacienteDAOLista;
import dao.PacienteDAOVetor;
import model.CSVFile;
import model.Medicamento;
import model.MedicamentoParser;
import model.Paciente;
import model.PacienteParser;

public class TestApplication {
	public static void main(String[] args) {

		//testeManualVetor();
		
		//testeManualLista();
		
		//testeVetorPacienteCSV();
		
		//testeMedicamentoCSV();
	}

	public static void testeManualVetor() {
		Paciente p1 = new Paciente("1005", "Joao", "2016-06-23");
		Paciente p2 = new Paciente("2003", "Maria", "2016-06-23");
		Paciente p3 = new Paciente("3007", "Jose", "2016-06-23");
		Paciente p4 = new Paciente("8001", "Didi", "2016-06-23");
		Paciente p5 = new Paciente("7004", "Dede", "2016-06-23");
		Paciente p6 = new Paciente("6002", "Mussum", "2016-06-23");
		Paciente p7 = new Paciente("5006", "Zacarias", "2016-06-23");
		Paciente p8 = new Paciente("4012", "Tonico", "2016-06-23");
		Paciente p9 = new Paciente("3010", "Tinoco", "2016-06-23");
		Paciente p10 = new Paciente("2009", "Dandas", "2016-06-23");
		Paciente p11 = new Paciente("1011", "Leandro", "2016-06-23");
		Paciente p12 = new Paciente("99008", "Leonardo", "2016-06-23");
		PacienteDAOVetor testeVetorPaciente = new PacienteDAOVetor();
		testeVetorPaciente.addPaciente(p1);
		testeVetorPaciente.addPaciente(p2);
		testeVetorPaciente.addPaciente(p3);
		testeVetorPaciente.addPaciente(p4);
		testeVetorPaciente.addPaciente(p5);
		testeVetorPaciente.addPaciente(p6);
		testeVetorPaciente.addPaciente(p7);
		testeVetorPaciente.addPaciente(p8);
		testeVetorPaciente.addPaciente(p9);
		testeVetorPaciente.addPaciente(p10);
		testeVetorPaciente.addPaciente(p11);
		testeVetorPaciente.addPaciente(p12);

		System.out.println("\nbusca por RG:");
		Paciente t = testeVetorPaciente.getPaciente("4012");
		System.out.println("Resultado: " + t.toString() + "\n");

		System.out.println("ordenar por RG");
		testeVetorPaciente.getVetor();
	}

	public static void testeManualLista() {
		Paciente l1 = new Paciente("1005", "Joao", "2016-06-23");
		Paciente l2 = new Paciente("2003", "Maria", "2016-06-23");
		Paciente l3 = new Paciente("3007", "Jose", "2016-06-23");
		Paciente l4 = new Paciente("8001", "Didi", "2016-06-23");
		PacienteDAOLista testeListaPaciente = new PacienteDAOLista();
		testeListaPaciente.addPaciente(l1);
		testeListaPaciente.addPaciente(l2);
		testeListaPaciente.addPaciente(l3);
		testeListaPaciente.addPaciente(l4);
		System.out.println(l3.toString());
	}

	public static void testeVetorPacienteCSV() {
		CSVFile<Paciente> paciente = new CSVFile<Paciente>();
		PacienteParser p = new PacienteParser();
		paciente.setParser(p);
		PacienteDAOVetor testeVetorPaciente = new PacienteDAOVetor();
		testeVetorPaciente.loadData(paciente);
	}

	public static void testeMedicamentoCSV() {
		CSVFile<Medicamento> medicamento = new CSVFile<Medicamento>();

		MedicamentoParser m = new MedicamentoParser();

		String arquivoM = "medicamento.csv";

		medicamento.setParser(m);
		medicamento.open(arquivoM);
	}
}
