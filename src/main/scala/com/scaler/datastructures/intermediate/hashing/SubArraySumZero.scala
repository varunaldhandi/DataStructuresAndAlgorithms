package com.scaler.datastructures.intermediate.hashing

import scala.collection.mutable.Map

object SubArraySumZero extends  App {
  val A = Array(1, 2, 3, 4, 5)
  var mp = Map.empty[Long, Long]
  mp(0) = -1
  var PS = 0
  for(i <- 0 to A.length - 1){
    PS = PS + A(i)
    if(mp.contains(PS)) {
      println(1)
    } else {
      mp(PS) = i
    }
  }

}
