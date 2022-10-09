package com.scaler.datastructures.intermediate.hashing

import scala.collection.mutable.Map

object DistinctNumberInWindow extends App {

  val arr = Array(2, 2, 3, 8, 3, 9 , 4, 9, 4, 10)
  val B = 3
  //Building frequency map for the first B elements
  var freq = Map.empty[Int, Int]
  for(i <- 0 to B - 1) {
    if(freq.contains(arr(i))) {
      freq(arr(i)) = freq(arr(i)) + 1
    } else {
      freq(arr(i)) = 1
    }
  }

  //Sliding the frequency map
  var ans = freq.size
  var remove = 0
  var ins = B
//  1, 2, 3, 4, 5, 6, 7  -> n = 7, B = 3
  var n = arr.length
  var result = Array.empty[Int]
  result :+= freq.size
  while(ins < n) {
      freq(arr(remove)) = freq(arr(remove)) - 1
    if(freq(arr(remove)) == 0) {
      freq.remove(arr(remove))
    }
    if(freq.contains(arr(ins))) {
      freq(arr(ins)) = freq(arr(ins)) + 1
    } else {
      freq(arr(ins)) = 1
    }
    result :+= freq.size
    println(s"remove: ${remove}, ins: ${ins}, result : freq size : ${freq.size}")
    remove = remove + 1
    ins = ins + 1

  }

  println(result.mkString(","))
}
