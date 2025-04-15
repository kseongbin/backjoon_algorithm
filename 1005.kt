fun main() {
    val T = readLine()!!.toInt()

    for (test in 0 until T) {
        val (N, K) = readLine()!!.split(" ").map { it.toInt() }
        val time = listOf(0) + readLine()!!.split(" ").map { it.toInt() }

        val graph = Array(N + 1) { mutableListOf<Int>() }
        val indegree = IntArray(N + 1)
        val dp = IntArray(N + 1)

        for (i in 0 until K) {
            val (X, Y) = readLine()!!.split(" ").map { it.toInt() }
            graph[X].add(Y)
            indegree[Y]++
        }

        val W = readLine()!!.toInt()

        val queue: ArrayDeque<Int> = ArrayDeque()

        for (i in 1..N) {
            if (indegree[i] == 0) {
                queue.add(i)
                dp[i] = time[i]
            }
        }

        while (queue.isNotEmpty()) {
            val current = queue.removeFirst()
            for (next in graph[current]) {
                if (dp[next] < dp[current] + time[next]) {
                    dp[next] = dp[current] + time[next]
                }
                indegree[next]--
                if (indegree[next] == 0) {
                    queue.add(next)
                }
            }
        }

        println(dp[W])
    }
}
