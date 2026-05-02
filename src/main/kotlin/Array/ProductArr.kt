package Array

fun ProductArr(arr: IntArray): Int{

    var product = 1

    for (value in arr){
        product *= value
    }

    return product

}

fun main(){

    val arr = readLine()!!
        .trim()
        .split(" ")
        .map { it.toInt() }
        .toIntArray()

    println(ProductArr(arr))
}

// TC: O(n) , SC: O(1)