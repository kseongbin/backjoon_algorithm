fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val stack = Stack<Int>()
    val n = br.readLine().toInt()

    val sb = StringBuilder()
    var count = 0

    while (count < n) {
        val input = br.readLine().split(" ")
        when (input[0]) {
            "1" -> stack.push(input[1].toInt())
            "2" -> sb.appendLine(if (stack.isEmpty()) -1 else stack.pop())
            "3" -> sb.appendLine(stack.size)
            "4" -> sb.appendLine(if (stack.isEmpty()) 1 else 0)
            "5" -> sb.appendLine(if (stack.isEmpty()) -1 else stack.peek())
        }
        count++
    }

    println(sb)
}
