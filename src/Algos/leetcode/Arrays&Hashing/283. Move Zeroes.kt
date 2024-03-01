package Algos.leetcode.`Arrays&Hashing`

fun main() {
    moveZeroes(intArrayOf(0, 1, 0, 3, 12))
}

fun moveZeroes(nums: IntArray): Unit {
    var j = 0

    for (i in nums.indices) {
        if (nums[i] != 0) {
            val temp = nums[j]
            nums[j] = nums[i]
            nums[i] = temp
            j++
        }
    }

    println(nums.joinToString())
}