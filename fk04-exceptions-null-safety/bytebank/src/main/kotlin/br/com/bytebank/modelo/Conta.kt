package br.com.bytebank.modelo

import br.com.bytebank.exception.SaldoInsuficienteException
import java.text.SimpleDateFormat
import java.util.*

abstract class Conta(
    val titular: Cliente,
    val agencia: String = "0017",
    val numeroConta: String,
    val tipoDaConta: String = "Conta",
) {

    var saldo = 0.0
        protected set
    val horarioTransacao = SimpleDateFormat("dd/MM/yyyy hh:mm:ss").format(Date())

    companion object Contador {
        var total = 0
            private set
    }

    init {
        println("Criando uma conta do tipo ${this.tipoDaConta}...")
        total++
    }

    fun depositar(valor: Double) {
        if (valor > 0) {
            this.saldo += valor
            println("Depositando R$ %.2f na conta de ${this.titular.nome}".format(valor))
            println("Depósito realizado com sucesso!")
            println("Titular: ${this.titular.nome}")
            println("Agência: ${this.agencia} | Número da conta: ${this.numeroConta}")
            println("Tipo da conta: ${this.tipoDaConta}")
            println("Valor depositado: R$ %.2f".format(valor))
            println("Horário do depósito: ${this.horarioTransacao}")
            println("Saldo: R$ %.2f\n".format(this.saldo))
        } else {
            println("Depositando R$ %.2f na conta de ${this.titular.nome}".format(valor))
            println("Desculpe! Algo deu errado e não conseguimos processar o seu depósito.\n")
        }
    }

    abstract fun sacar(valor: Double)

    abstract fun transferir(valor: Double, destino: Conta)

    fun receberTransferencia(valor: Double, favorecido: Conta) {
        favorecido.saldo += valor
    }
}

class ContaCorrente(
    titular: Cliente,
    agencia: String = "0017",
    numeroConta: String,
    tipoDaConta: String = "Conta Corrente",
) : Conta(
    titular = titular,
    agencia = agencia,
    numeroConta = numeroConta,
    tipoDaConta = tipoDaConta,
) {

    private val taxaSaque: Double = 0.1
    private val taxaTransferencia: Double = 1.9

    override fun sacar(valor: Double) {
        if (valor <= (saldo - taxaSaque)) {
            this.saldo = saldo - valor - taxaSaque
            println("Sacando R$ %.2f na conta de ${this.titular.nome}".format(valor))
            println("Saque realizado com sucesso!")
            println("Titular: ${this.titular.nome}")
            println("Agência: ${this.agencia} | Número da conta: ${this.numeroConta}")
            println("Tipo da conta: ${this.tipoDaConta}")
            println("Valor sacado: R$ %.2f".format(valor))
            if (taxaSaque > 0.0) {
                println("Taxa de operação: R$ %.2f".format(this.taxaSaque))
            }
            println("Horário do saque: ${this.horarioTransacao}")
            println("Saldo: R$ %.2f\n".format(this.saldo))
        } else {
            println("Sacando R$ %.2f na conta de ${this.titular.nome}".format(valor))
            throw SaldoInsuficienteException()
        }
    }

    override fun transferir(valor: Double, destino: Conta) {
        if (valor <= (saldo - taxaTransferencia)) {
            this.saldo = saldo - valor - taxaTransferencia
            receberTransferencia(valor, destino)
            println("Transferindo %.2f da conta de ${this.titular.nome} para ${destino.titular.nome}".format(valor))
            println("Transferência realizada com sucesso!")
            println("Titular: ${this.titular.nome}")
            println("Agência: ${this.agencia} | Número da conta: ${this.numeroConta}")
            println("Tipo da conta: ${this.tipoDaConta}")
            println("Valor transferido: R$ %.2f".format(valor))
            if (taxaTransferencia > 0.0) {
                println("Taxa de operação: R$ %.2f".format(this.taxaTransferencia))
            }
            println("Horário da transferência: ${this.horarioTransacao}")
            println("Saldo: R$ %.2f\n".format(this.saldo))
        } else {
            println("Transferindo %.2f da conta de ${this.titular.nome} para ${destino.titular.nome}".format(valor))
            throw SaldoInsuficienteException()
        }
    }
}

class ContaPoupanca(
    titular: Cliente,
    agencia: String = "0017",
    numeroConta: String,
    tipoDaConta: String = "Conta Poupança",
) : Conta(
    titular = titular,
    agencia = agencia,
    numeroConta = numeroConta,
    tipoDaConta = tipoDaConta,
) {

    override fun sacar(valor: Double) {
        if (valor <= saldo) {
            this.saldo -= valor
            println("Sacando R$ %.2f na conta de ${this.titular.nome}".format(valor))
            println("Saque realizado com sucesso!")
            println("Titular: ${this.titular.nome}")
            println("Agência: ${this.agencia} | Número da conta: ${this.numeroConta}")
            println("Tipo da conta: ${this.tipoDaConta}")
            println("Valor sacado: R$ %.2f".format(valor))
            println("Horário do saque: ${this.horarioTransacao}")
            println("Saldo: R$ %.2f\n".format(this.saldo))
        } else {
            println("Sacando R$ %.2f na conta de ${this.titular.nome}".format(valor))
            throw SaldoInsuficienteException()
        }
    }

    override fun transferir(valor: Double, destino: Conta) {
        if (valor <= saldo) {
            this.saldo -= valor
            receberTransferencia(valor, destino)
            println("Transferindo %.2f da conta de ${this.titular.nome} para ${destino.titular.nome}".format(valor))
            println("Transferência realizada com sucesso!")
            println("Titular: ${this.titular.nome}")
            println("Agência: ${this.agencia} | Número da conta: ${this.numeroConta}")
            println("Tipo da conta: ${this.tipoDaConta}")
            println("Valor transferido: R$ %.2f".format(valor))
            println("Horário da transferência: ${this.horarioTransacao}")
            println("Saldo: R$ %.2f\n".format(this.saldo))
        } else {
            println("Transferindo %.2f da conta de ${this.titular.nome} para ${destino.titular.nome}".format(valor))
            throw SaldoInsuficienteException()
        }
    }

}