package exemplo;

import java.util.Scanner;

public class MetodoComRetorno {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner (System.in);
		
		System.out.println("Informe dois números:");
		double num1 = scan.nextDouble();
		double num2 = scan.nextDouble();
		double result;
		
		System.out.println("Escolha a operação:");
		System.out.println("1 - Somar");
		System.out.println("2 - Subtrair");
		int opcao = scan.nextInt();
		
		if(opcao==1) {
			result = somar(num1,num2);
			System.out.println("Soma: " + result);
		}else if(opcao==2){
			result = subtrair(num1,num2);
			System.out.println("Subtração: " + result);
		}else {
			System.out.println("Opção Inválida. Tente novamente");
		}
		
		scan.close();
	}
	
	public static double somar(double n1, double n2) {
		 double resultado = n1+n2;
		 return resultado;
	}
	
	public static double subtrair(double n1, double n2) {
		return n1-n2;
	}

}
