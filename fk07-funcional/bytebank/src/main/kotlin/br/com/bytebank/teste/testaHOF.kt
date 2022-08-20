package br.com.bytebank.teste

import br.com.bytebank.modelo.Autenticavel
import br.com.bytebank.modelo.SistemaInterno

fun testaHOF() {
    somar(11, 17, resultado = (::println))

    val autenticavel = object : Autenticavel {
        val senha = 1234

        override fun autenticar(senha: Int) = this.senha == senha
    }

    SistemaInterno().logar(autenticavel, 1234, autenticado = {
        println("Realizar pagamento")
    })
}

fun somar(x: Int, y: Int, resultado: (Int) -> Unit) {
    println("Antes de somar")
    resultado(x + y)
    println("Após somar")
}