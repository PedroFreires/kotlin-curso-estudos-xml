import kotlin.collections.mutableListOf

fun main() {
    val nomes = listOf("Jao", "Pedro", "Marcos", "Caio", "Junior") //não é possivel mudar os valores instanciados

    val pessoas = mutableListOf<String>("Jao", "Pedro", "Marcos", "Caio", "Junior")//é possivel fazer alteração, chamando "pessoas." ...
    pessoas.add("Silva")
    pessoas.add("Matos")

    pessoas.remove("Silva")

    println("Jao" in pessoas)
    println(nomes)
    println(pessoas)

    // Outra funcionalidade indexOf
    val posicao = pessoas.indexOf("Jao") //Se é um valor que existe na lista ele mestra posição, se não retorna -1
    println("Posicao de Jao no array: $posicao")

/* TESTES
    if ("Matos" in pessoas) {

        pessoas.remove("Matos")
    }
    print(pessoas)
*/

    // Uso:
    excluirNomes(pessoas, "Jao")
    print("Excluimos o Jao:" + "\n$pessoas")
}


fun excluirNomes(lista: MutableList<String>, nome: String) {


    if (nome in lista) {
        lista.remove(nome)
    }
}

