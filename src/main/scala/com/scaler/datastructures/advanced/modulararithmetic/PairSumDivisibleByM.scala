package com.scaler.datastructures.advanced.modulararithmetic
import scala.collection.mutable.Map

object PairSumDivisibleByM extends App {
  def solve(A: Array[Int], B: Int): Int  = {
    var ans = 0
    var freq = Map.empty[Int, Int]
    for (i <- 0 until A.length) {
      A(i) = A(i) % B
      if (freq.contains(A(i))) {
        freq(A(i)) = freq(A(i)) + 1
      } else {
        freq(A(i)) = 1
      }

    }
    for (i <- 0 until A.length) {
      if(freq.contains((B - A(i)) % B)) {
        freq(A(i)) = freq(A(i)) - 1
        ans = ans + freq((B - A(i)) % B)
      }
    }
    ans
  }
  
  var A = Array(5, 7, 100, 11)
  val B = 28


  println(solve(A, B))


}
