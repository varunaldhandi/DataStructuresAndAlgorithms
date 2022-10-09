package com.scaler.datastructures.intermediate.arrays.subarrays

object MaxSubArrayEasy extends  App {
  def maxSubarray(A: Int, B: Int, C: Array[Int]): Int  = {
    val n = C.length
    var sum = 0
    var maxSum = 0
    var PS = new Array[Int](A)
    PS(0) = C(0)
    for(i <- 1 until(C.length)) {
        PS(i) = PS(i-1) + C(i)
    }

    for(i <- 0 until n){
      for(j <- i until n){
        if(i == 0){
          sum = PS(j)
        } else {
          sum = PS(j) - PS(j-1)
        }
        if(sum >= B){
          return B
        }
        maxSum = maxSum max sum
      }
    }
    maxSum
  }
  val A = 9
  val B = 78
  val C = Array(7, 1, 8, 5, 8, 5, 3, 3, 5)
  println(maxSubarray(A, B, C))
}
