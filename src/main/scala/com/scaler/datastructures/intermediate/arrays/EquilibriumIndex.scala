package com.scaler.datastructures.intermediate.arrays

object EquilibriumIndex extends App {
  def getPrefixSumArray(A: Array[Int]) : Array[Int] = {
    var PS = Array[Int]()
    PS :+= A(0)
    var i = 1
    while(i < A.length) {
      PS :+= PS(i-1) + A(i)
      i=i+1
    }
    PS
  }

  def solve(A: Array[Int]): Int  = {
    val PS = getPrefixSumArray(A)

    var min = -1
    var n = A.length
    var i = 0



    while(i < A.length) {
      var SL = 0
      if(i != 0)
        SL = PS(i-1)

      var SR = PS(n-1) - PS(i)

      if(SL == SR)
        return i
      i = i + 1
    }
    min
  }

//  val nums = Array(-7, 1, 5, 2, -4, 3, 0)
  val A = Array(1,2,3,7,1,2,3)
  println(solve(A))
}
