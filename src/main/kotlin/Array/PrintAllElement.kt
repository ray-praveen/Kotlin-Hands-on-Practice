package Array

// Print All element


fun AllPrint(arr:IntArray){

    for(i in 0 until arr.size){
        println(arr[i])
    }

}
fun main(){

    val arr= readLine()!!
        .trim()
        .split(" ")
        .map { it.toInt() }
        .toIntArray()

    println(AllPrint(arr))


}

//TC = O(n), SC = O(1)
