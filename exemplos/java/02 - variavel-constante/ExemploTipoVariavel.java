package exemplos;

/**
 * Classe que demonstra a declaração de variáveis
 * com tipos primitivos e String.
 * Exemplifica distinção de atribuição do tipo float e 
 * double e realiza comando de saída de dados, utilizando
 * a concatenação.
 * 
 * @author patricia.almeida
 *
 */
public class ExemploTipoVariavel {

	public static void main(String[] args) {
		//Declaração de variáveis
		int idade, numCasa;
		float pesoCorporal;
		double salario;
		char sexo;
		String nome;
		
		//Atribuição
		idade = 20;
		numCasa = 4;
		
		pesoCorporal = 60.8f;
		salario = 2000.5;
		
		sexo = 'm';
		nome = "Fábio";
		
		//Saída
		System.out.println(nome + "é do sexo " + sexo + " pesa " + pesoCorporal + " Kg");
		System.out.println(nome + "mora da casa de nº " + numCasa + "e ganha"
				+ "R$ " +salario);
	}
}
