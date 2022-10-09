package com.scaler.datastructures.intermediate.arrays.carryforward

object LeadersOfArray extends App {
  def solve(A: Array[Int]): Array[Int] = {
    var leadersArr = Array.empty[Int]
    var ans = A(A.length - 1)
    leadersArr :+= ans
    for (i <- A.length - 2 to(0, -1)) {
      if (A(i) > ans) {
        ans = A(i)
        leadersArr :+= ans
      }
    }
    leadersArr
  }
  val A = Array(16, 17, 4, 3, 5, 2)
  println(solve(A).mkString(","))

}
