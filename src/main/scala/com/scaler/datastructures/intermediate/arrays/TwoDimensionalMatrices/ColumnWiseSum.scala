package com.scaler.datastructures.intermediate.arrays.TwoDimensionalMatrices

object ColumnWiseSum extends App {
  def solve(A: Array[Array[Int]]): Array[Int]  = {
    val m = A.length
    val n = A(0).length
    var result = Array.empty[Int]
    for(i <- 0 until n)
      {
        var sum = 0
        for(j <- 0 until m) {
          sum = sum + A(j)(i)
        }
        result :+= sum
      }
      result
  }
  val A = Array(Array(1,2,3,4), Array(5, 6, 7, 8), Array(9,2,3,4))
  println(solve(A).mkString(","))

}
