fun main() {

    //Em Java
    // for(int i = 0, i<9; i++ {  }

    //Em Kotlin
    for(i in 0..9) {
        println("[$i]")
    }

    println("------------------INCREMENTAR E DECREMENTAR---------------")

    for (x in 9 downTo 0 step 3) {
        println("[$x]")
    }
}