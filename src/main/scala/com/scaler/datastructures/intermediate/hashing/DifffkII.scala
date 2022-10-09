package com.scaler.datastructures.intermediate.hashing
import scala.collection.mutable.Map

object DifffkII extends App {
  def diffPossible(A: Array[Int], B: Int): Int = {
    var mp = Map.empty[Long, Int]
    for(i <- 0 until A.length) {
      if(mp.contains(A(i) - B) || mp.contains(A(i) + B)) {
        return 1
      } else {
        mp(A(i)) = i
      }
    }
    return 0
  }
// A(i) - A(j) = B ==> A(j) = A(i) - B

//  val A = Array(77, 28, 19, 21, 67, 15, 53, 25, 82, 52, 8, 94, 50, 30, 37, 39, 9, 43, 35, 48, 82, 53, 16, 20, 13, 95, 18, 67, 77, 12, 93, 0)
  val A = Array(34, 63, 64, 38, 65, 83, 50, 44, 18, 34, 71, 80, 22, 28, 20, 96, 33, 70, 0, 25, 64, 96, 18, 2, 53, 100, 24, 47, 98, 69, 60, 55, 8, 38, 72, 94, 18, 68, 0, 53, 18, 30, 86, 55, 13, 93, 15, 43, 73, 68, 29)
//  val B = 53
  val B = 97
  println(diffPossible(A, B))

}


//A : [ 34, 63, 64, 38, 65, 83, 50, 44, 18, 34, 71, 80, 22, 28, 20, 96, 33, 70, 0, 25, 64, 96, 18, 2, 53, 100, 24, 47, 98, 69, 60, 55, 8, 38, 72, 94, 18, 68, 0, 53, 18, 30, 86, 55, 13, 93, 15, 43, 73, 68, 29 ]
//  B : 97
//Expected: 0, returned: 1
