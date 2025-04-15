import java.math.BigInteger

fun main() {
    val t = readLine()!!.toInt()

    for (i in 0 until t) {
        val (n, m) = readLine()!!.split(" ").map { it.toInt() }
        println(combination(m, n))
    }
}

fun leftBridgeFactorial(n: Int): BigInteger {
    var result = BigInteger.ONE
    for (i in 1..n) {
        result = result.multiply(BigInteger.valueOf(i.toLong()))
    }
    return result
}

fun combination(m: Int, n: Int): BigInteger {
    return leftBridgeFactorial(m) / (leftBridgeFactorial(n) * leftBridgeFactorial(m - n))
}
