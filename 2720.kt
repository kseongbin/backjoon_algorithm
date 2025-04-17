fun main() {
    val t = readln().toInt()
    repeat(t) {
        var c = readln().toInt()
        val quarter = c / 25
        c %= 25
        val dime = c / 10
        c %= 10
        val nickel = c / 5
        c %= 5
        val penny = c

        println("$quarter $dime $nickel $penny")
    }
}
