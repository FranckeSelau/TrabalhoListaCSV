package model;

public class MedicamentoParser implements CSVParser<Medicamento>{

	@Override
	public Medicamento parseObject(String dados) {
		String array[] = new String[2];
		array = dados.split(";");
		Medicamento medicamento = new Medicamento(array[0],array[1]);
		return medicamento;
	}
}
