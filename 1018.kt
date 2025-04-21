fun main() {
    val (n, m) = readLine()!!.split(" ").map { it.toInt() }
    val board = Array(n) { readLine()!! }
    var minPaint = 64

    for (i in 0..n - 8) {
        for (t in 0..m - 8) {
            var paint1 = 0
            var paint2 = 0
            for (x in 0 until 8) {
                for (y in 0 until 8) {
                    val curr = board[i + x][t + y]
                    if ((x + y) % 2 == 0) {
                        if (curr != 'W') paint1++
                        if (curr != 'B') paint2++
                    } else {
                        if (curr != 'B') paint1++
                        if (curr != 'W') paint2++
                    }
                }
            }
            minPaint = minOf(minPaint, paint1, paint2)
        }
    }

    println(minPaint)
}
