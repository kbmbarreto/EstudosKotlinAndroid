fun main() {
    //Operadores aritméticos
    // +, -, *, /,%
    // += -= *= /= %=
    // ++ --

    var valorA:Int = 10
    var valorB:Int = 3

    var soma = valorA + valorB
    var subtracao = valorA - valorB
    var multiplicacao = valorA * valorB
    var divisao = valorA / valorB.toDouble() //No Kotlin o casting é muito mais fácil

    var valorC:Double = 0.0

    valorC += valorA
    valorC *= valorB
    valorC /= valorA
    valorC %= 2

    // Operadores lógicos
    // && (and lógico) || (or lógico) ! (not lógico)
}