package patterPrintingProblem

// Pascal Triangle

fun main(){

    val n= readLine()!!.toInt()

    for (i in 0 until  n){

        var num = 1

        for (space in 0 until n- i){
            print(" ")
        }
        for (j in 0 .. i){
            print("$num ")
            num = num * (i - j) / (j + 1)
        }
        println()
    }

}