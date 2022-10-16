package com.scaler.datastructures.advanced.BinarySearch
import scala.util.control._
object SquareRootOfANumber extends App {
val A = 2147483647
  var l = 1L
  var r = A.toLong
  var mid = 0L
  val loop = new Breaks
  var ans = 0L
  loop.breakable {
    while (l <= r) {
      mid = (l + r) / 2
      println(s"l: ${l}, r: ${r}, mid: ${mid}")
      if (mid * mid == A) {
        println(s"Answer: ${mid}")
        loop.break()
      } else if (mid * mid < A) {
        ans = mid
        l = mid + 1
      } else {
        r = mid - 1
      }
    }
  }
  println(s"Answer : ${ans.toInt}")
}
