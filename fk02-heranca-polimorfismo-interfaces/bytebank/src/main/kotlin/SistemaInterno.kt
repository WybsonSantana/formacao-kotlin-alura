class SistemaInterno {

    fun logar(usuario: Autenticavel, senha: Int) {
        if (usuario.autenticar(senha)) {
            println("Seja bem-vindo(a) ao ByteBank!\n")
        } else {
            println("Falha na autenticação!\n")
        }
    }
}