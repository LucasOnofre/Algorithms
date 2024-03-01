package Algos.leetcode.`Arrays&Hashing`

fun main() {
    println(isAnagram("anagram", "nagaram"))
}

// Time: O(S + T)  - Size of strings
// Space: O(S + T) - Size of strings
fun isAnagram(s: String, t: String): Boolean {

    if (s.length != t.length) {
        return false
    }

    var map1 = mutableMapOf<Char, Int>()
    var map2 = mutableMapOf<Char, Int>()

    for (i in 0 until s.length) {
        map1[s.get(i)] = 1 + map1.getOrDefault(s.get(i), 0)
        map2[t.get(i)] = 1 + map2.getOrDefault(t.get(i), 0)
    }

    map1.forEach {
        if (!map2.containsKey(it.key) || map2.getOrDefault(it.key, 0) != it.value) {
            return false
        }
    }

    return true
}

// Sorting
fun isAnagramTwo(s: String, t: String): Boolean {
    return s.toCharArray().sorted() == t.toCharArray().sorted()
}