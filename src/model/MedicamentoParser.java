package model;

public class MedicamentoParser implements CSVParser<Medicamento>{

	public Medicamento parseObject(String Dados) {
		String array[] = new String[2];
		array = Dados.split(";"); // paciente � ',' e medicamento ';'
		Medicamento m = new Medicamento(array[0] ,array[1]); //converter c�d em 's'
		return m;
	}
}
