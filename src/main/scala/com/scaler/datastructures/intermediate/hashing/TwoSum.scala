package com.scaler.datastructures.intermediate.hashing

import scala.collection.mutable.Map
import scala.util.control._


/**
 * Given an array of integers, find two numbers such that they add up to a specific target number.

The function twoSum should return indices of the two numbers such that they add up to the target, where index1 < index2. Please note that your returned answers (both index1 and index2 ) are not zero-based. Put both these numbers in order in an array and return the array from your function ( Looking at the function signature will make things clearer ). Note that, if no pair exists, return empty list.

If multiple solutions exist, output the one where index2 is minimum. If there are multiple solutions with the minimum index2, choose the one with minimum index1 out of them.


 */


object TwoSum extends App {
  def solve(A: Array[Int], B: Int) : Array[Int] = {
    var mp = Map.empty[Int, Int]
    for (i <- 0 to A.length - 1) {
      if (mp.contains(B - A(i))) {
        return Array(mp(B-A(i)) + 1, i + 1)
      } else if (!mp.contains(A(i))) {
        mp(A(i)) = i
      }
    }

    return Array.empty[Int]
  }


  val A = Array(4, 7, -4, 2, 2, 2, 3, -5, -3, 9, -4, 9, -7, 7, -1, 9, 9, 4, 1, -4, -2, 3, -3, -5, 4, -7, 7, 9, -4, 4, -8)
  val B = -3
  println(solve(A, B).mkString(","))


}
