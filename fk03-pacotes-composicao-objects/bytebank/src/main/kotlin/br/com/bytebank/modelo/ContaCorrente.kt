package br.com.bytebank.modelo

class ContaCorrente(
    titular: String,
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

    override fun transferir(valor: Double, destino: Conta) {
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
}
