class ContaPoupanca(
    titular: String,
    agencia: String = "0017",
    numeroConta: String,
    tipoDaConta: String = "Conta Poupança",
) : Conta(
    titular = titular,
    agencia = agencia,
    numeroConta = numeroConta,
    tipoDaConta = tipoDaConta,
)