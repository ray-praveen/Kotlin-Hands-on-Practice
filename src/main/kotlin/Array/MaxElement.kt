package Array

// Find Maximum ELement

fun MaxElement(arr:IntArray): Int{

    var max = arr[0]

    for (value in arr){
        if (value > max){
            max = value
        }
    }

    return max

}

fun main(){

    var arr = readLine()!!
        .trim()
        .split(" ")
        .map { it.toInt() }
        .toIntArray()

    println(MaxElement(arr))

}

// TC = O(n)
// SC = O(1)
