fun main() {
    val assistiramCursoJava: Set<String> = setOf("Fulano", "Beltrano", "Ciclano")
    val assistiramCursoKotlin: Set<String> = setOf("Fulano", "Mengano", "Zotano")

    val assistiramAmbosCursos1: Set<String> = assistiramCursoJava + assistiramCursoKotlin
    println(assistiramAmbosCursos1)

    val assistiramAmbosCursos2 = mutableSetOf<String>()
    assistiramAmbosCursos2.addAll(assistiramCursoJava)
    assistiramAmbosCursos2.addAll(assistiramCursoKotlin)
    assistiramAmbosCursos2.add("Tentano")
    assistiramAmbosCursos2.add("Pebano")
    println(assistiramAmbosCursos2)
}