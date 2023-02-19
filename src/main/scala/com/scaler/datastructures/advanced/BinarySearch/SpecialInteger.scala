package com.scaler.datastructures.advanced.BinarySearch

object SpecialInteger extends App {
  def solve(A: Array[Int], B: Int) : Int = {
    var ans = 0
    var l = 1
    var r = A.length
    var mid = 0
    while(l <= r) {
      mid = (l + r) / 2
      if(isSpecial(A, mid, B)) {
        ans = mid
        l = mid + 1
      } else {
        r = mid - 1
      }
    }
//    for(k <- 1 to A.length) {
//      if(isSpecial(A, k, B)) {
//        ans = k
//      } else {
//        return ans
//      }
//    }
    ans
  }

  def isSpecial(A: Array[Int], K: Int, B: Int) : Boolean = {
    var isValid = false
    var sum = 0

    for(i <- 0 until K) {
      sum = sum + A(i)
    }
    if(sum <= B) isValid = true else return false
    for(i <- 1 to A.length - K) {
      sum = sum - A(i - 1) + A(i - 1 + K)
      if(sum <= B) isValid = true else return false
    }

    isValid
  }

  val A = Array(1, 2, 3, 4, 5)
  val B = 10
  println(solve(A, B))
//isSpecial(A, 2, B)
//  for(k <- 0 until A.length) {
//    println(isSpecial(A, k, B))
//  }
//  for(i <- 0 until 1){
//    println(i)
//  }

}
