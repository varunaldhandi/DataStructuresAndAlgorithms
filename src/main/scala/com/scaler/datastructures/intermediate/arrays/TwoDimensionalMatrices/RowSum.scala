package com.scaler.datastructures.intermediate.arrays.TwoDimensionalMatrices

object RowSum extends App {
  def solve(A: Array[Array[Int]]) : Array[Int] = {
    ???
  }

  val A = Array(Array(1, 2, 3, 4), Array(5, 6, 7, 8), Array(9, 2, 3, 4))
  var result = Array.empty[Int]
  var sum = 0

  for(i <- 0 until A.length) {
    sum = 0
    for(j <- 0 until A(0).length) {
      sum = sum + A(i)(j)
    }
    result :+= sum
  }

  println(result.mkString(","))

}
