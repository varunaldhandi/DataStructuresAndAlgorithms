package com.scaler.datastructures.intermediate.arrays.prefixsum

/**
 * You are given an integer array A of length N.
 * You are also given a 2D integer array B with dimensions M x 2, where each row denotes a [L, R] query.
 * For each query, you have to find the sum of all elements from L to R indices in A (1 - indexed).
 * More formally, find A[L] + A[L + 1] + A[L + 2] +... + A[R - 1] + A[R] for each query.
 *
 * A = [1, 2, 3, 4, 5]
 * B = [[1, 4], [2, 3]]
 * [10, 5]
 */
object RangeSum extends App {
  def getPrefixSumArray(ar: Array[Int]): Array[Int] = {
    var PS = new Array[Int](ar.length)
    PS(0) = ar(0)
    for (i <- 1 to ar.length - 1) {
      PS(i) = PS(i - 1) + ar(i)
    }
    PS
  }

  val A = Array(1, 2, 3, 4, 5)
  val B = Array(Array(1, 4), Array(2, 3))
  val prefixSumArray = getPrefixSumArray(A)
  println(s"prefixSumArray : ${prefixSumArray.mkString(",")}")
  var ans = new Array[Int](B.length)
  for(i <- 0 to B.length -1) {
    if(B(i)(0) == 1) {
      ans(i) = prefixSumArray(B(i)(1) - 1)
    } else {
      ans(i) = prefixSumArray(B(i)(1)-1) - prefixSumArray(B(i)(0)-2)
    }

  }
  println(ans.mkString(","))

}
