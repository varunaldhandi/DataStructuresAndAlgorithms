package com.scaler.datastructures.intermediate.arrays.bitmanipulation

object BitCheck extends App {
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
  def checkBit(n: Int, i: Int) : Boolean = {
    val num = n & (1<<i)
    if(num !=0) true else false

  }
  println(checkBit(10, 1))
}
