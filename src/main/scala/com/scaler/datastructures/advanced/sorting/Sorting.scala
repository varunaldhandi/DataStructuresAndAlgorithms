package com.scaler.datastructures.advanced.sorting

object Sorting extends App {
val A = Array(9, 56, 34, 87, 1, 2, 987)
  var temp = 0
  for(i <- 0 until A.length) {
    var minElmnt = Int.MaxValue
    var ind = -1
    for(j <- i until A.length) {
      if(A(j) < minElmnt) {
        minElmnt = A(j)
        ind = j
      }
    }
    temp = A(ind)
    A(ind) = A(i)
    A(i) = temp
  }

  println(A.mkString(","))

}
