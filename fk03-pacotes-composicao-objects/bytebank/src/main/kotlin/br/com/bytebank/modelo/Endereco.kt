package br.com.bytebank.modelo

class Endereco(
    var logradouro: String = "",
    var complemento: String = "",
    var numero: String = "",
    var bairro: String = "",
    var cidade: String = "",
    var estado: String = "",
    var cep: String = ""
) {

    override fun toString() = """
        Logradouro: $logradouro
        Complemento: $complemento
        Número: $numero
        Bairro: $bairro
        Cidade: $cidade
        Estado: $estado
        CEP: $cep
        
    """.trimIndent()


}