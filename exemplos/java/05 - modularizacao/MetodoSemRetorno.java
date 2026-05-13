package exemplos;

import java.util.Scanner;

public class MetodoSemRetorno {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner (System.in);
		
		System.out.println("Informe dois números:");
		double num1 = scan.nextDouble();
		double num2 = scan.nextDouble();
		
		//Apresentar um menu
		System.out.println("Escolha a operação:");
		System.out.println("1 - Somar");
		System.out.println("2 - Subtrair");
		int opcao = scan.nextInt();
		
		if(opcao==1) {
			somar(num1,num2);
		}else if(opcao==2){
			subtrair(num1,num2);
		}else {
			System.out.println("Opção Inválida. Tente novamente");
		}
		
		scan.close();
	}
	
	public static void somar(double n1, double n2) {
		System.out.println("Soma: " + (n1+n2));
	}
	
	public static void subtrair(double n1, double n2) {
		System.out.println("Subtração: " + (n1-n2));
	}

}
