package com.scaler.datastructures.intermediate.arrays.TwoDimensionalMatrices

object RotateMatrix extends App {
  val A = Array(Array(1, 2, 3, 4), Array(5, 6, 7, 8), Array(9, 0 , 1, 2))

  val m = A.length
  val n = A(0).length

  var result = Array.ofDim[Int](n, m)

  for(i <- m-1 to (0, -1)) {
    for(j <- 0 until n) {
      result(j)(m-1-i) = A(i)(j)
    }
  }

  for(i <- 0 until n) {

    for(j <- 0 until m) {
      print(result(i)(j) + " ")
    }
    println()
  }
}
