package dao;

import estruturaDeDados.IteradorVetor;
import estruturaDeDados.Vetor;
import model.CSVFile;
import model.Medicamento;

public class MedicamentoDAOVetor implements MedicamentoDAO<MedicamentoDAOVetor> {
	private Vetor<Medicamento> VetorMedicamento = new Vetor<Medicamento>();
	private IteradorVetor<Medicamento> Iterador = new IteradorVetor<Medicamento>(VetorMedicamento);

	@Override
	public void addMedicamento(Medicamento medicamento) {
		Iterador.insert(medicamento);
	}

	@Override
	public void removeMedicamento(int cod) {
		while (Iterador.hasNext()) {
			if (Iterador.next().getCodigo() == cod) {
				Iterador.remove();
			}
		}
	}
	
	public Medicamento getMedicamento(int cod) {
		Iterador.selectionSort();
		Medicamento correto = null;
		while (Iterador.hasNext()) {
			if (Iterador.next().getCodigo() == cod) {
				correto = Iterador.next();
			}
		}
		return correto;
	}

	@Override
	public void loadData(CSVFile arquivo) {
		CSVFile<Medicamento> arquivoMed = arquivo;
		String filename = "medicamento.csv";
		arquivo.open(filename);
		addMedicamento(arquivoMed.readObject());
		arquivo.close();
	}
}
