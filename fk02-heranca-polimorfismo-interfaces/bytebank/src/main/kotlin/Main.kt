fun main() {
    println("Seja bem-vindo(a) ao ByteBank!\n")

    val funcionarioFulano = Funcionario(
        nome = "Fulano de Tal",
        cpf = "123.456.789-09",
        email = "fulanodetal@bytebank.com.br",
        salario = 5000.0
    )

    println("Nome: ${funcionarioFulano.nome}")
    println("Cargo: ${funcionarioFulano.cargo}")
    println("CPF: ${funcionarioFulano.cpf}")
    println("E-mail: ${funcionarioFulano.email}")
    println("Salário: R$ %.2f".format(funcionarioFulano.salario))
    println("Bonificação: R$ %.2f\n".format(funcionarioFulano.bonificacao()))

    val gerenteBeltrano = Gerente(
        nome = "Beltrano da Silva",
        cpf = "930.133.220-55",
        email = "beltranodasilva@bytebank.com.br",
        salario = 10000.0,
        senha = 2749
    )

    println("Nome: ${gerenteBeltrano.nome}")
    println("Cargo: ${gerenteBeltrano.cargo}")
    println("CPF: ${gerenteBeltrano.cpf}")
    println("E-mail: ${gerenteBeltrano.email}")
    println("Salário: R$ %.2f".format(gerenteBeltrano.salario))
    println("Bonificação: R$ %.2f".format(gerenteBeltrano.bonificacao()))
    gerenteBeltrano.autenticar(2749)
}