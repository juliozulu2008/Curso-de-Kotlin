package `01_logica_com_Kotlin`

fun main() {
    val nota = 85

    if (nota >= 90) {
        println("Aprovado com nota A.")
    } else if (nota >= 80) {
        println("Aprovado com nota B.")
    } else if (nota >= 70) {
        println("Aprovado com nota C.")
    } else {
        println("Reprovado.")
    }
}
