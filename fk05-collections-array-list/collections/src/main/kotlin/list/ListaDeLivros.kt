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
        editora = "Editora A"
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

    val livro5 = Livro(
        titulo = "Vidas Secas",
        autor = "Graciliano Ramos",
        anoPublicacao = "1938",
        editora = "Editora A"
    )

    val livro6 = Livro(
        titulo = "Mayombe",
        autor = "Pepetela",
        anoPublicacao = "1979",
        editora = "Editora B"
    )

    val livro7 = Livro(
        titulo = "O Cortiço",
        autor = "Aluísio Azevedo",
        anoPublicacao = "1890",
        editora = "Editora B"
    )

    val livros: MutableList<Livro> = mutableListOf(livro1, livro2, livro3, livro4, livro5, livro6, livro7)

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

    livros.sorted().exibirLista()
    livros.sortedBy { it.titulo }.exibirLista()
    livros.sortedBy { it.autor }.exibirLista()

    livros.filter { it.autor.startsWith("J") }
        .sortedBy { it.anoPublicacao }
        .map { it.titulo }
        .let { println(it) }
}

fun List<Livro>.exibirLista() {
    val saidaFormatada = this.joinToString(separator = "\n") {
        "\t• ${it.anoPublicacao} - ${it.titulo} de ${it.autor}"
    }
    println("#### Lista de Livros ####\n$saidaFormatada\n")
}