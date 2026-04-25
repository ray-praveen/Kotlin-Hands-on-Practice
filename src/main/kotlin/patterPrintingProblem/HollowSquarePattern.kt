package patterPrintingProblem

// Hollow Square Pattern

fun main(){

    val n = readLine()!!.toInt()

    for (i in 1 .. n){
        for (j in 1 .. n){
            if(i == 1 || i == n || j == 1 || j == n){
                print("* ")
            }else{
                print("  ")
            }
        }
        println()
    }

}

// T(n) = O(n2)
