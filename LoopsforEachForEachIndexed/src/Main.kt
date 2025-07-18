fun main() {
    val pessoas = listOf("Junior", "Junios", "Junin", "Juninho", "Mini Junior")

    val filtro = pessoas.filter { it.startsWith('m', true) } //O true indica que o char pode ser maiusco ou minusculo

    //USANDO FOREACHINDEXED
    pessoas.forEachIndexed { index, pessoa ->
        println("Posicao: $index Nome: $pessoa")
    }

    //FORMA USANDO FOREACH
    /*pessoas.forEach { pessoa -> //outra forma seria não dar um nome (nesse caso pessoa ->) e no print passar "it"
        println(pessoa)

    }*/
}