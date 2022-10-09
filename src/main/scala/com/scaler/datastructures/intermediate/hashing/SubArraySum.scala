package com.scaler.datastructures.intermediate.hashing

import scala.collection.mutable.Map
object SubArraySum extends App {
  def getPrefixSumArray(A : Array[Int]) : Array[Int] = {
    var PS = new Array[Int](A.length)
    PS(0) = A(0)
    for(i <- 1 to A.length - 1) {
      PS(i) = A(i) + PS(i-1)
    }
    PS
  }
  val A = Array(1,2,3,4,5)
  var PS = 0
  var mp = Map.empty[Int, Int]
  mp(0) = -1
  for(i <- 0 to A.length - 1) {
    PS = PS + A(i)
    if (mp.contains(PS + 5)) {
      println(s"${mp(PS) + 1} to ${mp(PS + 5)}")
    } else if(mp.contains(PS-5)) {
      println(s"${mp(PS-5) + 1} and ${mp(PS)}")
    }
    else {
      mp(PS) = i
    }
  }
  println(mp)
//  val PS = getPrefixSumArray(A)
//  for(s <- 0 to A.length - 1) {
//
//    for(e <- s to A.length - 1) {
//      if(s == 0) {
//        println(PS(e))
//      } else {
//        println(PS(e) - PS(s-1))
//      }
//    }



}
