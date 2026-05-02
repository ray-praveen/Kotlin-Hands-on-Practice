package arrayManipulation

// Reverse an Array by Two Pointer
fun ReverseArray(arr:IntArray){

    val n = arr.size

    var i = 0
    var j = n - 1

   while (i <= j){
       val temp = arr[i]
       arr[i] = arr[j]
       arr[j] = temp

       i++
       j--
   }

}

fun main(){

    val arr= readLine()!!
        .trim()
        .split(" ")
        .map { it.toInt()}
        .toIntArray()

   ReverseArray(arr)

    for (value in arr){
        println("$value ")
    }

}

// TC = O(n)
// SC = O(1)