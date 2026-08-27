programa{
	funcao inicio(){
		inteiro contador = 5

		escreva("--- INCREMENTO E DECREMENTO ---\n")
		escreva("Valor inicial: ", contador, "\n") // Exibe: 5

		// Incremento: equivale a (contador = contador + 1)
		contador++
		escreva("Após contador++ : ", contador, "\n") // Exibe: 6

		// Decremento: equivale a (contador = contador - 1)
		contador--
		escreva("Após contador-- : ", contador, "\n") // Exibe: 5
	}
}
