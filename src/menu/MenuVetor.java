package menu;

import estruturaDeDados.Console;

public class MenuVetor {
	
	public static void menuInicialVetor() {
		boolean a = true;
		while (a) {
			switch (menuVetor()) {
			case '1':
				pacienteVetor();
				break;
			case '2':
				medicamentoVetor();
				break;
			case '0':
				a = false;
				break;
			}
		}
	}

	public static char menuVetor() {
		char a = ' ';
		System.out.println("\n\nMENU VETOR" + "\n------------------------------------------------------------"
				+ "\n1 - Menu Paciente" + "\n2 - Menu Medicamento" + "\n0 - Sair");
		do {
			a = Console.scanChar("\nDigite a opção do MENU: ");
			if (a != '1' && a != '2' && a != '0')
				System.err.println("ERRO! - Digite uma opção válida!");
		} while (a != '1' && a != '2' && a != '0');
		return a;
	}

	public static void pacienteVetor() {
		boolean a = true;
		while (a) {
			switch (pacienteMenuVetor()) {
			case '1':
				buscaRG();
				break;
			case '2':
				buscaPacNome();
				break;
			case '0':
				a = false;
				break;
			}
		}
	}

	public static char pacienteMenuVetor() {
		char a = ' ';
		System.out.println("\n\nOpção 1 - Menu Pacientes Vetor"
				+ "\n------------------------------------------------------------" + "\n1 - Consulta Paciente por RG"
				+ "\n2 - Consulta Paciente por Nome" + "\n0 - Voltar Menu anterior");
		do {
			a = Console.scanChar("\nDigite uma opção do MENU Pacientes Vetor: ");
			if (a != '1' && a != '2' && a != '0')
				System.err.println("ERRO! - Digite uma opção válida!");
		} while (a != '1' && a != '2' && a != '0');
		return a;
	}

	public static void buscaRG() {
		System.out.println("Busca paciente rg");
	}

	public static void buscaPacNome() {
		System.out.println("Busca paciente rg");
	}

	public static void sair() {
		System.out.println("Sistema Encerrado!");
		System.exit(0);
	}

	public static void medicamentoVetor() {
		boolean a = true;
		while (a) {
			switch (medicamentoMenuVetor()) {
			case '1':
				buscaCOD();
				break;
			case '2':
				buscaMedNome();
				break;
			case '0':
				a = false;
				break;
			}
		}
	}

	public static char medicamentoMenuVetor() {
		char a = ' ';
		System.out.println("\n\nOpção 1 - Menu Medicamentos Vetor"
				+ "\n------------------------------------------------------------"
				+ "\n1 - Consulta Medicamento por Codigo" + "\n2 - Consulta Medicamento por Nome"
				+ "\n0 - Voltar Menu anterior");
		do {
			a = Console.scanChar("\nDigite uma opção do MENU Medicamentos Vetor: ");
			if (a != '1' && a != '2' && a != '0')
				System.err.println("ERRO! - Digite uma opção válida!");
		} while (a != '1' && a != '2' && a != '0');
		return a;
	}

	public static void buscaCOD() {
		System.out.println("Busca medicamento cod");
	}

	public static void buscaMedNome() {
		System.out.println("Busca medicamento nome");
	}
}
