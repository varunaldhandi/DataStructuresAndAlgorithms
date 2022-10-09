package com.scaler.datastructures.intermediate.arrays.subarrays

object MaximumSumSubArray extends App {
//  val A = Array(3, 8, 8, 9, 7)
  val A = Array(4)
  var PS = new Array[Int](A.length)
  PS(0) = A(0)
  for(i <- 1 until A.length){
    PS(i) = PS(i-1) + A(i)
  }
  println(PS.mkString(","))
  var maxSum = Int.MinValue

  for(start <- 0 until(A.length)) {
    var end = start
    while(end < A.length - 1) {
      if(start == 0){
        maxSum = maxSum max (PS(end))
      } else {
        maxSum = maxSum max (PS(end) - PS(start - 1))
      }

      end = end + 1
    }
  }
//  def maxSubArray(A: Int, B: Int, C: Array[Int]) : Int = {
//    var ans = Int.MinValue
//    var curr = 0
//    for (i <- 0 until C.length) {
//      curr = curr + C(i)
//      ans = ans max curr
//      if (curr < 0) {
//        curr = 0
//      }
//    }
//    ans
//  }
//  println(maxSubArray(5, 7, Array(3, 8, 8, 9, 7)))

}
