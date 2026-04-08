package exemplos;

public class DifariavelConstante {

	public static void main(String[] args) {
    
		final double TAXA_JUROS = 0.07;
		double saldo = 1000;
			  
		saldo = 2000;

		//A linha abaixo gera um erro, pois não é permitido alterar o valor de um valor fixo
		TAXA_JUROS = 0.09;

	}

}
