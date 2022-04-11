fun main(args: Array<String>) {

    /* Os valores de VAL não podem ser sobrescritos, é uma variável não mutável */
    val valorVal = "VAL não pode ser re-atribuido"

    /* Os valores de VAR podem ser sobrescritos, é uma variável mutável */
    var valorVar = "Teste"

    valorVar = "Valor de VAR re-atribuido."

    println(valorVal)
    println(valorVar)

    var valor = "--Valor da variável--"

    println("O valor da variavel é $valor.")

    println("---------------------------------")

    var atribuirTipoVariavel:String

    atribuirTipoVariavel = "Atribuindo valor a uma variável tipo String."
    println(atribuirTipoVariavel)

}