package com.scaler.datastructures.intermediate.arrays.subarrays
import com.scaler.datastructures.intermediate.arrays.subarrays.AlternatingSubArrays.A

import scala.util.control._
object AlternatingSubArrays extends App {
  def solve(A: Array[Int], B: Int): Array[Int]  = {
    var result = Array.empty[Int]
    if(B == 0) {
      for(i <- 0 until A.length) {
        result :+= i
      }
      return result
    }

    var loop = new Breaks

    for (i <- 0 to A.length - ((2 * B) + 1)) {
      var l = i
      var r = i + (2 * B)
      var isAlt = false
      loop.breakable {
        for(j <- l + 1 to r) {
          if(A(j) != A(j -1)) {
            isAlt = true
          } else {
            isAlt = false
            loop.break()
          }
        }

        if (isAlt == true) {
          result :+= B + i
        }
      }
    }
    result
  }
  val A = Array(0, 0, 0, 1, 0, 0, 0, 1, 0, 1, 1)
  val B = 1
  println(solve(A, B).mkString(","))
}
