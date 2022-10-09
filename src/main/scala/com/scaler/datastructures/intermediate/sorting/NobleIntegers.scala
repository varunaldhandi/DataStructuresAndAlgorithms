package com.scaler.datastructures.intermediate.sorting

object NobleIntegers extends App {
  def nobleIntegerExists(ordArr: Array[Int], indArr: Array[Int]) : Int = {
    for(i <- 0 to ordArr.length - 1) {
      if(ordArr(i) == indArr(i)) {
        return 1
      }
    }
    return -1
  }

  def getIndexArray(ordArr: Array[Int]) : Array[Int] = {
    var indArr = new Array[Int](ordArr.length)
    for(i <- 0 to ordArr.length - 1) {
      if(i != 0) {
        if(ordArr(i) == ordArr(i-1)) {
          indArr(i) = indArr(i-1)
        } else {
          indArr(i) = i
        }
      }
    }
    indArr
  }

  var ar = Array(3,2,1,3)
  var ordArr = ar.sorted(Ordering.Int.reverse)
  var indArr = getIndexArray(ordArr)
//  println(indArr.mkString(","))
println(nobleIntegerExists(ordArr, indArr))

}
