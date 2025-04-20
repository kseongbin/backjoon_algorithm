fun main() {
    val (x, y, w, h) = readLine()!!.split(" ").map { it.toInt() }
    val minX = minOf(x, w - x)
    val minY = minOf(y, h - y)
    println(minOf(minX, minY))
}
