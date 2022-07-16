package br.com.bytebank.modelo

abstract class FuncionarioAdmin(
    nome: String,
    cargo: String,
    cpf: String,
    email: String,
    salario: Double,
    protected val senha: Int
) : Funcionario(
    nome = nome,
    cargo = cargo,
    cpf = cpf,
    email = email,
    salario = salario
), Autenticavel {

    override fun autenticar(senha: Int): Boolean {
        return this.senha == senha
    }

}