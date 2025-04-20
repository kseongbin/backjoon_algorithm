fun main() {
    val L = readLine()!!.toInt()
    
    var result = 0
    var i = 0
    while (i < 4) {  // 4번 반복하며 둘레 계산
        result += L
        i++
    }

    println(result)
}
