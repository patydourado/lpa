programa
{ 
	funcao inicio ()
	{ 	
		inteiro idade
		cadeia nome
		
		escreva("Informe seu nome: ")
		leia(nome)

		escreva("Informe sua idade: ")
		leia(idade)
	
		se (idade < 18){
			escreva(nome, " você é menor de idade.")
		}senao{
			escreva(nome, " você é maior de idade.")
		}

	} 
}
