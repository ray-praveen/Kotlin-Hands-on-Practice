package patterPrintingProblem

// Hollow Diamond Pattern

fun main(){

    val n = readLine()!!.toInt()

    for (i in 1 .. n){
        for (j in 1.. n - i){
            print(" ")
        }
        for (col in 1 .. (2*i - 1)){
            if (col == (2*i - 1) || col == 1){
                print("*")
            }else{
                print(" ")
            }

        }

        println()
    }

    for (row in 1 until n) {
        for (space in 1..row) {
            print(" ")
        }

        for (col in 1..(2 * (n - row) - 1)) {
            if (col == 1 || col == (2 * (n - row) - 1)) {
                print("*")
            } else {
                print(" ")
            }
        }
        println()
    }

}