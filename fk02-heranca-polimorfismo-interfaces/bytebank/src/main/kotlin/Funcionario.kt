class Funcionario(
    val tipo: Int, // 0: analista, 1: gerente, 2: diretor
    val nome: String,
    val cpf: String,
    val email: String,
    val salario: Double
) {

    fun bonificacao(): Double {
        return when (this.tipo) {
            0 -> this.salario * 0.1
            1 -> this.salario * 0.2
            else -> this.salario * 0.3
        }
    }

    fun autenticar(senha: Int) {
        if (this.tipo == 1 || this.tipo == 2) {
            println("Pode autenticar")
        } else {
            println("Não pode autenticar")
        }
    }
}