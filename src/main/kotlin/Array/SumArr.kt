package Array

// Sum of All Elements

fun SumArray(arr: IntArray): Int{

    var sum = 0

    for (value in arr){
        sum += value
    }

    return sum


}

fun main(){

    val arr = readLine()!!
        .trim()
        .split(" ")
        .map { it.toInt() }
        .toIntArray()

    println(SumArray(arr))
}

// Time Complexity = O(n)
// Space Complexity = O(1)