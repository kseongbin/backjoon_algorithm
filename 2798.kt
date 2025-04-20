fun main() {
    val (n, m) = readLine()!!.split(" ").map { it.toInt() }
    val cards = readLine()!!.split(" ").map { it.toInt() }
    var bestSum = 0

    for (i in 0 until n - 2) {
        for (j in i + 1 until n - 1) {
            for (k in j + 1 until n) {
                val sum = cards[i] + cards[j] + cards[k]
                if (sum <= m && sum > bestSum) {
                    bestSum = sum
                }
            }
        }
    }

    println(bestSum)
}
