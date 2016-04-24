
package dao;

import estruturaDeDados.IteradorListaEncadeada;
import estruturaDeDados.ListaEncadeada;
import model.CSVFile;
import model.Medicamento;

public class MedicamentoDAOLista implements MedicamentoDAO<MedicamentoDAOLista> {
	ListaEncadeada<Medicamento> ListaMedicamento = new ListaEncadeada<Medicamento>();
	IteradorListaEncadeada<Medicamento> IteradorMedicamento = new IteradorListaEncadeada(ListaMedicamento);

	@Override
	public void addMedicamento(Medicamento medicamento) {
		IteradorMedicamento.insertionSort(medicamento);
	}

	@Override
	public void removeMedicamento(int cod) {
		while (IteradorMedicamento.hasNext()) {
			if (IteradorMedicamento.next().getCodigo() == cod) {
				IteradorMedicamento.remove();
			}
		}
	}
	
	@Override
	public Medicamento getMedicamento(int cod) {
		Medicamento correto = null;
		while (IteradorMedicamento.hasNext()) {
			if (IteradorMedicamento.next().getCodigo() == cod) {
				correto = IteradorMedicamento.next();
			}
		}
		return correto;
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
