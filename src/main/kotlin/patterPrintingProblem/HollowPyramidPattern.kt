package patterPrintingProblem

//Solid HollowPyramid

fun main(){

    val n = readLine()!!.toInt()

    for (row in 1 .. n){
        for (space in 1.. (n -row)){
            print(" ")
        }
        for (col in 1.. (2*row - 1)){
            if (col == 1 || col == (2* row - 1) || row == n){
                print("*")
            }else{
                print(" ")
            }
        }
        println()
    }

}