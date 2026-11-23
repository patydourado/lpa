package exercicios.java.string;
import java.util.Scanner;

/**
 * Demonstra a comparação de Strings ignorando a diferenciação entre maiúsculas e minúsculas.
 * <p>
 * Esta classe apresenta uma abordagem mais concisa para validar entradas de texto
 * do usuário via console utilizando o método {@link String#equalsIgnoreCase(String)},
 * dispensando a conversão prévia de caracteres.
 * </p>
 *
 * @author Patrícia
 * @version 1.0
 */
public class ExCompararStringIgnoreCase {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("Digite 'somar' ou 'subtrair':");
		String opcao = scanner.nextLine().trim(); 

		if (opcao.equalsIgnoreCase("somar")) {
			System.out.println("Realizar a operação de soma");
		} else if (opcao.equalsIgnoreCase("subtrair")) {
			System.out.println("Realizar a operação de subtração");
		} else {
			System.out.println("Opção inválida! Digite apenas 'somar' ou 'subtrair'.");
		}

		scanner.close();
	}
}