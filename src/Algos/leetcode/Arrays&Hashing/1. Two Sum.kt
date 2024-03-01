package Algos.leetcode.`Arrays&Hashing`

fun main() {
    println(twoSum(intArrayOf(2,7,11,15), 9).joinToString())
    println(twoSum(intArrayOf(3,2,4), 6).joinToString())
    println(twoSum(intArrayOf(3,3), 6).joinToString())
}

//
fun twoSum(nums: IntArray, target: Int): IntArray {
    val hash = mutableMapOf<Int, Int>()

    nums.forEachIndexed { index, i ->
        if (hash.containsKey(i)) {
            return intArrayOf(hash.getValue(i), index)
        } else {
            hash.put(target - i, index)
        }
    }
    return intArrayOf()
}