fun main() {
    val n = readLine()!!.toInt()
    var point = 2
    repeat(n) {
        point = point * 2 - 1
    }
    println(point * point)
}
