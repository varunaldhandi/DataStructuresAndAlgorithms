package com.scaler.datastructures.intermediate.arrays.carryforward

object SubSequences extends App {
  val ar = Array(6,9,6,10,9)
  var ans = ar(0)
  for(i <- 1 to ar.length -1 ) {
ans = ans ^ ar(i)
  }
  println(ans)
//  def getPrefixSumArray(ar: Array[String]) : Array[Int] = {
//    var PS = new Array[Int](ar.length)
//    PS(0) = if(ar(0) == 'G') 1 else 0
//
//    for(i <- 1 to ar.length - 1) {
//      if(ar(i) == "G") {
//        PS(i) = PS(i-1) + 1
//      } else {
//        PS(i) = PS(i-1)
//      }
//    }
//    PS
//  }
//
//  val str = "ABCGAG"
//  val ar = str.split("")
//  val n = ar.length
//  val prefixSumArray = getPrefixSumArray(ar)
//  println(prefixSumArray.mkString(","))
//  var cnt = 0
//  for(i <- 0 to ar.length - 1) {
//    if(ar(i) == "A") {
//      cnt = cnt + (prefixSumArray(n-1) - prefixSumArray(i))
//    }
//  }
//  println(cnt)
}
