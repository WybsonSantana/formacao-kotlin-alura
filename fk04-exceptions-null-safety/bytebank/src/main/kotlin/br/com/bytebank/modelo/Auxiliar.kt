package br.com.bytebank.modelo

class Auxiliar(
    nome: String,
    cargo: String,
    cpf: String,
    email: String,
    salario: Double
) : Funcionario(
    nome = nome,
    cargo = cargo,
    cpf = cpf,
    email = email,
    salario = salario
) {

    override fun bonificacao(): Double {
        return this.salario * 0.1
    }

}