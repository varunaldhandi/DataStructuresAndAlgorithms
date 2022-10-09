package com.scaler.datastructures.advanced.PrimeNumbers

object LuckyNumbers extends App {
  def solve(A: Int) : Int = {
    ???
  }
  val A  = 12
  var isPrime = new Array[Boolean](A + 1)
  var cntArr = new Array[Int](A + 1)

  for(i <- 2 to A) {
    isPrime(i) = true
  }

  for(i <- 2 to A) {
    if(isPrime(i) == true) {
      for (j <- i * i to(A, i)) {
            isPrime(j) = false

      }
    }

  }




  for(i <- 2 to A) {
    for(j <- 2 * i to (A, i)) {
      cntArr(j) = cntArr(j) + 1
    }
  }




  println(isPrime.mkString(","))
  println(cntArr.mkString(","))
//  var finalCount = 0
//  for(i <- 1 to A) {
//    var count = 0
//    for(j <- 2 until isPrime.length) {
//      if(isPrime(j) == true && i % j == 0){
//        count = count + 1
//      }
//    }
//    if(count == 2) {
//      finalCount = finalCount + 1
//    }
//  }
//
//  println(finalCount)

}
