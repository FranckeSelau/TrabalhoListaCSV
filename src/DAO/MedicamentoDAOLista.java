package DAO;

import estruturaDeDados.IteradorListaEncadeada;
import estruturaDeDados.ListaEncadeada;
import model.CSVFile;
import model.Medicamento;

public class MedicamentoDAOLista implements MedicamentoDAO<MedicamentoDAOLista> {
	ListaEncadeada<Medicamento> ListaMedicamento = new ListaEncadeada<Medicamento>();
	IteradorListaEncadeada<Medicamento> IteradorMedicamento = new IteradorListaEncadeada(ListaMedicamento);

	@Override
	public Medicamento getMedicamento(int codigo) {
		Medicamento Encontrado = null;
		while (IteradorMedicamento.hasNext()) {
			if (IteradorMedicamento.next().getCodigo() == codigo) {
				Encontrado = IteradorMedicamento.next();
			}
		}
		return Encontrado;
	}

	@Override
	public void addMedicamento(Medicamento medicamento) {
		IteradorMedicamento.insertionSort(medicamento);
	}

	@Override
	public void removeMedicamento(int codigo) {
		while (IteradorMedicamento.hasNext()) {
			if (IteradorMedicamento.next().getCodigo() == codigo) {
				IteradorMedicamento.remove();
			}
		}
	}

	@Override
	public void loadData(CSVFile arquivo) {
		CSVFile<Medicamento> arquivoMed = arquivo;
		String Filename = "medicamento.csv";
		arquivo.Open(Filename);
		addMedicamento(arquivoMed.readObject());
		arquivo.Close();
	}
}
