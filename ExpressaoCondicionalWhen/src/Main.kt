
fun main() {

    val resultado = soma(30, 30)

    print(resultado)
   /* val numero = 220

    when (numero){
        10 -> {
            print(numero)
        }
        20 -> {
            print(numero)
        }
        else -> {
            print(numero)
        }
    }*/
}

fun soma(num1: Int, num2: Int): String {
    return when {
        num1 < num2 -> {
            "$num1 < $num2"
        }  num1 > num2 -> {
            "$num1 > $num2"
        }
        else -> {
            "$num1 == $num2"
        }
    }
}