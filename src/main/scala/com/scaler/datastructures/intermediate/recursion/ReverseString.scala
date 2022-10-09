package com.scaler.datastructures.intermediate.recursion

object ReverseString extends App {

//  def stringRev(A: Array[String], n: Int) : String = {
//    if(n == 0) {
//      return A(0)
//    }
//    return A(n) + stringRev(A, n-1)
//  }

  def sum(A: Array[String], n: Int) : Int = {
    if(n == 0){
      return A(0).toInt
    }
    return sum(A, n-1) + A(n).toInt
  }

  val num = 1234.toString.split("")
  println(sum(num, num.length - 1))
//  val str = "cool"
//  val n = str.length - 1
//  val A = str.split("")
//  println(stringRev(A, n))

}
