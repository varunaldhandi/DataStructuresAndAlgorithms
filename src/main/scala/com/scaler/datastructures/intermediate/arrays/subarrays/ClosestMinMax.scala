package com.scaler.datastructures.intermediate.arrays.subarrays

object ClosestMinMax extends App {
  def solve(A: Array[Int]): Int = {
    val minNum = A.min
    val maxNum = A.max
    val n = A.length
    var ans = n
    var min_ind = -1
    var max_ind = -1

    for (i <- n - 1 to(0, -1)) {
      if (A(i) == minNum) {
        min_ind = i
      }
      if (A(i) == maxNum) {
        if (min_ind != -1) {
          ans = ans min (min_ind - i + 1)
        }
      }

    }

    for (i <- n - 1 to(0, -1)) {
      if (A(i) == maxNum) {
        max_ind = i
      }
      if (A(i) == minNum) {
        if (max_ind != -1) {
          ans = ans min (max_ind - i + 1)
        }
      }
    }
    ans
  }

  val A = Array(3, 98, 56, 99, 1, 0)
  println(solve(A))

}
