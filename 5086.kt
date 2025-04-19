fun main() {
    while (true) {
        val (a, b) = readLine()!!.split(" ").map { it.toInt() }
        if (a == 0 || b == 0) break
        if (b % a == 0) {
            println("factor")
        } else if (a % b == 0) {
            println("multiple")
        } else {
            println("neither")
        }
    }
}
