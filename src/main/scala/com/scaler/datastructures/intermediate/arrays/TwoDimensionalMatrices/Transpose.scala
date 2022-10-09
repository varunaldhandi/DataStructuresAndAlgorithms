package com.scaler.datastructures.intermediate.arrays.TwoDimensionalMatrices

object Transpose extends  App {
def solve(A: Array[Array[Int]]) : Array[Array[Int]] = {
  val r  = A.length
  val c = A(0).length
  var temp = 0
  for(i <- 0 until(r, -1)) {
    for(j <- i until(c, -1)) {
      temp = A(i)(j)
      A(i)(j) = A(j)(i)
      A(j)(i) = temp
    }
  }

  for(i <- 0 until(r, -1)) {
    var innerArr = A(i)
    var firstEle = 0
    var lastEle = innerArr.length - 1
    var temp = 0
    while(firstEle < lastEle) {
      temp = innerArr(firstEle)
      innerArr(firstEle) = innerArr(lastEle)
      innerArr(lastEle) = temp
      firstEle = firstEle + 1
      lastEle = lastEle - 1
    }
    A(i) = innerArr
  }
  return A
}

  val A = Array(Array(1, 2), Array(3, 4))
  val ans = solve(A)
  for(i <- 0 until A.length) {
    println
    for(j <- 0 until A(0).length) {
      println(ans(i)(j) + " ")
    }
  }
}
