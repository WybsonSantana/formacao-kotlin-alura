class Gerente(
    nome: String,
    cargo: String,
    cpf: String,
    email: String,
    salario: Double,
    val senha: Int
) : Funcionario(
    nome = nome,
    cargo = cargo,
    cpf = cpf,
    email = email,
    salario = salario
) {

    override fun bonificacao(): Double {
        return this.salario * 0.1 + this.salario
    }

    fun autenticar(senha: Int) {
        if (this.senha == senha) {
            println("Autenticação realizada com sucesso!")
        } else {
            println("Falha na autenticação!")
        }
    }
}