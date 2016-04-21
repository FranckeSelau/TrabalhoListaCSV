package model;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Paciente implements Comparable<Paciente> {	
	private String rg;
	private String nome;
	private LocalDate dataNascimento;

	public Paciente(String rg, String nome, String data) {
		this.rg = rg;
		this.nome = nome;
		this.dataNascimento = LocalDate.parse(data.trim()); //trim renove os espaços de toda string		
	}

	public String getRg() {
		return rg;
	}

	public String getNome() {
		return nome;
	}

	public LocalDate getDataNascimento() {
		return dataNascimento;
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
    public int compareTo(Paciente OutroPaciente) {
        return(this.getRg().compareTo(OutroPaciente.getRg()));
    }
}
