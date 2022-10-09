package com.scaler.datastructures.intermediate.sorting

object ElementsRemoval extends App {
  var ar = Array(8,0,10)
  var ordArr = ar.sorted
  var n = ar.length
  var sum = 0

  for(i <- 0 to n -1 ) {
    sum = sum + ((n - i) * ordArr(i))
  }
  println(sum)
}
