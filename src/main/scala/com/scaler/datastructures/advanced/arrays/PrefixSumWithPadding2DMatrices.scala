package com.scaler.datastructures.advanced.arrays

object PrefixSumWithPadding2DMatrices extends App {
  val A = Array(Array(1, 2, 3), Array(4, 5, 6), Array(7, 8, 9))
  val rows = 3
  val cols = 3

  var PS = Array.ofDim[Int](rows + 1, cols + 1)
  for(i <- 1 to A.length) {
    for(j <- 1 to A.length){
      PS(i)(j) = PS(i-1)(j) + PS(i)(j-1) - PS(i-1)(j-1) + A(i-1)(j-1)
    }
  }

  for (i <- 0 to A.length) {
    for (j <- 0 to A.length) {
      print(PS(i)(j) + " ")
    }
    println
  }



}
