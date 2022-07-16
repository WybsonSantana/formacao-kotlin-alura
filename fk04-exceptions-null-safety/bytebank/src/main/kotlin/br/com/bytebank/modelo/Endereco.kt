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

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (javaClass != other?.javaClass) return false

        other as Endereco

//        if (logradouro != other.logradouro) return false
//        if (complemento != other.complemento) return false
//        if (numero != other.numero) return false
//        if (bairro != other.bairro) return false
//        if (cidade != other.cidade) return false
//        if (estado != other.estado) return false
        if (cep != other.cep) return false

        return true
    }

    override fun hashCode(): Int {
        var result = cep.hashCode()
//        var result = logradouro.hashCode()
//        result = 31 * result + complemento.hashCode()
//        result = 31 * result + numero.hashCode()
//        result = 31 * result + bairro.hashCode()
//        result = 31 * result + cidade.hashCode()
//        result = 31 * result + estado.hashCode()
//        result = 31 * result + cep.hashCode()
        return result
    }


}