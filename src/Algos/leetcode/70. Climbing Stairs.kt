package Algos.leetcode

fun main() {
    println(climbStairs(44))
}

var results = mutableMapOf<Int, Int>()
fun climbStairs(n: Int): Int {
    if (results.containsKey(n)) {
        return results.getValue(n)
    }

    if (n < 2) {
        results[n] = 1
        return results.getValue(n)
    }

    results[n] = climbStairs(n -1) + climbStairs(n -2)
    return results.getValue(n)
}