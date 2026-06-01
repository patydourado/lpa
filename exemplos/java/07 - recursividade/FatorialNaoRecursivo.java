package exemplos;

public class FatorialNaoRecursivo {
	
	public static void main(String[] args) {
		int numero = 5;
		long resultado = calcularFatorial(numero);

		
		if (resultado == -1) {
			System.out.println("Erro: Não existe fatorial de número negativo.");
		} else {
			System.out.println("O fatorial de " + numero + " é: " + resultado);
		}
	}

	public static long calcularFatorial(int numero) {
		
		if (numero < 0) {
			return -1;
		}

		long fatorial = 1;

		for (int i = numero; i >1 ; i--) {
			fatorial = fatorial * i; // Ou: fatorial *= i;
		}

		return fatorial;
	}
}
