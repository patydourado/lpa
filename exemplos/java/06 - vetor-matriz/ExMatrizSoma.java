package exemplos;
import java.util.Random;
import java.util.Scanner;

/**
 * 
 * @author patricia.almeida
 * 
 * Exemplo de classe que trabalha com a técnica de modularização
 * para preencher duas matrizes com números aleatórios, utilizando a
 * classe Random.
 * Além do preenchimento, realiza a soma das matrizes e possui um método
 * que permite a visualização de qualquer matriz.
 */
public class ExMatrizSoma {
	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		System.out.println("Informe o tamanho da matriz desejada");
		int linha = teclado.nextInt();
		int coluna = teclado.nextInt();
		
		int matriz1[][] = new int[linha][coluna];
		int matriz2[][] = new int[linha][coluna];
		int matrizSoma[][] = new int[linha][coluna];
		
		preencherMatriz(matriz1);
		System.out.println("|********Matriz 1**********|");
		imprimirMatriz(matriz1);
		preencherMatriz(matriz2);
		System.out.println("|********Matriz 2**********|");
		imprimirMatriz(matriz2);
		somarMatrizes(matriz1, matriz2, matrizSoma);
		System.out.println("|********Soma**********|");
		imprimirMatriz(matrizSoma);
		
		teclado.close();
		
	}
	
	public static void imprimirMatriz(int[][] matriz) {
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[i].length; j++) {
				System.out.print(matriz[i][j] + " ");
			}
			System.out.println();
		}
	}
	
	public static void preencherMatriz(int[][] matriz) {
		Random gerador = new Random();
		
		for(int i=0; i<matriz.length;i++) {
			for(int j=0; j<matriz[i].length;j++) {
				matriz[i][j]= gerador.nextInt(100);
			}
		}
	}
	
	public static void somarMatrizes(int[][] m1,int[][] m2, int[][] soma ) {
		for (int i = 0; i < soma.length; i++) {
			for (int j = 0; j < soma[i].length; j++) {
				soma[i][j] = m1[i][j] + m2[i][j];
			}
		}
		
	}
}
