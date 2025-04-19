fun main() {
    val m = readLine()!!.toInt()
    val n = readLine()!!.toInt()

    var num = m
    var sum = 0
    var min = 0

    while (num <= n) {
        var isPrime = true

        if (num < 2) {
            isPrime = false
        } else {
            var i = 2
            while (i < num) {
                if (num % i == 0) {
                    isPrime = false
                    break
                }
                i++
            }
        }

        if (isPrime) {
            sum += num
            if (min == 0) {
                min = num
            }
        }

        num++
    }

    if (sum == 0) {
        println(-1)
    } else {
        println(sum)
        println(min)
    }
}
