package modelo

class Diretor(
    nome: String,
    cargo: String,
    cpf: String,
    email: String,
    salario: Double,
    senha: Int,
    val plr: Double = salario * 1.5
) : FuncionarioAdmin(
    nome = nome,
    cargo = cargo,
    cpf = cpf,
    email = email,
    salario = salario,
    senha = senha
) {

    override fun bonificacao(): Double {
        return this.salario * 0.1 + this.salario + this.plr
    }

}