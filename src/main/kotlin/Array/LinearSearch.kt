package Array

// Linear Search

fun LinearSearch(arr:IntArray, tar:Int): Boolean{

    for (i in arr.indices){
        if (arr[i] == tar){
            return true
        }
    }

    return false


}

fun main(){

    val arr = readLine()!!
        .trim()
        .split(" ")
        .map { it.toInt() }
        .toIntArray()

    val tar = readLine()!!.toInt()

    println(LinearSearch(arr, tar))
}

// TC = O(n), SC = O(1)

