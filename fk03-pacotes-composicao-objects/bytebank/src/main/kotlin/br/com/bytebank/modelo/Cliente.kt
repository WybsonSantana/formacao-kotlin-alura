package br.com.bytebank.modelo

class Cliente(
    val nome: String,
    val cpf: String,
    val email: String,
    private val senha: Int,
    var endereco: Endereco = Endereco()
) : Autenticavel {

    override fun autenticar(senha: Int): Boolean {
        return this.senha == senha
    }

}