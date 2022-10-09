package com.scaler.datastructures.intermediate.arrays.subarrays

object SubArrayWithLeastAverage extends App {
def solve(A: Array[Int], B: Int) : Int = {

  if(B > A.length) {

  }
  var sum = 0
  for (i <- 0 until B) {
    sum = sum + A(i)
  }

  println(s"Initial sum: ${sum}")

  var avg = sum / B
  var index = 0

  for (i <- 0 until A.length - B) {
    sum = sum - A(i) + A(i + B)
    println(s"i: ${i}, sum: ${sum}, average: ${sum / B}")
    if (sum / B <= avg) {
      avg = sum / B
      index = i + 1
    }
  }
  index
}
//  val A = Array(3, 7, 90, 20, 10, 50, 40)
  val A = Array(15, 7, 11, 7, 9, 8, 18, 1, 16, 18, 6, 1, 1, 4, 18)

  val B = 6
  println(s"A.length: ${A.length}, A.length - B: ${A.length - B}")
  println(solve(A, B))
}
