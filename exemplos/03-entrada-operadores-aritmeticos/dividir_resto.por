programa{
  //Programa que calcula quantos doces "sobram" após enchermos caixas que comportam exatamente 10 unidades cada.
	funcao inicio(){
		// Usamos 'inteiro' porque o resto de divisão geralmente 
		// é aplicado em contextos de contagem exata.
		inteiro totalDoces, caixasCompletas, sobra

		escreva("Digite o total de doces produzidos: ")
		leia(totalDoces)

		// A divisão inteira (/) descarta os decimais
		caixasCompletas = totalDoces / 10

		// O operador % pega APENAS o que restou da divisão acima
		sobra = totalDoces % 10

		escreva("\n--- Relatório de Produção ---")
		escreva("\nTotal de caixas fechadas (com 10 unidades): ", caixasCompletas)
		escreva("\nQuantidade de doces que sobraram: ", sobra)
	}
}
