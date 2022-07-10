fun testaAutenticacao() {
    val clienteMorgano = Cliente(
        nome = "Morgano das Sombras",
        cpf = "570.060.110-94",
        email = "morganodassombras@mail.com.br",
        senha = 2142
    )

    val gerenteBeltrano = Gerente(
        nome = "Beltrano da Silva",
        cargo = "Gerente",
        cpf = "930.133.220-55",
        email = "beltranodasilva@bytebank.com.br",
        salario = 10000.0,
        senha = 2749
    )

    val diretorCiclano = Diretor(
        nome = "Ciclano do Ramo",
        cargo = "Diretor",
        cpf = "380.157.620-57",
        email = "ciclanodoramo@bytebank.com.br",
        salario = 20000.0,
        senha = 3264
    )

    val sistemaInterno = SistemaInterno()

    sistemaInterno.logar(clienteMorgano, 2142)
    sistemaInterno.logar(gerenteBeltrano, 2749)
    sistemaInterno.logar(diretorCiclano, 3264)

}