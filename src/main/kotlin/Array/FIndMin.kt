package Array

// Find Minimum Elements


fun FIndMin(arr:IntArray) :Int{

    var min = arr[0]

    for (value in arr){
        if (value < min){
            min = value
        }
    }

    return min
}

fun main(){

    val arr = readLine()!!
        .trim()
        .split(" ")
        .map { it.toInt() }
        .toIntArray()

    println(FIndMin(arr))

}

//Tc = O(n), SC = O(1)