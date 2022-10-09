package com.scaler.datastructures.intermediate.recursion

object SumOfDigits extends App {
def solve(A: Int) : Int = {
  if(A == 0)
    return 0

  return A % 10 + solve(A / 10)
}
  val A = 9876
  println(solve(A))
}
