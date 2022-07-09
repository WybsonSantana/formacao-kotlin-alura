class Gerente(
    val nome: String,
    val cargo: String = "Gerente",
    val cpf: String,
    val email: String,
    val salario: Double,
    val senha: Int
) {

    fun bonificacao(): Double {
        return this.salario * 0.2
    }

    fun autenticar(senha: Int) {
        if (this.senha == senha) {
            println("Autenticação realizada com sucesso!")
        } else {
            println("Falha na autenticação!")
        }
    }
}