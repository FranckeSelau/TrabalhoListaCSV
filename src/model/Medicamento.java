package model;

import java.time.format.DateTimeFormatter;

public class Medicamento implements Comparable<Medicamento> {
	private int cod;
	private String nome;

	public Medicamento(int cod, String nome) {
		this.cod = cod;
		this.nome = nome;
	}

	public int getCodigo() {
		return cod;
	}

	public String getNome() {
		return nome;
	}
	
	@Override	
	public String toString() {
		String data = dataNascimento.format(DateTimeFormatter.ofPattern("dd/MM/yyyy")); //converte a data ISO em data BR
		return String.format("%-20s", " RG: " + getRg()) + "\t"
        + String.format("%-25s", "| NOME: " + getNome()) + "\t"
        + String.format("%-20s", "| DATA NASC.: " + data + "\n"
        + "-----------------------------------------"
        + "-----------------------------------------");
	}
	
	@Override
	public int compareTo(Medicamento OutroMedicamento) {
		if (this.getCodigo() > OutroMedicamento.getCodigo()) {
			return 1;
		}
		if (this.getCodigo() < OutroMedicamento.getCodigo()) {
			return -1;
		} else {
			return 0;
		}
	}
}
