package Array

// Average of Array Elements

fun AverageArr(arr:IntArray):Double{

    val n = arr.size

    var sum = 0.0

    for (value in arr){
        sum += value
    }

    val avg = sum / n

    return avg


}

fun main(){

    val arr = readLine()!!
        .trim()
        .split(" ")
        .map { it.toInt() }
        .toIntArray()

    println(AverageArr(arr))


}

// TC = O(n), SC = O(1)