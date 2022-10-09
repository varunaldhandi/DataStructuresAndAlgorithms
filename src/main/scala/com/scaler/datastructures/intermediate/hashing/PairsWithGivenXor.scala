package com.scaler.datastructures.intermediate.hashing
import scala.collection.mutable.HashSet
object PairsWithGivenXor extends App {
  def solve(A: Array[Int], B: Int): Int  = {
    var numSet = HashSet.empty[Int]

    for (i <- 0 until A.length) {
      numSet.add(A(i))
    }

    var count = 0
    for (i <- 0 until A.length) {
      if (numSet.contains(A(i)) && numSet.contains(B ^ A(i))) {
        count = count + 1
        numSet.remove(A(i))
        numSet.remove(B ^ A(i))
      }
    }
    count
  }

  val A = Array(5, 4, 10, 15, 7, 6)
  val B = 5


  println(solve(A, B))
}
