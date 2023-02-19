package com.scaler.datastructures.advanced.BinarySearch

object AthMagicalNumber extends App {
  def gcd(A: Int, B: Int): Int = {
    var temp = 0
    var a = A
    var b = B
    if (a > b) {
      temp = a
      a = b
      b = temp
    }
    if (a == 0) return b
    return gcd(b % a, a)
  }

  def solve(A: Int, B: Int, C: Int) : Int = {
    var l = B min C
    var r = l * A
    var mid = 0
    var numMul = 0
    var lcm = (B * C) / gcd(B, C)

    while(l <= r) {
      mid = (l + r) / 2
      numMul = (mid / B) + (mid / C) - (mid / lcm)
      if(numMul == A) {
        if((mid % B == 0) || (mid % C == 0)) {
          return mid
        } else {
          r = mid - 1
        }
      } else if (numMul < A) {
        l = mid + 1
      } else {
          r = mid - 1
      }
    }
    mid
  }


//  val A = 2
//  val B = 3
  println(solve(11, 12, 13))
//println((12 * 13) / gcd(12, 13))



}
