class Gerente(
    nome: String,
    cargo: String,
    cpf: String,
    email: String,
    salario: Double,
    senha: Int
) : FuncionarioAdmin(
    nome = nome,
    cargo = cargo,
    cpf = cpf,
    email = email,
    salario = salario,
    senha = senha
) {

    override fun bonificacao(): Double {
        return this.salario * 0.1 + this.salario
    }

    override fun autenticar(senha: Int): Boolean {
        if (this.senha == senha) {
            return true
        } else {
            return false
        }
    }
}