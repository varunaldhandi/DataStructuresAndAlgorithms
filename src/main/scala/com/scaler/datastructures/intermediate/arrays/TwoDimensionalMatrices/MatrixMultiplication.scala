package com.scaler.datastructures.intermediate.arrays.TwoDimensionalMatrices

object MatrixMultiplication extends App {
  def solve(A: Array[Array[Int]], B: Array[Array[Int]]): Array[Array[Int]] = {
    val aRowSize = A.length
    val aColSize = A(0).length

    val bRowSize = B.length
    val bColSize = B(0).length

    val outRowSize = aRowSize
    val outColSize = bColSize

    var result = Array.ofDim[Int](outRowSize, outColSize)

    for (i <- 0 until outRowSize) {
      for (j <- 0 until outColSize) {
        var sum = 0
        for (k <- 0 until bRowSize) {
          sum = sum + (A(i)(k) * B(k)(j))
        }
        result(i)(j) = sum
      }
    }
    result
  }

//  val A = Array(Array(1, 2), Array(3, 4))
  val A = Array(Array(62, -37, -49, 18, -53, 14, 51),  Array(62, -52, -11, -21, -62, -44, -95),  Array(20, 78, -29, -49, -17, 21, 83),  Array(-99, -69, -39, -47, 19, -50, -90),  Array(91, -96, 63, -23, 5, 94, 49),  Array(17, 1, 16, 63, -78, -13, -100),  Array(-7, 72, 16, 86, -53, 94, 85),  Array(-82, 78, 96, -45, -42, 38, 34),  Array(-88, 37, 12, 31, -91, 51, 23))
//  val B = Array(Array(5, 6), Array(7, 8))

  val B = Array(Array(90, 68, 2, 54, -59),  Array(78, -86, 8, -30, 24),  Array(-92, 84, -62, 13, 2),  Array(12, -73, -53, -91, -4),  Array(74, 85, -51, -4, 37),  Array(-30, -27, 10, -78, 29),  Array(-96, 39, -42, 93, 78))

  val result = solve(A, B)
  for(i <- 0 until result.length) {

    for(j <- 0 until result(0).length){
      print(result(i)(j) + "  ")
    }
    println
  }


}
