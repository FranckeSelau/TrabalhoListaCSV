package menu;

import estruturaDeDados.Console;

public class MenuLista {
	public static void menuInicialLista() {
		boolean a = true;
		while (a) {
			switch (menuLista()) {
			case '1':
				pacienteLista();
				break;
			case '2':
				medicamentoLista();
				break;
			case '0':
				a = false;
				break;
			}
		}
	}

	public static char menuLista() {
		char a = ' ';
		System.out.println("\n\nMENU LISTA" + "\n------------------------------------------------------------"
				+ "\n1 - Menu Paciente" + "\n2 - Menu Medicamento" + "\n0 - Sair");
		do {
			a = Console.scanChar("\nDigite a opção do MENU: ");
			if (a != '1' && a != '2' && a != '0')
				System.err.println("ERRO! - Digite uma opção válida!");
		} while (a != '1' && a != '2' && a != '0');
		return a;
	}

	public static void pacienteLista() {
		boolean a = true;
		while (a) {
			switch (pacienteMenuLista()) {
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

	public static char pacienteMenuLista() {
		char a = ' ';
		System.out.println("\n\nOpção 1 - Menu Pacientes Lista"
				+ "\n------------------------------------------------------------" + "\n1 - Consulta Paciente por RG"
				+ "\n2 - Consulta Paciente por Nome" + "\n0 - Voltar Menu anterior");
		do {
			a = Console.scanChar("\nDigite uma opção do MENU Pacientes Lista: ");
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

	public static void medicamentoLista() {
		boolean a = true;
		while (a) {
			switch (medicamentoMenuLista()) {
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

	public static char medicamentoMenuLista() {
		char a = ' ';
		System.out.println("\n\nOpção 1 - Menu Medicamentos Lista"
				+ "\n------------------------------------------------------------"
				+ "\n1 - Consulta Medicamento por Codigo" + "\n2 - Consulta Medicamento por Nome"
				+ "\n0 - Voltar Menu anterior");
		do {
			a = Console.scanChar("\nDigite uma opção do MENU Medicamentos Lista: ");
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

