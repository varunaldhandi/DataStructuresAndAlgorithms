package com.scaler.datastructures.intermediate.arrays.bitmanipulation

object Pattern extends App {
  def printZeroes(n: Int) = {
    for(i <- 1 to n) print("0")
  }

  val N = 5
  var numZeroes = 0
  for(i <- 1 to N) {
    var l = ""
    var r = ""
    numZeroes = N - i
    printZeroes(numZeroes)
    for(j <- i to i * 2 -1) {
      l = l + j.toString
      r = if(j != i * 2 -1) j.toString + r else r
    }
    print(l+r)
    printZeroes(numZeroes)
    println()
  }
}
