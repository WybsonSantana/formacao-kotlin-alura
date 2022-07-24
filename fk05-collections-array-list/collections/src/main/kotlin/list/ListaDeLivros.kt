package list

fun main() {
    val livro1 = Livro(
        titulo = "Grande Sertão: Veredas",
        autor = "João Guimarães Rosa",
        anoPublicacao = "1956"
    )

    val livro2 = Livro(
        titulo = "Minha vida de menina",
        autor = "Helena Morley",
        anoPublicacao = "1942",
        editora = "Editora"
    )

    val livro3 = Livro(
        titulo = "Memórias Póstumas de Brás Cubas",
        autor = "Machado de Assis",
        anoPublicacao = "1881"
    )

    val livro4 = Livro(
        titulo = "Iracema",
        autor = "José de Alencar",
        anoPublicacao = "1865",
        editora = "Editora B"
    )

    val livros: MutableList<Livro> = mutableListOf(livro1, livro2, livro3, livro4)

    livros.add(
        Livro(
            titulo = "Sagarana",
            autor = "João Guimarães Rosa",
            anoPublicacao = "1946"
        )
    )

    livros.exibirLista()
    livros.remove(livro1)
    livros.exibirLista()

}

fun List<Livro>.exibirLista() {
    val saidaFormatada = this.joinToString(separator = "\n") {
        "\t• ${it.titulo} de ${it.autor}"
    }
    println("#### Lista de Livros ####\n$saidaFormatada\n")
}