package arrayManipulation

// Find Mode of Array (HashMap)

fun FindMostArr(arr:IntArray):Int{

    val freq = HashMap<Int, Int>()

    for(num in arr){
        freq[num] = freq.getOrDefault(num, 0) + 1
    }

    var maxFreq = -1
    var ans = -1

    for ((key, value ) in freq){
        if (value > maxFreq){
            maxFreq = value
            ans = key
        }
    }

    return ans

}

fun main(){

    val arr = readLine()!!
        .trim()
        .split(" ")
        .map { it.toInt() }
        .toIntArray()

    println( FindMostArr(arr))

}