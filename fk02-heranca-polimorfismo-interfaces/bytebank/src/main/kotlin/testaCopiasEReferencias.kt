fun testaCopiasEReferencias() {
    val x = 10
    var y = x
    y++
    println("X = $x\nY = $y")

    val contaFulano = ContaPoupanca(
        titular = "Fulano de Tal",
        numeroConta = "1000"
    )
    val contaBeltrano = ContaPoupanca(
        titular = "Beltrano da Silva",
        numeroConta = "1001"
    )

    println("Titular da conta Fulano: ${contaFulano.titular}")
    println("Titular da conta Beltrano: ${contaBeltrano.titular}")

    println(contaFulano)
    println(contaBeltrano)
}