package com.scaler.contest
import scala.collection.mutable.Map

object PalindromeBySwap extends  App {
var A = "MALAYALAM"
  var freq = Map.empty[Char, Int]
//  Build frequency table
  for(i <- 0 to A.length - 1) {
    if(freq.contains(A(i))) {
      freq(A(i)) = freq(A(i)) + 1
    } else {
      freq(A(i)) = 1
    }
  }
  var odd = 0

  for(k <- freq.keys) {
    if(freq(k) % 2 == 1) {
      odd = odd + 1
    }
  }
  if(A.length % 2 == 1 && odd == 1) {
    println("Odd Palindrome")
  } else if (A.length % 2 == 0  && odd == 0) {
    println("Even Palindrome")
  } else {
    println("Not possible")
  }

}
