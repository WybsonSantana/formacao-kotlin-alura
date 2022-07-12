package br.com.bytebank.modelo

class Cliente(
    val nome: String,
    val cpf: String,
    val email: String,
    private val senha: Int
) : Autenticavel {

    override fun autenticar(senha: Int): Boolean {
        return this.senha == senha
    }

}