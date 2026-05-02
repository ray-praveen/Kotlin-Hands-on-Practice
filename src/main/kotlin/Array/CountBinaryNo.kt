package Array

// Count number of 0s and 1s in array

fun CountZeroAndOne(arr: IntArray):Pair<Int, Int>{


    var zeroCount = 0
    var oneCount = 0

    for (i in arr.indices){
        if (arr[i] == 0){
            zeroCount++
        }else{
            oneCount++
        }
    }

    return Pair(zeroCount, oneCount)


}

fun main(){

    var arr = readLine()!!
        .trim()
        .split(" ")
        .map { it.toInt() }
        .toIntArray()

    val (zero, one) = CountZeroAndOne(arr)

    println("Count zero: ${zero}")
    println("Count Ones: ${one}")

}


// TC = O(n), SC = O(1)