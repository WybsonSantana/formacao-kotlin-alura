fun main() {
    println("Bem-vindo(a) ao ByteBank!\n")

    val titular: String = "Fulano de Tal"
    val agencia: String = "0017"
    val numeroConta: String = "1000"
    var saldo: Double = 0.0

    saldo = 100 + 2.49
    saldo -= 136.89

    println("Titular: $titular")
    println("Agência: $agencia")
    println("Número da conta: $numeroConta")

    when {
        saldo > 0.0 -> println("Seu saldo está positivo!\nSaldo da conta: R$ %.2f".format(saldo))
        saldo < 0.0 -> println("Seu saldo está negativo!\nSaldo da conta: R$ %.2f".format(saldo))
        else -> println("Seu saldo está zerado!\nSaldo da conta: R$ %.2f".format(saldo))
    }

    if (saldo > 0.0) {
        println("Querendo fazer aquela viagem com a família? A gente te ajuda!")
    } else if (saldo < 0.0) {
        println("As contas apertaram este mês? A gente tem o crédito ideal para você!")
    } else {
        println("Precisando de uma graninha extra? Fale com a gente!")
    }
}
