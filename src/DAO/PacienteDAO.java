package DAO;
import model.CSVFile;
import model.Paciente;

public interface PacienteDAO<T> {
	Paciente getPaciente(String rg);

	void addPaciente(Paciente paciente);

	void removePaciente(String rg);

	void loadData(CSVFile arquivo);
}
