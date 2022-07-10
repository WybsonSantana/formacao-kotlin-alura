abstract class Funcionario(
    val nome: String,
    val cargo: String,
    val cpf: String,
    val email: String,
    val salario: Double
) {

    abstract fun bonificacao(): Double
}