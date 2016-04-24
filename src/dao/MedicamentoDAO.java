package dao;

import model.CSVFile;
import model.Medicamento;

public interface MedicamentoDAO<T> {
	Medicamento getMedicamento(int codigo);

	void addMedicamento(Medicamento medicamento);

	void removeMedicamento(int codigo);

	@SuppressWarnings("rawtypes")
	void loadData(CSVFile arquivo);
}
