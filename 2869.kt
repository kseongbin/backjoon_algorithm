fun main() {
    val (a, b, v) = readLine()!!.split(" ").map { it.toInt() }

    var height = 0
    var days = 0

    while (true) {
        days++
        height += a
        if (height >= v) break
        height -= b
    }
    println(days)
}
