package Array

// Find Maximum Element

fun FindMax(arr: IntArray): Int{

    var max = arr[0]

    for (value in arr){
        if(value > max){
            max = value
        }
    }

    return max

}

fun main(){

    val arr = readLine()!!
        .trim()
        .split(" ")
        .map { it.toInt() }
        .toIntArray()

    println(FindMax(arr))
}

// TC = O(n), Sc = O(1)
