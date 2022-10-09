package com.scaler.datastructures.intermediate.hashing

import scala.collection.mutable.Map

object NumberFrequency extends App {
val arr = Array(2, 6, 3, 8, 2, 8, 2, 3, 8, 10, 6, 9)
  val queries = Array(2, 8, 3, 5)
  var freq = Map[Int, Int]()

  // Building frequency table
  for(i <- 0 to arr.length - 1) {
    if(freq.contains(arr(i))) {
      freq(arr(i)) = freq(arr(i)) + 1
    } else {
      freq(arr(i)) =  1
    }
  }

  for(i <- 0 to queries.length - 1) {
    if(freq.contains(queries(i))) {
      print(freq(queries(i)))
    } else {
      print(0)
    }
  }


}
