package br.com.bytebank.teste

fun testaLacos() {
    println("Bem-vindo(a) ao ByteBank!\n")

    val titular: String = "Fulano de Tal"
    val agencia: String = "0017"
    val numeroConta: String = "1000"
    var saldo: Double = 0.0

    saldo = 100.0
    saldo -= 250.0

    println("Titular: $titular")
    println("Agência: $agencia | Número da conta: ${numeroConta.toInt()}")
    println("Saldo da conta: R$ %.2f".format(saldo))
    testaCondicaoDaConta(saldo)

    for (i in 1..5) {
        saldo += 10 * i
        println("Titular: $titular $i")
        println("Agência: $agencia | Número da conta: ${numeroConta.toInt() + i}")
        println("Saldo da conta: R$ %.2f".format(saldo))
        testaCondicaoDaConta(saldo)
    }

    var i = 6
    while (i <= 10) {
        saldo += 10 * i
        println("Titular: $titular $i")
        println("Agência: $agencia | Número da conta: ${numeroConta.toInt() + i}")
        println("Saldo da conta: R$ %.2f".format(saldo))
        testaCondicaoDaConta(saldo)
        i++
    }
}