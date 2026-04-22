package exemplos;

import java.util.Scanner;

public class RepExemploWhile {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Digite um nº");
		int n = scan.nextInt();
		int cont=1;
		
		while(cont<=n) {
			System.out.println(cont);
			cont = cont+1;
		}
    
		scan.close();
	}
}
