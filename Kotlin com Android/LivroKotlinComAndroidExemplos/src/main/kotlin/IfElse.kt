fun main() {

    val senha = "123"
    if( senha == "123"){
        println("Acesso concedido")
    }else{
        println("Senha incorreta")
    }

    println("---------------------------------------")

    val a = 10
    val b = 5
    if( a > b) {
        println("$a é maior que $b")
    }else{
        println("$a é menor que $b")
    }

    println("---------------------------------------")

    val x = 10
    val y = 5
    val maior = if( x > y) x else y
}