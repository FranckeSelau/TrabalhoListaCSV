
package dao;

import estruturaDeDados.IteradorListaEncadeada;
import estruturaDeDados.ListaEncadeada;
import model.CSVFile;
import model.Paciente;

public class PacienteDAOLista implements PacienteDAO<PacienteDAOLista> {
	ListaEncadeada<Paciente> ListaPaciente = new ListaEncadeada<Paciente>();
	IteradorListaEncadeada<Paciente> IteradorPaciente = new IteradorListaEncadeada<Paciente>(ListaPaciente);

	public ListaEncadeada<Paciente> getLista() {
		return ListaPaciente;
	}

	@Override
	public void addPaciente(Paciente paciente) {
		IteradorPaciente.insertionSort(paciente);
	}

	@Override
	public void removePaciente(String rg) {
		while (IteradorPaciente.hasNext()) {
			if (IteradorPaciente.next().getRg().equals(rg)) {
				IteradorPaciente.remove();
			}
		}
	}
	
	@Override
	public Paciente getPaciente(String rg) {
		Paciente correto = null;
		while (IteradorPaciente.hasNext()) {
			if (IteradorPaciente.next().getRg().equals(rg)) {
				correto = IteradorPaciente.next();
			}
		}
		return correto;
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
