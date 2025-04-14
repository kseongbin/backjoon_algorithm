fun isInside(x: Int, y: Int, cx: Int, cy: Int, r: Int): Boolean {
    val dx = x - cx
    val dy = y - cy
    return dx * dx + dy * dy < r * r
}

fun main() {
    val testCount = readLine()!!.toInt()

    for (i in 0 until testCount) {
        val (startX, startY, endX, endY) = readLine()!!.split(" ").map { it.toInt() }

        val planetCount = readLine()!!.toInt()
        var cross = 0

        for (k in 0 until planetCount) {
            val (cx, cy, r) = readLine()!!.split(" ").map { it.toInt() }

            val start = isInside(startX, startY, cx, cy, r)
            val end = isInside(endX, endY, cx, cy, r)

            if (start != end) {
                cross++
            }
        }

        println(cross)
    }
}
