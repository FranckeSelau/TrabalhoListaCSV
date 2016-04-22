package DAO;

import estruturaDeDados.IteradorVetor;
import estruturaDeDados.Vetor;
import model.CSVFile;
import model.Paciente;

public class PacienteDAOVetor implements PacienteDAO<PacienteDAOVetor> {

	private Vetor<Paciente> VetorPacientes = new Vetor<Paciente>();
	private IteradorVetor<Paciente> Iterador = new IteradorVetor<Paciente>(VetorPacientes);

	public Paciente getPaciente(String rg) {
		Iterador.selectionSort();
		Paciente Encontrado = null;
		while (Iterador.hasNext()) {
			if (Iterador.next().getRg().equalsIgnoreCase(rg)) {
				Encontrado = Iterador.next();
			}
		}
		return Encontrado;
	}

	public void addPaciente(Paciente paciente) {
		Iterador.insert(paciente);
	}

	public void removePaciente(String rg) {
		while (Iterador.hasNext()) {
			if (Iterador.next().getRg().equalsIgnoreCase(rg)) {
				Iterador.remove();
			}
		}
	}

	public void loadData(@SuppressWarnings("rawtypes") CSVFile arquivo) {
		@SuppressWarnings("unchecked")
		CSVFile<Paciente> arquivoPac = arquivo;
		String Filename = "paciente.csv";
		arquivo.Open(Filename);
		addPaciente(arquivoPac.readObject());
		arquivo.Close();
	}
}
