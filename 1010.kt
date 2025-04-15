fun main() {
    val t = readLine()!!.toInt()

    for (i in 0 until t) {
        val (n, m) = readLine()!!.split(" ").map { it.toInt() }
        println(combination(m, n))
    }
}

fun leftBridgeFactorial (n : Int): Long {
    var result = 1L
    for (i in 1..n) {
        result *= i
    }
    return result
}

fun combination(m: Int, n: Int): Long {
    return leftBridgeFactorial(m) / (leftBridgeFactorial(n) * leftBridgeFactorial(m - n))
}
