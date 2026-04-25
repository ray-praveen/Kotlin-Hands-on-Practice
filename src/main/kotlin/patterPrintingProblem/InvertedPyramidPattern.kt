package patterPrintingProblem

// Inverted Pyramid Pattern

//fun main(){
//
//    val n = readLine()!!.toInt()
//
//    for (i in n downTo 1){
//
//        for(j in  1.. (n - i)){
//            print(" ")
//        }
//
//        for (k in 1..(2*i - 1)){
//            print("*")
//        }
//        println()
//    }
//
//}

fun main(){

    val n = readLine()!!.toInt()

    for (i in 1.. n){

        for(j in  1.. (i-1)){
            print(" ")
        }

        for (k in 1..(2*(n -i) + 1)){
            print("*")
        }
        println()
    }

}