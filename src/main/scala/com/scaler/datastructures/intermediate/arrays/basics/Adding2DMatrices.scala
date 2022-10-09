package com.scaler.datastructures.intermediate.arrays.basics

object Adding2DMatrices extends App {
 val A : Array[Array[Int]] = Array(Array(1,2,3), Array(4, 5, 6), Array(7,8,9))
  val B : Array[Array[Int]] = Array(Array(9, 8, 7), Array(6, 5, 4), Array(3, 2, 1))

  var result = Array.empty[Array[Int]]

  for(i <- 0 to A.length - 1) {
    var intRes = Array.empty[Int]
    for(j <- 0 to A(i).length - 1) {
        intRes :+=  A(i)(j) + B(i)(j)
    }
    result :+= intRes
  }
  println(result(0).mkString(","))
}
