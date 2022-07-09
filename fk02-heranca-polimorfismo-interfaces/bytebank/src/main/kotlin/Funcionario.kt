open class Funcionario(
    val nome: String,
    val cargo: String,
    val cpf: String,
    val email: String,
    val salario: Double
) {

    open fun bonificacao(): Double {
        return this.salario * 0.1
    }

}