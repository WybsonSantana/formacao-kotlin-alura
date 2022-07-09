import java.text.SimpleDateFormat
import java.util.*

fun main() {
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

class Conta(
    val titular: String,
    val agencia: String = "0017",
    val numeroConta: String
) {

    var saldo = 0.0
        private set
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

    fun transferir(valor: Double, destino: Conta) {
        if (valor <= saldo) {
            this.saldo -= valor
            receberTransferencia(valor, destino)
            println("Transferindo %.2f da conta de ${this.titular} para ${destino.titular}".format(valor))
            println("Transferência realizada com sucesso!")
            println("Titular: ${this.titular}")
            println("Agência: ${this.agencia} | Número da conta: ${this.numeroConta}")
            println("Valor transferido: R$ %.2f".format(valor))
            println("Horário da transferência: ${this.horarioTransacao}")
            println("Saldo: R$ %.2f\n".format(this.saldo))
        } else {
            println("Transferindo %.2f da conta de ${this.titular} para ${destino.titular}".format(valor))
            println("Falha na transferência!\n")
        }
    }

    fun receberTransferencia(valor: Double, favorecido: Conta) {
        favorecido.saldo += valor
    }
}

fun testaCopiasEReferencias() {
    val x = 10
    var y = x
    y++
    println("X = $x\nY = $y")

    val contaFulano = Conta(
        titular = "Fulano de Tal",
        numeroConta = "1000"
    )
    val contaBeltrano = Conta(
        titular = "Beltrano da Silva",
        numeroConta = "1001"
    )

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
