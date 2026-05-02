package Array

// Sum of +ve and -ve numbers

fun SumOfPosandNeg(arr: IntArray): Pair<Int, Int>{

    val n = arr.size

    var posSum = 0
    var negSum = 0

    for (value in arr){
        if (value > 0){
            posSum += value
        }else if(value < 0){
            negSum += value
        }
    }

    return Pair(posSum, negSum)

}

fun main(){

    val arr = readLine()!!
        .trim()
        .split(" ")
        .map { it.toInt() }
        .toIntArray()

    val (posSum, negSum) = SumOfPosandNeg(arr)

    println("Positive Sum = $posSum")
    println("Negative Sum = $negSum")

}