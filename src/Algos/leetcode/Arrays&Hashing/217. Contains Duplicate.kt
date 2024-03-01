package Algos.leetcode.`Arrays&Hashing`

fun main() {
    println(containsDuplicate(intArrayOf(1, 2, 3, 1)))
}

// Time: O(n)
// Space: O(n)
fun containsDuplicate(nums: IntArray): Boolean {
    val map = mutableSetOf<Int>()

    nums.forEach {
        if (map.contains(it)) {
            return true
        } else {
            map.add(it)
        }
    }
    return false
}