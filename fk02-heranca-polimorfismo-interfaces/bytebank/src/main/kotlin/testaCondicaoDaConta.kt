fun testaCondicaoDaConta(saldo: Double) {
    when {
        saldo > 0.0 -> println("Seu saldo está positivo!")
        saldo < 0.0 -> println("Seu saldo está negativo!")
        else -> println("Seu saldo está zerado!")
    }

    if (saldo > 0.0) {
        println("Querendo fazer aquela viagem com a família? A gente te ajuda!\n")
    } else if (saldo < 0.0) {
        println("As contas apertaram este mês? A gente tem o crédito ideal para você!\n")
    } else {
        println("Precisando de uma graninha extra? Fale com a gente!\n")
    }
}