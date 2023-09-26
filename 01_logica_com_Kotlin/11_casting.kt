package `01_logica_com_Kotlin`


//Casting
val inteiro: Int = 42
val decimal: Double = inteiro.toDouble()
val decimal2: Double = 42.5
val inteiro2: Int = decimal2.toInt()
val texto: String = "42"
val numero: Int = texto.toInt()
//Comversao Implicita
val inteiro3: Int = 42
val decimal3: Double = inteiro3.toDouble() // Conversão implícita
val texto2: String = "42"
val numero2: Int? = texto2.toIntOrNull() // Conversão segura
