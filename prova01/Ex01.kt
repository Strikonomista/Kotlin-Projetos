fun main() {
    println("Digite um número entre 1 e 12:")
    val numero = readLine()?.toInt()

    when (numero) {
        1 -> println("Janeiro")
        2 -> println("Fevereiro")
        3 -> println("Março")
        4 -> println("Abril")
        5 -> println("Maio")
        6 -> println("Junho")
        7 -> println("Julho")
        8 -> println("Agosto")
        9 -> println("Setembro")
        10 -> println("Outubro")
        11 -> println("Novembro")
        12 -> println("Dezembro")
        else -> println("Erro: O número deve estar entre 1 e 12.")
    }
}



