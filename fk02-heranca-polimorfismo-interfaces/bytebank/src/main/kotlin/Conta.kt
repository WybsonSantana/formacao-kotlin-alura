import java.text.SimpleDateFormat
import java.util.*

open class Conta(
    val titular: String,
    val agencia: String = "0017",
    val numeroConta: String,
    val tipoDaConta: String = "Conta",
) {

    var saldo = 0.0
        private set
    open val taxaSaque: Double = 0.0
    open val taxaTransferencia: Double = 0.0
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

    open fun sacar(valor: Double) {
        if (valor <= (saldo - taxaSaque)) {
            this.saldo = saldo - valor - taxaSaque
            println("Sacando R$ %.2f na conta de ${this.titular}".format(valor))
            println("Saque realizado com sucesso!")
            println("Titular: ${this.titular}")
            println("Agência: ${this.agencia} | Número da conta: ${this.numeroConta}")
            println("Tipo da conta: ${this.tipoDaConta}")
            println("Valor sacado: R$ %.2f".format(valor))
            if (taxaSaque > 0.0) {
                println("Taxa de operação: R$ %.2f".format(this.taxaSaque))
            }
            println("Horário do saque: ${this.horarioTransacao}")
            println("Saldo: R$ %.2f\n".format(this.saldo))
        } else {
            println("Sacando R$ %.2f na conta de ${this.titular}".format(valor))
            println("Saldo insuficiente!\n")
        }
    }

    open fun transferir(valor: Double, destino: Conta) {
        if (valor <= (saldo - taxaTransferencia)) {
            this.saldo = saldo - valor - taxaTransferencia
            receberTransferencia(valor, destino)
            println("Transferindo %.2f da conta de ${this.titular} para ${destino.titular}".format(valor))
            println("Transferência realizada com sucesso!")
            println("Titular: ${this.titular}")
            println("Agência: ${this.agencia} | Número da conta: ${this.numeroConta}")
            println("Tipo da conta: ${this.tipoDaConta}")
            println("Valor transferido: R$ %.2f".format(valor))
            if (taxaTransferencia > 0.0) {
                println("Taxa de operação: R$ %.2f".format(this.taxaTransferencia))
            }
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
