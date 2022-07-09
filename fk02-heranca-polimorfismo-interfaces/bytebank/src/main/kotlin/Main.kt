fun main() {
    println("Seja bem-vindo(a) ao ByteBank!\n")

    val funcionarioFulano = Funcionario(
        nome = "Fulano de Tal",
        cargo = "Analista",
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
        cargo = "Gerente",
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

    val diretorCiclano = Diretor(
        nome = "Ciclano do Ramo",
        cargo = "Diretor",
        cpf = "380.157.620-57",
        email = "ciclanodoramo@bytebank.com.br",
        salario = 20000.0,
        senha = 3264
    )

    println("\nNome: ${diretorCiclano.nome}")
    println("Cargo: ${diretorCiclano.cargo}")
    println("CPF: ${diretorCiclano.cpf}")
    println("E-mail: ${diretorCiclano.email}")
    println("Salário: R$ %.2f".format(diretorCiclano.salario))
    println("Bonificação: R$ %.2f".format(diretorCiclano.bonificacao()))
    diretorCiclano.autenticar(3264)
}