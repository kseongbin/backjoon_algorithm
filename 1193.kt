fun main() {
    val x = readLine()!!.toInt()

    var count = 0
    var line = 1

    while (count < x) {
        count += line
        line++
    }

    line -= 1
    val position = x - (count - line)

    val top: Int
    val bottom: Int

    if (line % 2 == 0) {
        top = position
        bottom = line - position + 1
    } else {
        top = line - position + 1
        bottom = position
    }

    println("$top/$bottom")
}
