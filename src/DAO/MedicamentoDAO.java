package DAO;

import model.CSVFile;
import model.Medicamento;

public interface MedicamentoDAO<T> {
	Medicamento getMedicamento(int codigo);

	void addMedicamento(Medicamento medicamento);

	void removeMedicamento(int codigo);

	void loadData(CSVFile arquivo);
}
