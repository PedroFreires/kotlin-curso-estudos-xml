
fun main() {
    val pessoas = listOf("Junior", "Junios", "Junin", "Juninho", "Mini Junior")


    for ((posicao, pessoa) in pessoas.withIndex()) {
        println("Posicao: $posicao Nome: $pessoa")
    }

}