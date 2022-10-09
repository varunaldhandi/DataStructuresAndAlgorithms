package com.scaler.problemsolving

object ArmstrongNumbers extends App {

  val num = 200


  for(i <- 1 to num) {
    var sum = 0
    var temp = i
    var digit  = 0
    while (temp > 0) {
      digit = temp % 10
      sum = sum + (digit * digit * digit)
      temp = temp / 10
    }
    if(sum == i) {
      println(i)
    }
  }




}
