package com.scaler.datastructures.intermediate.arrays.basics

object LeftRotations extends App {
//  val ar = Array(5, 17, 100, 11)
//  val n = ar.length
//  val result = new Array[Int](n)
//  for(i <- 0 to ar.length - 1) {
////    println(s"index: ${i}, value: ${ar((i + 3) % n)}")
//    result(i) = ar((i+9) % n)
//  }
//  println(result.mkString(","))

  /**
   * Given an array of integers A and multiple values in B
   *  , which represents the number of times array A needs to be left rotated.
   *
   *  Find the rotated array
   *  for each value and
   *  return the result in the from of a matrix where ith row represents the rotated array
   *  for the ith value in B.
   *
   *
   */
  def leftRotateArray(arr: Array[Int], k: Int) : Array[Int] = {
    val n = arr.length
    var result = new Array[Int](n)

    for(i <- 0 to arr.length - 1) {
      result(i) = arr((i + k) % n)
    }
    result
  }
  val A = Array(1,2,3,4,5)
  val B = Array(2, 3)
  var result = Array.empty[Array[Int]]
  for(i <- 0 to B.length - 1) {
    result :+= leftRotateArray(A, B(i))
  }
  println(result(0).mkString(","))
  println(result(1).mkString(","))



}
