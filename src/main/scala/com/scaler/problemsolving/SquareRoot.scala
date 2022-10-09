package com.scaler.problemsolving

import scala.math.sqrt


object SquareRoot extends App {

  def getSquareRoot(num: Int): Int = {
    if(num % 10 != 1 && num % 10 != 4 && num % 10 != 5 && num % 10 != 6 && num % 10 != 9 && num % 100 != 0) {
      -1
    } else {
      sqrt(num).toInt
    }
  }

//val num = scala.io.StdIn.readInt()



}
