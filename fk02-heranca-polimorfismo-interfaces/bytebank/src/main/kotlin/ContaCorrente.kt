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

    override val taxaSaque: Double
        get() = super.taxaSaque + 0.1
    override val taxaTransferencia: Double
        get() = super.taxaTransferencia + 1.9

    override fun sacar(valor: Double) {
        super.sacar(valor)
    }

    override fun transferir(valor: Double, destino: Conta) {
        super.transferir(valor, destino)
    }
}
