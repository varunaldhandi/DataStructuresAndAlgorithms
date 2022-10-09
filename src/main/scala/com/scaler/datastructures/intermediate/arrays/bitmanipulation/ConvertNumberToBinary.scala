package com.scaler.datastructures.intermediate.arrays.bitmanipulation

object ConvertNumberToBinary extends App {
def toBinary(num: Int) : String = {
  var i = -1
  var n = num
  var ans = ""
  while(n != 0) {
    ans = (n % 2).toString + ans
    n = n / 2
  }
  ans
}
  val num = 999
  println(toBinary(num))
}
