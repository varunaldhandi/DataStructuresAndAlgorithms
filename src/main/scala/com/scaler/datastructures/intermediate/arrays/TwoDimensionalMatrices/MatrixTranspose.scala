package com.scaler.datastructures.intermediate.arrays.TwoDimensionalMatrices

object MatrixTranspose extends App {
  def solve(A: Array[Array[Int]]): Array[Array[Int]] = {
    var result = Array.ofDim[Int](A(0).length, A.length)

    for (i <- 0 until A.length) {
      for (j <- 0 until A(0).length) {
        result(j)(i) = A(i)(j)
      }
    }
    result
  }

  val A = Array(Array(1, 2, 3, 10), Array(4, 5, 6, 11), Array(7, 8, 9, 12))
  val result = solve(A)
  for(i <- 0 until result.length) {
    for(j <- 0 until result(0).length){
      print(result(i)(j) + " ")
    }
    println()
  }


}
