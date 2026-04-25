package patterPrintingProblem

fun SolidRectanglePattern(n:Int){

    for (i in 1 ..n){
        for (j in 1 .. 5){
            print("*")
        }
        println()
    }

}


fun main(){

    val n = readLine()!!.toInt()

    SolidRectanglePattern(n)

}

//TC: O(n), SC= O(1)