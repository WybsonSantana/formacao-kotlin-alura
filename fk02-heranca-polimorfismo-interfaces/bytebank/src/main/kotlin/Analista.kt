class Analista(
    nome: String,
    cargo: String,
    cpf: String,
    email: String,
    salario: Double
) : Funcionario(
    nome = nome,
    cargo = cargo,
    cpf = cpf,
    email = email,
    salario = salario
) {

    override fun bonificacao(): Double {
        return super.bonificacao() + this.salario * 0.1
    }
}