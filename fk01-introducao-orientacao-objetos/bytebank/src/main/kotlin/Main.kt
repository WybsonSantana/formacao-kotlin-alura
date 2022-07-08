import java.text.SimpleDateFormat
import java.util.*

fun main() {
    println("Bem-vindo(a) ao ByteBank!\n")

    val contaFulano = Conta()
    contaFulano.titular = "Fulano de Tal"
    contaFulano.numeroConta = "1000"
    contaFulano.saldo = 250.49

    val contaBeltrano = Conta()
    contaBeltrano.titular = "Beltrano da Silva"
    contaBeltrano.numeroConta = "1001"
    contaBeltrano.saldo = -159.0

    println("Titular: ${contaFulano.titular}")
    println("Agência: ${contaFulano.agencia} | Número da conta: ${contaFulano.numeroConta}")
    println("Saldo: R$ %.2f\n".format(contaFulano.saldo))

    println("Titular: ${contaBeltrano.titular}")
    println("Agência: ${contaBeltrano.agencia} | Número da conta: ${contaBeltrano.numeroConta}")
    println("Saldo: R$ %.2f\n".format(contaBeltrano.saldo))

    contaFulano.depositar(-250.0)
    contaBeltrano.depositar(400.0)

    contaFulano.sacar(100.0)
    contaBeltrano.sacar(500.0)
}

class Conta {
    var titular = ""
    val agencia = "0017"
    var numeroConta = ""
    var saldo = 0.0
    val horarioTransacao = SimpleDateFormat("dd/MM/yyyy hh:mm:ss").format(Date())

    fun depositar(valor: Double) {
        if (valor > 0) {
            this.saldo += valor
            println("Depositando R$ %.2f na conta de ${this.titular}".format(valor))
            println("Depósito realizado com sucesso!")
            println("Titular: ${this.titular}")
            println("Agência: ${this.agencia} | Número da conta: ${this.numeroConta}")
            println("Valor depositado: R$ %.2f".format(valor))
            println("Horário do depósito: ${this.horarioTransacao}")
            println("Saldo: R$ %.2f\n".format(this.saldo))
        } else {
            println("Depositando R$ %.2f na conta de ${this.titular}".format(valor))
            println("Desculpe! Algo deu errado e não conseguimos processar o seu depósito.\n")
        }
    }

    fun sacar(valor: Double) {
        if (valor <= saldo) {
            this.saldo -= valor
            println("Sacando R$ %.2f na conta de ${this.titular}".format(valor))
            println("Saque realizado com sucesso!")
            println("Titular: ${this.titular}")
            println("Agência: ${this.agencia} | Número da conta: ${this.numeroConta}")
            println("Valor sacado: R$ %.2f".format(valor))
            println("Horário do saque: ${this.horarioTransacao}")
            println("Saldo: R$ %.2f\n".format(this.saldo))
        } else {
            println("Sacando R$ %.2f na conta de ${this.titular}".format(valor))
            println("Saldo insuficiente!\n")
        }
    }
}

fun testaCopiasEReferencias() {
    val x = 10
    var y = x
    y++
    println("X = $x\nY = $y")

    val contaFulano = Conta()
    contaFulano.titular = "Fulano de Tal"
    val contaBeltrano = Conta()
    contaBeltrano.titular = "Beltrano da Silva"
    contaFulano.titular = "Fulano de Tal"

    println("Titular da conta Fulano: ${contaFulano.titular}")
    println("Titular da conta Beltrano: ${contaBeltrano.titular}")

    println(contaFulano)
    println(contaBeltrano)
}

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