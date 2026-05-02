package arrayManipulation

// Print Extreme Elements

fun PrintExtreme(arr:IntArray){

    val n = arr.size

    var i = 0
    var j = n - 1

    while (i <= j){

        if (i == j){
            print("${arr[i]} ")
        }else{
            print("${arr[i]} ${arr[j]} ")
        }

        i++
        j --


    }

}

fun main(){

    val arr = readLine()!!
        .trim()
        .split(" ")
        .map { it.toInt() }
        .toIntArray()

    PrintExtreme(arr)


}