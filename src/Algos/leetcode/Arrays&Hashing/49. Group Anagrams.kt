package Algos.leetcode.`Arrays&Hashing`

fun main() {
    println(groupAnagrams(arrayOf("eat", "tea", "tan", "ate", "nat", "bat")))
}

fun groupAnagrams(strs: Array<String>): List<List<String>> {
    val map = mutableMapOf<String, MutableList<String>>()
    var list = mutableListOf<List<String>>()

    strs.forEachIndexed { index, s ->
        var array = s.toCharArray().sortedArray().concatToString()
        if (map.containsKey(array)) {
            var currentList = map.getOrDefault(array, mutableListOf())
            map.put(array, currentList.apply { this.add(s) })
        } else {
            map.put(array, mutableListOf(s))
        }
    }

    map.forEach {
        list.add(it.value)
    }

    return list
}