package br.com.bytebank.modelo

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
            println("Saldo insuficiente!\n")
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
            println("Falha na transferência!\n")
        }
    }

}