programa{
	//Esta solução apresenta o resultado formatado, utilizando a biblioteca Matemática
  
  //1. É necessário incluir a biblioteca no topo do código
	inclua biblioteca Matematica --> mat
	
	funcao inicio()
	{
		real salarioMinimo, salarioPessoa, quantidadeSalarios, quantidadeFormatada

		escreva("Valor do salário mínimo: R$ ")
		leia(salarioMinimo)

		escreva("Valor do salário da pessoa: R$ ")
		leia(salarioPessoa)

		quantidadeSalarios = salarioPessoa / salarioMinimo

		// 2. Usamos a função arredondar(valor, casas_decimais)
		quantidadeFormatada = mat.arredondar(quantidadeSalarios, 2)

		escreva("\n--- Resultado Formatado ---")
		escreva("\nVocê recebe o equivalente a ", quantidadeFormatada, " salários mínimos.")
	}
}
