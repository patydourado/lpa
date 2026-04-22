package projetoaula;

import java.util.Scanner;

public class ExSwitch {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int anos;
		anos = scan.nextInt();
		switch (anos) {
		case 1:
			System.out.println("Bodas de Papel");
			break;
		case 10:
			System.out.println("Bodas de Estanho");
			break;
		case 20:
			System.out.println("Bodas de Porcelana");
			break;
		case 30:
			System.out.println("Bodas de Pérola");
			break;
		case 40:
			System.out.println("Bodas de Esmeralda");
			break;
		case 50:
			System.out.println("Bodas de Ouro");
			break;
		default:
			System.out.println("Não sabemos informar");
			break;
		}

		scan.close();
	}
}
