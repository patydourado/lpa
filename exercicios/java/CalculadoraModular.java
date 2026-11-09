package exercicios.java.modularizacao;

import java.util.Scanner;

/**
 *  Classe que demonstra o uso de métodos com ou sem retorno.
 *  Métodos com retorno: somar e subtrair.
 *  Métodos sem retorno: multiplicar e dividir
 * 
 * @patydourado
 **/
public class CalculadoraModular {

	public static void exibirMenu() {
		System.out.println("\n--- MENU DE OPERAÇÕES ---");
		System.out.println("1 - Somar");
		System.out.println("2 - Subtrair");
		System.out.println("3 - Multiplicar");
		System.out.println("4 - Dividir");
		System.out.print("Escolha uma opção: ");
	}

	public static double somar(double a, double b) {
        double resultado = a + b;
        return resultado;
	}

    public static double subtrair(double a, double b) {
        double resultado = a - b;
        return resultado;
    }

    public static void multiplicar(double a, double b) {
        double resultado = a * b;
        System.out.printf("Resultado da Multiplicação: %.2f%n", resultado);
    }

    public static void dividir(double a, double b) {
        if (b == 0) {
            System.out.println("Erro: Divisão por zero não é permitida.");
        } else {
            double resultado = a / b;
            System.out.printf("Resultado da Divisão: %.2f%n", resultado);
        }
    }

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.print("Digite o primeiro número: ");
        double num1 = teclado.nextDouble();

        System.out.print("Digite o segundo número: ");
        double num2 = teclado.nextDouble();

        exibirMenu();
        int opcao = teclado.nextInt();
        double resultado;
        switch (opcao) {
            case 1:
                resultado = somar(num1, num2);
                System.out.printf("Resultado da Soma: %.2f%n", resultado);
                break;
            case 2:
                resultado = subtrair(num1, num2);
                System.out.printf("Resultado da Subtração: %.2f%n", resultado);
                break;
            case 3:
                multiplicar(num1, num2);
                break;
            case 4:
                dividir(num1, num2);
                break;
            default:
                System.out.println("Opção inválida!");
                break;
        }

        teclado.close();
    }
}