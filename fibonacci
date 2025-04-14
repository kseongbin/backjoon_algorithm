fun main() {
    val testCaseCount = readLine()!!.toInt()
    
    val zeroCount = IntArray(41)
    val oneCount = IntArray(41)
    
    zeroCount[0] = 1
    oneCount[1] = 1
    
    for (i in 2..40) {
        zeroCount[i] = zeroCount[i - 1] + zeroCount[i - 2]
        oneCount[i] = oneCount[i - 1] + oneCount[i - 2]
    }
    
    for (i in 0 until testCaseCount) {
        val n = readLine()!!.toInt()
        println("${zeroCount[n]} ${oneCount[n]}")
    }
}
