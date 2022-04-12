fun main() {
    var a = 10
    var b = 5
    var c = 0

    // IF ELSE
    if(a < b) else c = b
    println("O valor de C é $c.")

    // IF ELSE
    c = if (a < b) a else b
    println("O valor de C é $c")

    // IF ELSE
    var num = 0
    var num1 = 1

    if (num > num1) {
        println("Num é maior que Num1.")
    } else {
        println("Num1 é maior que Num.")
    }
}