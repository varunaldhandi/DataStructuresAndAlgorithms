package com.scaler.datastructures.intermediate.arrays.subarrays

object GoodSubArrays extends App {
  def solve(A: Array[Int], B: Int): Int = {
    var count = 0
    var sum = 0
    var len = 0

    for (i <- 0 until A.length) {
      sum = 0
      for (j <- i until A.length) {
        len = j - i + 1
        sum = sum + A(j)
        if ((len % 2 == 0 && sum < B) || (len % 2 == 1 && sum > B)) {
          count = count + 1
        }
      }
    }
    count
  }
  println(solve(Array(13, 16, 16, 15, 9, 16, 2, 7, 6, 17, 3, 9), 65))
}
