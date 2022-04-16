fun main(args: Array<String>) {

    val lista1 = listOf(1,2,3,4)
    for(i in lista1) {
        println("Item: $i")
    }

    println("---------------------------------------")

    val lista2 = listOf(1,2,3,4)
    for((indice ,valor) in lista2.withIndex()){
        println("índice: $indice valor: $valor")
    }

    println("---------------------------------------")

    var x = 0
    while (x < 10) {
        println(x.toString())
        x++
    }
}