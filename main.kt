fun main(args: Array<String>) {
      /*
    Tipos de Dados
    * string - textos
    * byte -Numeros inteiros (-128 ate 127)
    * int - Numeros inteiros (-2.147.483.648 a 2.147.483.647)
    * long - inteiros (-9.223.372.036.854.775.808 a 9.223.372.036.854.775.807)
    * float - Numeros decimais - ate 7 casas decimais
    * double - numero decimais -ate 15 casas decimais
    * bolean - valores bolleanos - true ou false
    * null - tipo nullo

     */
    // ao declararrmos avariavel deste modo nao podemo trocar seu tipo
    var nome: String = "Julio"
    println(nome)
    var numero: Byte = 1
    println(numero)
    var idade: Int = 30
    println(idade)
    var numeroLongo: Long = 9223372
    println(numeroLongo)
    var numeroDecimal: Float = 3.141f
    println(numeroDecimal)
    var numeroDecimalLong: Double = 1.233456789654
    println(numeroDecimalLong)
    var verdade: Boolean = true
    println(verdade)

    // modo dinamico

    var nomeCompleto = "Julio Cesar"
    println(nomeCompleto)

}