package model;

public class Medicamento implements Comparable<Medicamento> {
	private int cod;
	private String nome;

	public Medicamento(String cod, String nome) {
		this.cod = Integer.parseInt(cod, 16);
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
		return String.format("%-20s", " COD: " + getCodigo()) + "\t"
        + String.format("%-25s", "| NOME: " + getNome() + "\n"      
        + "------------------------------------------------------");
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
