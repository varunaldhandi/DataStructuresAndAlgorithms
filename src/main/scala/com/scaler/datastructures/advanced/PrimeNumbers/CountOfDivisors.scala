package com.scaler.datastructures.advanced.PrimeNumbers

object CountOfDivisors extends App {
  def countFactors(n: Int) : Int = {
    var i = 1
    var count = 0
    while(i * i <= n) {
      if(n % i == 0) {
        if(i == n/i) {
          count = count + 1
        } else {
          count = count + 2
        }
      }
      i = i + 1
    }
    count
  }
  val A = Array(2, 3, 4, 5)
  println(countFactors(A(0)))
  for(i <- 0 until A.length) {
    println(countFactors(A(i)))
  }

}
