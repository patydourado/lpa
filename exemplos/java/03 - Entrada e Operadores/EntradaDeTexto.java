package exemplos;

import java.util.Scanner;

public class EntradaDeTexto {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		String primeiroNome;
		String sobrenome;
		
		System.out.println("Insira seu nome completo");
		primeiroNome = scan.next();
		sobrenome = scan.nextLine();
		
		System.out.println("Primeiro nome: " + primeiroNome);
		System.out.print("Sobrenome: " + sobrenome);
		
		scan.close();
	}
}
