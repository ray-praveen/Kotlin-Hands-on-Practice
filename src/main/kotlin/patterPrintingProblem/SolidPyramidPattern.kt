package patterPrintingProblem

// Solid Pyramid Pattern

fun main(){

    val n = readLine()!!.toInt()

    for (i in 1..n){
        for (j in 1..(n-i)){
            print(" ")
        }

        for (k in 1 .. (2* i - 1)){
            print("*")
        }
        println()
    }

}

// T(n) = O(n2) , Sc =O(1)