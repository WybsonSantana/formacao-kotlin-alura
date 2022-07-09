fun main() {
    println("Seja bem-vindo(a) ao ByteBank!\n")

    val funcionarioFulano = Funcionario(
        nome = "Fulano de Tal",
        cpf = "123.456.789-09",
        email = "fulanodetal@bytebank.com.br",
        salario = 5000.0
    )

    println("Nome: ${funcionarioFulano.nome}")
    println("CPF: ${funcionarioFulano.cpf}")
    println("E-mail: ${funcionarioFulano.email}")
    println("Salário: R$ %.2f".format(funcionarioFulano.salario))
    println("Bonificação: R$ %.2f".format(funcionarioFulano.bonificacao()))
}