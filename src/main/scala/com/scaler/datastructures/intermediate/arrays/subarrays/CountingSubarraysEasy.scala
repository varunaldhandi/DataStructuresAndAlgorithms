package com.scaler.datastructures.intermediate.arrays.subarrays

object CountingSubarraysEasy extends App {
  def solve(A: Array[Int], B: Int) : Int = {
    var ans = 0
    var sum = 0

    for (i <- 0 until A.length) {
      sum = 0
      for (j <- i until A.length) {
        sum = sum + A(j)
        if (sum <= B) {
          ans = ans + 1
        }
      }
    }
    ans
  }
  val A = Array(3, 12, 11, 11, 11, 15)
  val B = 12
  println(solve(A, B))
}
