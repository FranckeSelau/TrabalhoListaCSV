package menu;

import estruturaDeDados.Console;

public class Menu {

	public static void menuInicial() {
		while (true) {
			switch (menu()) {
			case '1':
				MenuVetor.menuInicialVetor();
				break;
			case '2':
				MenuLista.menuInicialLista();
				break;
			case '0':
				MenuVetor.sair();
				break;
			}
		}
	}

	public static char menu() {
		char a = ' ';
		System.out.println("\nMENU INICIAL" + "\n------------------------------------------------------------"
				+ "\n1 - Consulta Vetor" + "\n2 - Consulta Lista" + "\n0 - Sair");
		do {
			a = Console.scanChar("\nDigite a opção do MENU: ");
			if (a != '1' && a != '2' && a != '0')
				System.err.println("ERRO! - Digite uma opção válida!");
		} while (a != '1' && a != '2' && a != '0');
		return a;
	}
}
