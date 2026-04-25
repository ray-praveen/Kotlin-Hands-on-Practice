package patterPrintingProblem

// Solid Square Problem


fun SquarePatter(n:Int){

    for(i in 1..n){
        for (j in 1..n){
            print("*")
        }
        println()
    }
}


fun main(){

    val n = readLine()!!.toInt()

   println(SquarePatter(n))

}