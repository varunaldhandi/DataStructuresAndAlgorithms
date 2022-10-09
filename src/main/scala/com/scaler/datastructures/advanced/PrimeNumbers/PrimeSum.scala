package com.scaler.datastructures.advanced.PrimeNumbers
import scala.collection.mutable.{ArrayStack, HashSet}

object PrimeSum extends App {
  def primeSum(A: Int) : Array[Int] = {
    if(A == 4) {
      return Array(2, 2)
    }
    ???
  }
  val A = 30
  var isPrime = new Array[Boolean](A + 1)
  for(i <- 2 until isPrime.length){
    isPrime(i) = true
  }

  for (i <- 2 to A) {
    if(isPrime(i) == true) {
      for (j <- i * i to(A, i)) {
        isPrime(j) = false
      }
    }
  }

  for(i <- 1 to A) {
    if(isPrime(i) == true && isPrime(A-i) == true) {
      println(s"i: ${i} and A-i: ${A-i}")
    }
  }

//  var primeSet = HashSet.empty[Int]
//  // Insert all the numbers for 2 to A into primeSet
//  for(i <- 2 to A) {
//    primeSet.add(i)
//  }
//
//
//
//  for (i <- 2 to A) {
//    for (j <- i * i to(A, i)) {
//      primeSet.remove(j)
//    }
//  }
//
//  for(i <- 1 to A) {
//    if(primeSet.contains(i) && primeSet.contains(A - i)) {
//      println(s"i: ${i} and A - i: ${A - i}")
//    }
//  }
//  for(i <- 2 to A) {
//    isPrime(i) = true
//  }

//  isPrime(1) = false
//
//  for (i <- 2 to A) {
//    for (j <- i * i to(A, i)) {
//        isPrime(j) = false
//    }
//  }



//  var primeSet = HashSet.empty[Int]
//  primeSet.add(2)
//
//  for(i <- 2 until isPrime.length) {
//    if(isPrime(i) == true){
//      primeSet.add(i)
//    }
//  }
//  println(primeSet)

//  for(i <- 2 to A) {
//    if(primeSet.contains())
//  }





}
