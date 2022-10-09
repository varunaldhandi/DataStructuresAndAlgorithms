package com.scaler.datastructures.advanced.GCD

object LargestCoPrimeDivisor extends App {

  def gcd(A: Int, B: Int): Int = {
    var a = A
    var b = B
    var temp = 0
    if (a > b) {
      temp = a
      a = b
      b = temp
    }
    if (a == 0) return b
    return gcd(b % a, a)
  }

  def cpFact(A: Int, B: Int): Int  = {
    for (i <- A to(1, -1)) {
      if (A % i == 0 && gcd(i, B) == 1) {
        return i
      }
    }
    return 1
  }
  val A = 30
  val B = 12
  println(cpFact(A, B))




}
