class Diretor(
    nome: String,
    cargo: String,
    cpf: String,
    email: String,
    salario: Double,
    val plr: Double = salario * 1.5,
    val senha: Int
) : Funcionario(
    nome = nome,
    cargo = cargo,
    cpf = cpf,
    email = email,
    salario = salario
) {

    override fun bonificacao(): Double {
        return this.salario * 0.1 + this.salario + this.plr
    }

    fun autenticar(senha: Int) {
        if (this.senha == senha) {
            println("Autenticação realizada com sucesso!")
        } else {
            println("Falha na autenticação!")
        }
    }

}