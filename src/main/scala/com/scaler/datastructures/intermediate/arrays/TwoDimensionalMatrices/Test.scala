package com.scaler.datastructures.intermediate.arrays.TwoDimensionalMatrices

object Test extends App {
val m = 9
  val n = 7
  for(i <- 0 until m){
    for(j <- 0 until n){
      for(k <- 0 until n) {
        println(s"(i)(k): (${i})(${k}) and (k)(j): (${k})(${j})")
      }
    }
  }
}
