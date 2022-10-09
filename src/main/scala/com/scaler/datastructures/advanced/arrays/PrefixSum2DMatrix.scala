package com.scaler.datastructures.advanced.arrays

object PrefixSum2DMatrix extends App {

  val A = Array(Array(1, 2, 3), Array(4, 5, 6), Array(7, 8, 9))
  val rows = 3
  val cols = 3

  var PS = Array.ofDim[Int](rows, cols)
println(PS(0)(1))
//  PS(0)(0) = A(0)(0)
//
//  for(i <- 1 until A.length){
//    PS(0)(i) = PS(0)(i-1) + A(0)(i)
//  }
//  for(j <- 1 until A.length){
//    PS(j)(0) = PS(j-1)(0) + A(j)(0)
//  }
//  for(i<- 1 until A.length) {
//    for(j <- 1 until A.length) {
//      PS(i)(j) = PS(i-1)(j) + PS(j)(i-1) - PS(i-1)(j-1) + A(i)(j)
////      println(PS(i)(j))
//    }
//  }
//
//  for(i<- 0 until A.length){
//    for(j <- 0 until A.length){
//      print(PS(i)(j) + " ")
//    }
//    println
//  }


}
