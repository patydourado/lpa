package exercicios.java.string;
import java.util.Scanner;

/**
 * Exemplo introdutório sobre leitura de entrada, conversão prévia para letras minúsculas 
 * ou maiúsculas e comparação de Strings em Java.
 * <p>
 * Objetivo didático: demonstrar aos alunos do primeiro semestre como padronizar
 * textos digitados pelo usuário (ignorando diferenças entre maiúsculas e minúsculas)
 * e realizar comparações seguras de conteúdo utilizando o método {@code equals()}.
 * </p>
 *
 * @author Patrícia
 * @version 1.0
 */
public class ExCompararString {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Digite 'somar' ou 'subtrair':");

        // .trim() remove espaços extras
		String opcao = scanner.nextLine().trim(); 
		
		// Padronizando toda a entrada para minúsculo. Se o padrão for maiúsculo, use opcao.toUpperCase();
		String opcaoFormatada = opcao.toLowerCase();
		
		if (opcaoFormatada.equals("somar")) {
			System.out.println("Realizar a operação de soma");
		} else if (opcaoFormatada.equals("subtrair")) {
			System.out.println("Realizar a operação de subtração");
		} else {
			System.out.println("Opção inválida! Digite apenas 'somar' ou 'subtrair'.");
		}
		
		scanner.close();
	}
}