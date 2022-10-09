package com.scaler.datastructures.advanced.PrimeNumbers

object CountOfPrime extends App {
  val A = 30
  var result = new Array[Boolean](A + 1)

  for(i <- 0 until result.length) {
    result(i) = true
  }

  result(1) = false
  for(i <- 2 to A) {
    for(j <- 2 * i to (A, i)) {
      result(j) = false
    }
  }

  for(i <- 0 until result.length)
    {
      println(s"i: ${i}, result(${i}) : ${result(i)}")
    }

}
