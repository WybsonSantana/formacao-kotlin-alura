fun testaComportamentosConta() {
    println("Bem-vindo(a) ao ByteBank!\n")

    val contaFulano = Conta(
        titular = "Fulano de Tal",
        numeroConta = "1000"
    )
    contaFulano.depositar(300.0)

    val contaBeltrano = Conta(
        titular = "Beltrano da Silva",
        numeroConta = "1001"
    )
    contaBeltrano.depositar(200.0)

    contaFulano.depositar(-250.0)
    contaBeltrano.depositar(400.0)

    contaFulano.sacar(300.0)
    contaBeltrano.sacar(700.0)

    contaFulano.transferir(150.0, contaBeltrano)
    contaBeltrano.transferir(450.0, contaFulano)
}