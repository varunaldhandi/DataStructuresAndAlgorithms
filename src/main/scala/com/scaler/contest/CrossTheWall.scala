package com.scaler.contest

object CrossTheWall extends  App {
val A = Array(Array(1,9), Array(9, 4, 12))
  for(i <- 0 to A.length - 1) {
    println(A(i).mkString(","))
  }
}
