package arrayManipulation

fun RightoShiftArr(arr:IntArray){

    val n = arr.size

    val temp = arr[n-1]

    for (i in n-1  downTo 1){
        arr[i] = arr[i - 1]
    }

    arr[0] = temp

}

fun main(){

    val arr = readLine()!!
        .trim()
        .split(" ")
        .map { it.toInt() }
        .toIntArray()

   RightoShiftArr(arr)

    for (value in arr){
        println("$value ")
    }

}

// TC = O(n)
// SC = O(1)