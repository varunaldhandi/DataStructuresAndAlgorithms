package com.scaler.datastructures.intermediate.recursion

object NthRowKthElement extends App {
//def solve(A: Int, B: Int)
  def getString(N: Int, A: String) : String = {
    if(N == 1) {
      return "0"
    }

    var res = ""
    for(i<- 0 until A.length) {
      if(A(i) == '0'){
        res = res + "01"
      } else {
        res = res + "10"
      }
    }
    res
  }

//  println(getString("01011"))


}
