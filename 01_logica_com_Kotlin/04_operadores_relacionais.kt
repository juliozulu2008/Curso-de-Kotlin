package `01_logica_com_Kotlin`

fun main() {
    val numero1 = 10
    val numero2 = 5

    // Igual a
    val igualA = numero1 == numero2
    println("Igual a: $igualA") // Resultado: false

    // Diferente de
    val diferenteDe = numero1 != numero2
    println("Diferente de: $diferenteDe") // Resultado: true

    // Maior que
    val maiorQue = numero1 > numero2
    println("Maior que: $maiorQue") // Resultado: true

    // Menor que
    val menorQue = numero1 < numero2
    println("Menor que: $menorQue") // Resultado: false

    // Maior ou igual a
    val maiorOuIgualA = numero1 >= numero2
    println("Maior ou igual a: $maiorOuIgualA") // Resultado: true

    // Menor ou igual a
    val menorOuIgualA = numero1 <= numero2
    println("Menor ou igual a: $menorOuIgualA") // Resultado: false
}
