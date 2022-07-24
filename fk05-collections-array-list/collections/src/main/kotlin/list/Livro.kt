package list

data class Livro(
    val titulo: String,
    val autor: String,
    val anoPublicacao: String,
    val editora: String? = ""
)