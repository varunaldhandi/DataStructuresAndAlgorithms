package com.scaler.datastructures.intermediate.hashing

import scala.collection.mutable.Map
object CommonElements extends App {
val A = Array(1,2,2,1)
  val B = Array(2, 3, 1, 2)
  var result = Array.empty[Int]
  var mp = Map.empty[Int, Int]
  for(i <- 0 to B.length - 1){
    if(mp.contains(B(i))) {
      mp(B(i)) = mp(B(i)) + 1
    } else {
      mp(B(i)) = 1
    }
  }

  for(i <- 0 to A.length - 1){
    if(mp.contains(A(i))) {
      result :+= A(i)
      mp(A(i)) = mp(A(i)) - 1
      if(mp(A(i)) == 0) {
        mp.remove(A(i))
      }
    }
  }
  println(result.mkString(","))

}
