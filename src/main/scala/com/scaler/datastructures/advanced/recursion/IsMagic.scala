package com.scaler.datastructures.advanced.recursion

object IsMagic extends App {
def solve(A: Int) : Int = {
  if(A == 0) {
    return  0
  }
  return (A % 10) + solve(A / 10)

}

  println(solve(83557))
}
