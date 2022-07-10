class SistemaInterno {

    fun logar(admin: FuncionarioAdmin, senha: Int) {
        if (admin.autenticar(senha)) {
            println("Seja bem-vindo(a) ao ByteBank!")
        } else {
            println("Falha na autenticação!")
        }
    }
}