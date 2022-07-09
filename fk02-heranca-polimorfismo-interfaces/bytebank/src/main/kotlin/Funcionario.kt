class Funcionario(
    val nome: String,
    val cargo: String = "Analista",
    val cpf: String,
    val email: String,
    val salario: Double
) {

    fun bonificacao(): Double {
        return this.salario * 0.1
    }

}