package list

fun List<Livro?>.exibirLista() {
    val saidaFormatada = this
        .filterNotNull()
        .joinToString(separator = "\n") {
            "\t• ${it.anoPublicacao} - ${it.titulo} de ${it.autor}"
        }
    println("#### Lista de Livros ####\n$saidaFormatada\n")
}