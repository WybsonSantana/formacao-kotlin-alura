package list

fun main() {
    val prateleiraDeLivros = PrateleiraDeLivros(
        genero = "Literatura",
        livros = listaLivrosComNulos
    )

    val prateleiraPorAutor = prateleiraDeLivros.organizarPorAutor()
    val prateleiraPorAnoPublicacao = prateleiraDeLivros.organizarPorAnoPublicacao()

    prateleiraPorAutor.exibirLista()
    prateleiraPorAnoPublicacao.exibirLista()
}