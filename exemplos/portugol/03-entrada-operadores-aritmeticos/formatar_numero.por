programa {
  //Para formatar uma variável numérica, inclua a biblioteca conforme a linha abaixo, e indique o seu "apelido" para facilitar a chama aos recursos disponíveis
  inclua biblioteca Matematica --> mat
  funcao inicio() {
    real numArredondado, numA = 5.449
    
    //Instrução para arredondar: mat.arredondar(nomeDaVariável, quantCasasDecimais)
    numArredondado = mat.arredondar(numA, 2)
    escreva("Número: ", numA, "\n")
		escreva("Número Formatado: ", numArredondado)
  }
}
