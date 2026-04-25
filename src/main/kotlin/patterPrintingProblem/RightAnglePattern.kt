package patterPrintingProblem

// Right Angle Triangle Pattern

//fun main(){
//
//    val n = readLine()!!.toInt()
//
//    for (i in n downTo 1){
//        for (j in i .. n){
//            print("*")
//        }
//        println()
//    }
//
//}

fun main(){

    val n = readLine()!!.toInt()

    for(i in 1 .. n){
        for (j in 1.. i){
            print("*")
        }
        println()
    }

}