package Algos.leetcode.`Arrays&Hashing`

fun main() {
    println(topKFrequent(intArrayOf(1,1,1,2,2,3),2).joinToString())
    println(topKFrequent(intArrayOf(1),1).joinToString())
    println(topKFrequent(intArrayOf(4,1,-1,2,-1,2,3),2).joinToString())
}

fun topKFrequentBad(nums: IntArray, k: Int): IntArray {
    var hash = hashMapOf<Int,Int>()
    var list = mutableListOf<Pair<Int, Int>>()
    var response = Array(k) { 0 }


    nums.forEachIndexed { index, i ->
        hash[i] = hash.getOrDefault(i,0) + 1
    }

    hash.forEach { t, u ->
        list.add(Pair(t, u))
    }

    list.sortByDescending { it.second }

    for (i in 0 until  k) {
        response[i] = list.get(i).first
    }

    return response.toIntArray()
}

fun topKFrequent(nums: IntArray, k: Int): IntArray {
    val res = mutableListOf<Int>()

    val count = hashMapOf<Int, Int>()

    // lista que tem lista com a frequencia de aparicoes
    val freq = MutableList<MutableList<Int>>(nums.size + 1) {
        mutableListOf()
    }

    //contando e colocando no map
    for (n in nums) {
        count[n] = count.getOrDefault(n, 0) + 1
    }

    // pegando os items do map e adicionando no index o tanto de aparicoes e no valor o valor em si
    for ((n,c) in count) {
        freq[c].add(n)
    }

    //andando na lista de aparicoes de traz pra frente, ja que guardamos o tanto de aparicoes
    // como o index anteriormente
    // adicionando na lista final e retornando quando ela é igual ao tanto de aparicoes que queremos contar. (k)
    for (i in freq.size -1 downTo 0) {
        for (n in freq[i]) {
            res.add(n)
            if (res.size == k) {
                return res.toIntArray()
            }
        }
    }
    return intArrayOf()
}

