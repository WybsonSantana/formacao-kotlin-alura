fun main() {
    println("Bem-vindo(a) ao ByteBank!\n")

    val titular: String = "Fulano de Tal"
    val agencia: String = "0017"
    val numeroConta: String = "1000"
    var saldo: Double = 0.0

    saldo = 150 + 2.49
    saldo += 200

    println("Titular: $titular")
    println("Agência: $agencia")
    println("Número da conta: $numeroConta")
    println("Saldo: R$ %.2f".format(saldo))
}
