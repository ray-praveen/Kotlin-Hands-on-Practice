package patterPrintingProblem

// Numeric Increasing Triangle pattern

fun NumPattern(n:Int){

    for (i in 1..n){
        for (j in 1 .. i){
            print("${j} ")
        }
        println()
    }

}

fun main(){

    val n = readLine()!!.toInt()

    println(NumPattern(n))

}