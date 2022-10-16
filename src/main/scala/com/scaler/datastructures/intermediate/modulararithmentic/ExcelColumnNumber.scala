package com.scaler.datastructures.intermediate.modulararithmentic

import scala.math._

object ExcelColumnNumber extends App {
  def titleToNumber(A: String): Int = {
    var sum = 0
    var exp = 0

    for (i <- 0 until A.length) {
      exp = A.length - i - 1
      sum = sum + ((pow(26, exp).toInt) * (A(i) - 64))
    }
    sum
  }
  //  val A = "AB"
  //  val n = A.length
  //  var sum = 0
  //
  //  for(i <- n-1 to (0, -1)){
  //
  //    sum = sum + A(i).toInt
  //
  //  }
  //  println(sum)

  val A = "ABCDE"

  println(titleToNumber(A))


}
