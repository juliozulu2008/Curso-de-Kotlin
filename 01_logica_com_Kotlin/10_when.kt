package `01_logica_com_Kotlin`

fun main() {
    val diaSemana = "Segunda"

    when (diaSemana) {
        "Segunda" -> println("Hoje é segunda-feira.")
        "Terça" -> println("Hoje é terça-feira.")
        "Quarta" -> println("Hoje é quarta-feira.")
        "Quinta" -> println("Hoje é quinta-feira.")
        "Sexta" -> println("Hoje é sexta-feira.")
        "Sábado" -> println("Hoje é sábado.")
        "Domingo" -> println("Hoje é domingo.")
        else -> println("Dia desconhecido.")
    }
}
