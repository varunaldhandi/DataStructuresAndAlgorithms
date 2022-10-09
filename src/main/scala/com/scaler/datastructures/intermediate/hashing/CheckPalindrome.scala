package com.scaler.datastructures.intermediate.hashing
import scala.collection.mutable.Map

object CheckPalindrome extends App {
  /**
   * Given a string A consisting of lowercase characters.
   *
   *  Check if characters of the given string can be rearranged to form a palindrome.
   *
   *  Return 1 if it is possible to rearrange the characters of the string A such that it becomes a palindrome else return 0.
   */

  def solve(A: String) : Int = {
    var freq = Map.empty[Int, Int]
    var oddCnt = 0

    for (i <- 0 until A.length) {
      if (freq.contains(A(i))) {
        freq(A(i)) = freq(A(i)) + 1
      } else {
        freq(A(i)) = 1
      }
      if (freq(A(i)) % 2 == 1) {
        oddCnt = oddCnt + 1
      } else {
        oddCnt = oddCnt - 1
      }
    }

    if (A.length % 2 == 1 && oddCnt == 1) {
      return 1
    } else if (A.length % 2 == 0 && oddCnt == 0) {
      return 1
    } else {
      return 0
    }
  }
  val A = "abbaee"
  println(solve(A))







}
