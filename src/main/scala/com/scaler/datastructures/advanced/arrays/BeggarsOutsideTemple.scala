package com.scaler.datastructures.advanced.arrays

/**
 * There are A beggars sitting in a row outside a temple. Each beggar initially has an empty pot. When the devotees come to the temple, they donate some amount of coins to these beggars. Each devotee gives a fixed amount of coin(according to their faith and ability) to some K beggars sitting next to each other.

Given the amount P donated by each devotee to the beggars ranging from L to R index, where 1 <= L <= R <= A, find out the final amount of money in each beggar's pot at the end of the day, provided they don't fill their pots by any other means.
For ith devotee B[i][0] = L, B[i][1] = R, B[i][2] = P, Given by the 2D array B
 */
object BeggarsOutsideTemple extends App {

  def solve(A: Int, B: Array[Array[Int]]) : Array[Int] = {
    var start = 0
    var end = 0
    var value = 0
    var intermArr = new Array[Int](A)
    for (i <- 0 to B.length - 1) {
      start = B(i)(0) - 1
      end = B(i)(1)
      value = B(i)(2)
      intermArr(start) = intermArr(start) + value
      if (end != A) {
        intermArr(end) = intermArr(end) - value
      }
    }
    var result = new Array[Int](A)
    result(0) = intermArr(0)
    for (i <- 1 to A - 1) {
      result(i) = result(i - 1) + intermArr(i)
    }
    result
  }

  val A = 5
  val B = Array(Array(1, 2, 10), Array(2, 3, 20), Array(2, 5, 25))
  val result = solve(A, B)
  println(result.mkString(","))
}
