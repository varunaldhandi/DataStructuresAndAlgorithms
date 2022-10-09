package com.scaler.datastructures.intermediate.arrays.subarrays

object AlternatingSubArrays2 extends App {
  def solve(A: Array[Int], B: Int): Array[Int]  = {
    var N = A.length
    var inc = N - (2 * B)
    var subLen = (2 * B) + 1
    var isAlt = false
    var result = Array.empty[Int]

    if (B == 0) {
      for (i <- 0 until N) {
        result :+= i
      }
      return result
    } else {
      for (i <- 0 until inc) {
        isAlt = false
        for(j <- i + 1 until i + subLen) {
          if(A(j) != A(j-1)) {
            isAlt = true
          } else {
            isAlt = false
          }
        }
        var k = i + (((2 * B) + 1) / 2)

        if(isAlt == true) {
          result :+= k
        }
      }
    }

    return result
  }
  val A = Array(0, 0, 0, 1, 0, 0, 0, 1, 0, 1, 1)
  val B = 1
  println(solve(A, B).mkString(","))




}
