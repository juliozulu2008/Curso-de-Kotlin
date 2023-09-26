package `01_logica_com_Kotlin`

fun main() {
    val x = 10
    val y = 5
    val z = 15

    // Operador lógico AND (&&)
    val andResult = (x > y) && (y < z)
    println("Operador AND: $andResult") // Resultado: true (Ambas as condições são verdadeiras)

    // Operador lógico OR (||)
    val orResult = (x > y) || (y > z)
    println("Operador OR: $orResult") // Resultado: true (Pelo menos uma condição é verdadeira)

    // Operador lógico NOT (!)
    val notResult = !(x > y)
    println("Operador NOT: $notResult") // Resultado: false (Inverte a condição)
}
