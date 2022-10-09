package com.scaler.datastructures.intermediate.sorting

object LargestNumber extends App {
val A = Array(3, 30, 34, 5, 9).sorted(Ordering.Int.reverse).map(_.toString)
//println(A.mkString(","))
//  var result = A(0)
//  for(i <- 1 to A.length - 1) {
//    var left = (result + A(i)).toInt
//    var right = (A(i) + result).toInt
//
//    result = (left max right).toString
//    println(s"${left}, ${right}, ${result}")
//  }
//  println(result)

}
