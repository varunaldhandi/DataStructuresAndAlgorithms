package com.scaler.datastructures.intermediate.arrays.bitmanipulation

object UniqueElement extends App {
val ar = Array(6,9,6,10,9)
  var ans = ar(0)
  for(i <- 1 to ar.length - 1) {
    ans = ans ^ ar(i)
  }
  println(ans)
}