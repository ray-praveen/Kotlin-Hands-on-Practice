package patterPrintingProblem

// Invert Right Angle triangle

//
//fun main(){
//
//    val n = readLine()!!.toInt()
//
//    for(i in 1 .. n){
//        for (j in i.. n){
//            print("*")
//        }
//        println()
//    }
//
//}

fun main(){

    val n = readLine()!!.toInt()

    for(i in 1 .. n){
        for (j in 1..(n-i+1)){
            print("*")
        }
        println()
    }

}

//TC: O(n^2)  & SC: O(1)