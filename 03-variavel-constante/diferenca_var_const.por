programa {
  funcao inicio() {
    //declaração da variável e constante
    const real TAXA_JUROS = 0.07
    real saldo = 1000
  
    saldo = 2000

    //A linha abaixo gera um erro, pois não é permitido alterar o valor de uma constante
    TAXA_JUROS = 0.09
  }
}
