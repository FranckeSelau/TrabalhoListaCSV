package dao;

import estruturaDeDados.IteradorVetor;
import estruturaDeDados.Vetor;
import model.CSVFile;
import model.Medicamento;
import model.Paciente;
import model.PacienteParser;

public class PacienteDAOVetor implements PacienteDAO<PacienteDAOVetor> {

	private Vetor<Paciente> VetorPacientes;
	private IteradorVetor<Paciente> Iterador;

	public PacienteDAOVetor() {
		VetorPacientes = new Vetor<Paciente>();
		Iterador = new IteradorVetor<Paciente>(VetorPacientes);
	}

	public void getVetor() {
		Iterador.exibeVetor();
	}

	public Paciente getPaciente(String rg) {
		Iterador.selectionSort();
		Paciente correto = null;
		int i = 0;
		while (i < Iterador.getTamanho()) {
			Paciente pac = Iterador.next();
			if (pac.getRg().equalsIgnoreCase(rg)) {
				correto = pac;
			}
			i++;
		}
		return correto;
	}

	public void addPaciente(Paciente paciente) {
		Iterador.insert(paciente);
	}

	public void removePaciente(String rg) {
		int i = 0;
		while (i < Iterador.getTamanho()) {
			Paciente pac = Iterador.next();
			if (pac.getRg().equalsIgnoreCase(rg)) {
				Iterador.remove();
			}
		}
	}

	@Override
	public void loadData(CSVFile arquivo) {
		CSVFile<Paciente> arquivoPac = arquivo;
		String filename = "paciente.csv";
		arquivo.open(filename);
		addPaciente(arquivoPac.readObject());
		arquivo.close();
	}
}

/*public void loadData(String Filename) {
	
	CSVFile<Paciente> paciente = new CSVFile<Paciente>();
	PacienteParser p = new PacienteParser();
	paciente.setParser(p);
	paciente.Open(Filename);
	addPaciente(p);
	
}*/
