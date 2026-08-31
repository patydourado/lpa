programa
{
  // Obs: Paara visualizar a saída correta, de acordo com as explicações comentadas, execute o código na versão Desktop do Portugol Studio.
  // A versão web está apresentando, na presente data, um tratamento da saída do resultado.
	funcao inicio()
	{
		// 1. Divisão Inteira (Inteiro por Inteiro)
		// O resultado é TRUNCADO (a parte decimal é descartada, não arredondada)
		inteiro num1 = 10
		inteiro num2 = 3
		real resultado1 = num1 / num2 // Resultado: 3.0
		
		// 2. Divisão Real (pelo menos um operando é Real)
		// O Portugol preserva as casas decimais
		real num3 = 10.0
		inteiro num4 = 3
		real resultado2 = num3 / num4 // Resultado: 3.33333333335
		
		// Exibindo os resultados
		escreva("--- OPERADOR DE DIVISÃO ---\n")
		escreva("10 / 3 (Inteiro por Inteiro) = ", resultado1, "\n")
		escreva("10.0 / 3 (Real por Inteiro)   = ", resultado2, "\n\n")
	}
}
