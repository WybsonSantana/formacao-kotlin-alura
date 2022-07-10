abstract class FuncionarioAdmin(
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

    abstract override fun bonificacao(): Double

    abstract fun autenticar(senha: Int): Boolean

}