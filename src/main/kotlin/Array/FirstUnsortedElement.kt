package Array

fun FirstUnsortedElement(arr:IntArray): Int{

    val n = arr.size

    for (i in 0 until n - 1){
        if (arr[i+ 1] <= arr[i]){
            return arr[i + 1]
        }
    }

    return -1

}

fun main(){

    val arr = readLine()!!
        .trim()
        .split(" ")
        .map { it.toInt() }
        .toIntArray()

    println(FirstUnsortedElement(arr))

}