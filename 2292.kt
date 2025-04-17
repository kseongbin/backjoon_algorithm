fun main() {
    val n = readLine()!!.toInt()
    var room = 1
    var step = 1

    while (n > room) {
        room += 6 * step
        step++
    }

    println(step)
}
