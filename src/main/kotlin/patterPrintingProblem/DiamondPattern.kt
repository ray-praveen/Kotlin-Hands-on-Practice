package patterPrintingProblem

// Diamond Pattern (Pyramid + Inverted Pyramid Combination)

fun main(){

    val n = readLine()!!.toInt()

    for (i in 1 .. n){
        for (i in 1 .. (n - i)){
            print(" ")
        }

        for (j in 1.. (2*(i) - 1)){
            print("*")
        }

        println()
    }

    for (i in 1 until n){
        for (j in 1 .. i){
            print(" ")
        }

        for (k in i .. (2*(n-i) - 1)){
            print("*")
        }
        println()
    }


}