package Array

// Multiply Each Element by 10

fun Multiplyby10(arr:IntArray): IntArray{

    val n = arr.size
    val result = IntArray(n)

    for (i in arr.indices){
        result[i] =  arr[i] * 10
    }

    return result

}

fun main(){

    val arr = readLine()!!
        .trim()
        .split(" ")
        .map { it.toInt() }
        .toIntArray()



    val result = Multiplyby10(arr)

    for(i in result){
        print("$i ")
    }

}