package com.scaler.datastructures.intermediate.arrays.carryforward

object AmazingSubArrays extends App {
  def solve(A: String): Int  = {
    var ans = 0
    for (i <- 0 until A.length) {
      if (A(i) == 'a' || A(i) == 'e' || A(i) == 'i' || A(i) == 'o' || A(i) == 'u' || A(i) == 'A' || A(i) == 'E' || A(i) == 'I' || A(i) == 'O' || A(i) == 'U') {
        ans = ans % 10003 + (A.length - i) % 10003
      }
    }
    ans
  }

  var A = "Amazing"



}
