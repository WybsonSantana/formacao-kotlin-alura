package br.com.bytebank.modelo

class SistemaInterno {

    fun logar(usuario: Autenticavel, senha: Int, autenticado: () -> Unit = {}) {
        if (usuario.autenticar(senha)) {
            println("Seja bem-vindo(a) ao ByteBank!\n")
            autenticado()
        } else {
            println("Falha na autenticação!\n")
        }
    }

    fun logarReceiver(usuario: Autenticavel, senha: Int, autenticado: SistemaInterno.() -> Unit = {}) {
        if (usuario.autenticar(senha)) {
            println("Seja bem-vindo(a) ao ByteBank!\n")
            autenticado()
        } else {
            println("Falha na autenticação!\n")
        }
    }

    fun realizarPagamento() {
        println("Realizar pagamento")
    }
}
