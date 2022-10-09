package com.scaler.datastructures.intermediate.hashing

import scala.collection.mutable.Map

object LargestSubsequenceZero extends App {
//val ar = Array(5, 4, -6, 1, -2, 3, 7, -10, 5)
  val A = Array(1, 2, -2, 4, -4)
//  val A = Array(0, -10, 20, 3, 23, 10, -20, 2, 19, -29, 0)
  var startInd = -1
  var endInd = -1
  var len = 0
  var PS = 0
  var mp = Map.empty[Int, Int]
  mp(0) = -1

  for(i <- 0 to A.length - 1) {
    PS = PS + A(i)
    if(!mp.contains(PS)) {
      mp(PS) = i
    } else {
      var currentLen = i - mp(PS)
      if(len < currentLen) {
        startInd = mp(PS) + 1
        endInd = i
        len = i - mp(PS)
      }

    }
  }
//  println(s"Start Index: ${startInd} and End Index: ${endInd}")
  println(A.slice(startInd, endInd + 1).mkString(","))
}
