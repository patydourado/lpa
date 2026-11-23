package exemplos;
public class FatorialRecursivo {

	public static void main(String[] args) {
		int numero = 5;
		long resultado = calcularFatorialRecursivo(numero);

		if (resultado == -1) {
			System.out.println("Erro: Não existe fatorial de número negativo.");
		} else {
			System.out.println("O fatorial de " + numero + " é: " + resultado);
		}
	}

	public static long calcularFatorialRecursivo(int numero) {
		long fatorial;

		// 1. VALIDAÇÃO:Evita que o programa aceite números negativos
		if (numero < 0) {
			return -1;
		
		//CASO BASE (Condição de Parada)
		} else if (numero == 0) {
			
			return 1;
		}

		return fatorial = numero * calcularFatorialRecursivo(numero - 1);

	}
}
