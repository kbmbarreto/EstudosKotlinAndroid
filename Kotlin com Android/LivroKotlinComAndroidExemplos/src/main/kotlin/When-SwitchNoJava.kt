fun main(args: Array<String>) {

    val x:Int = 0

    when (x) {
        1 -> print("x == 1")
        2 -> print("x == 2")
        else -> {
            print("x possui outro valor")
        }
    }

    println("---------------------------------------")

    val y:Int = 0

    when (y) {
        0, 1 -> print("y == 0 ou x == 1")
        else -> print("y tem outro valor")
    }

    println("---------------------------------------")

    val k:Int = 0

    when (k) {
        in 1..10 -> print("k está no intervalo")
        else -> print("k está fora do intervalo")
    }
}