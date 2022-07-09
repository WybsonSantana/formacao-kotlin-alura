fun main() {
    println("Seja bem-vindo(a) ao ByteBank!\n")

    val funcionarioFulano = Funcionario(
        tipo = 2,
        nome = "Fulano de Tal",
        cpf = "123.456.789-09",
        email = "fulanodetal@bytebank.com.br",
        salario = 10000.0
    )

    println("Nome: ${funcionarioFulano.nome}")
    when (funcionarioFulano.tipo) {
        0 -> println("Cargo: Analista")
        1 -> println("Cargo: Gerente")
        else -> println("Cargo: Diretor")
    }
    funcionarioFulano.autenticar(1234)
    println("CPF: ${funcionarioFulano.cpf}")
    println("E-mail: ${funcionarioFulano.email}")
    println("Salário: R$ %.2f".format(funcionarioFulano.salario))
    println("Bonificação: R$ %.2f".format(funcionarioFulano.bonificacao()))
}