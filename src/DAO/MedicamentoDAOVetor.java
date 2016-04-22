package DAO;

import estruturaDeDados.IteradorVetor;
import estruturaDeDados.Vetor;
import model.CSVFile;
import model.Medicamento;

public class MedicamentoDAOVetor implements MedicamentoDAO<MedicamentoDAOVetor> {
	private Vetor<Medicamento> VetorMedicamento = new Vetor<Medicamento>();
	private IteradorVetor<Medicamento> Iterador = new IteradorVetor<Medicamento>(VetorMedicamento);

	public Medicamento getMedicamento(int codigo) {
		Iterador.selectionSort();
		Medicamento Encontrado = null;
		while (Iterador.hasNext()) {
			if (Iterador.next().getCodigo() == codigo) {
				Encontrado = Iterador.next();
			}
		}
		return Encontrado;
	}

	@Override
	public void addMedicamento(Medicamento medicamento) {
		Iterador.insert(medicamento);
	}

	@Override
	public void removeMedicamento(int codigo) {
		while (Iterador.hasNext()) {
			if (Iterador.next().getCodigo() == codigo) {
				Iterador.remove();
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
