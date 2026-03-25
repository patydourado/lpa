package lpa;

public class NumeroFormatado {
  public static void main(String[] args) {
		double numA = 5.44345;
			    
		System.out.printf("O número %.2f foi formatado com duas casas decimais. \n", numA);
		System.out.printf("O número %.1f foi formatado com uma casa decimal. \n", numA);
		System.out.printf("O número %.0f foi formatado sem casa decimal.", numA);
		
	}
}
