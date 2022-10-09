package com.scaler.datastructures.intermediate.hashing
import scala.collection.mutable.Map

object KOccurences extends App {
  def getSum(A: Int, B: Int, C: Array[Int]): Int  = {
    ???
  }

  val C = Array(2, 2, 2, 2)
  val N = 4
  val B = 4

  var freq = Map.empty[Int, Int]
  for(i <- 0 until C.length){
    if(freq.contains(C(i))) {
      freq(C(i)) = freq(C(i)) + 1
    } else {
      freq(C(i)) = 1
    }
  }
  var sum = 0
   for(i <- freq.keys) {
     if(freq(i) == B) {
       sum = sum + i
     }
   }
  println(sum)

}
