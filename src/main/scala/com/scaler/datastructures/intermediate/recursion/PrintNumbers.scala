package com.scaler.datastructures.intermediate.recursion

object PrintNumbers extends App {
  def printNum(n: Int) : Unit = {
    if(n == 0)
      return

    printNum(n-1)
    println(n)
  }
  printNum(5)
}
