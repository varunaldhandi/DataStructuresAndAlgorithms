package com.scaler.datastructures.intermediate.recursion

object MagicNumber extends  App {
  def getSumOfDigitsRecursively(A: Int) : Int = {
    if (A == 0) return 0
    var ans = A % 10 + getSumOfDigitsRecursively(A / 10)
    ans % 10 + getSumOfDigitsRecursively(ans / 10)
  }
def solve(A: Int) : Int = {
  if(getSumOfDigitsRecursively(A) == 1)
      1
  else
    0
}
  val A = 83557
  println(solve(A))
}
