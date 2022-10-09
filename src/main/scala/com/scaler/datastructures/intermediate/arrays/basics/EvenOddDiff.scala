package com.scaler.datastructures.intermediate.arrays.basics

object EvenOddDiff extends App {
val A = Array(-98, 54, -52, 15, 23, -97, 12, -64, 52, 85)
  var evenMax = -999999999
  var oddMax = -999999999
  println(A.filter(_%2 == 0).mkString(","))
  println(A.filter(_%2 != 0).mkString(","))
  for(i <- 0 to A.length -1) {
    if(A(i) % 2 == 0) {
      evenMax = if(evenMax > A(i)) evenMax else A(i)
    } else {
      oddMax = if(oddMax > A(i)) oddMax else A(i)
    }
  }
  println(evenMax)
  println(oddMax)
  println(evenMax - oddMax)
}
