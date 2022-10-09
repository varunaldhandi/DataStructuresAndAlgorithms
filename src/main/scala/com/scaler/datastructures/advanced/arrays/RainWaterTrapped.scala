package com.scaler.datastructures.advanced.arrays

object RainWaterTrapped extends  App {

  def getLeftMaxArray(A: Array[Int]) : Array[Int] = {
    var leftMax = new Array[Int](A.length)
    leftMax(0) = A(0)
    for(i <- 1 until A.length ) {
      if(A(i) > leftMax(i-1)) {
        leftMax(i) = A(i)
      } else {
        leftMax(i) = leftMax(i-1)
      }

    }
    leftMax
  }

  def getRightMaxArray(A: Array[Int]): Array[Int] = {
    var rightMax = new Array[Int](A.length)
    rightMax(A.length - 1) = A(A.length - 1)

    for (i <- A.length - 2 to(0, -1)) {
      if (A(i) > rightMax(i + 1)) {
        rightMax(i) = A(i)
      } else {
        rightMax(i) = rightMax(i + 1)
      }
    }

    rightMax
  }

  def trap(A: Array[Int]): Int = {
    var leftMaxArr = getLeftMaxArray(A)
    var rightMaxArr = getRightMaxArray(A)
    var leftMax = 0
    var righMax = 0
    var ans = 0
    for(i <- 1 until A.length - 1) {
          leftMax = leftMaxArr(i-1)
          righMax = rightMaxArr(i+1)
          ans = ans + (0 max ((leftMax min righMax) - A(i)))
    }
    ans
  }
//  0, 1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1
  // expected ans: 6
//  val A = Array(0,1,0,2)
//  val A = Array(2, 15, 6, 9, 2, 5, 7, 1)
  val A = Array(0, 1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1)
  val ans = trap(A)
  println(s"The final ans: ${ans}")


}
