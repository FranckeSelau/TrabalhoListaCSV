package model;

public class MedicamentoParser implements CSVParser<Medicamento>{

	public Medicamento parseObject(String Dados) {
		String array[] = new String[2];
		array = Dados.split(";"); // paciente é ',' e medicamento ';'
		Medicamento m = new Medicamento(array[0] ,array[1]); //converter cód em 's'
		return m;
	}
}
