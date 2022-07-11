package modelo

import java.text.SimpleDateFormat
import java.util.*

abstract class Conta(
    val titular: String,
    val agencia: String = "0017",
    val numeroConta: String,
    val tipoDaConta: String = "modelo.Conta",
) {

    var saldo = 0.0
        protected set
    val horarioTransacao = SimpleDateFormat("dd/MM/yyyy hh:mm:ss").format(Date())

    fun depositar(valor: Double) {
        if (valor > 0) {
            this.saldo += valor
            println("Depositando R$ %.2f na conta de ${this.titular}".format(valor))
            println("Depósito realizado com sucesso!")
            println("Titular: ${this.titular}")
            println("Agência: ${this.agencia} | Número da conta: ${this.numeroConta}")
            println("Tipo da conta: ${this.tipoDaConta}")
            println("Valor depositado: R$ %.2f".format(valor))
            println("Horário do depósito: ${this.horarioTransacao}")
            println("Saldo: R$ %.2f\n".format(this.saldo))
        } else {
            println("Depositando R$ %.2f na conta de ${this.titular}".format(valor))
            println("Desculpe! Algo deu errado e não conseguimos processar o seu depósito.\n")
        }
    }

    abstract fun sacar(valor: Double)

    abstract fun transferir(valor: Double, destino: Conta)

    fun receberTransferencia(valor: Double, favorecido: Conta) {
        favorecido.saldo += valor
    }
}
