package com.scaler.datastructures.intermediate.arrays.subarrays

object AlternatingSubArrays extends App {
  def solve(A: Array[Int], B: Int): Array[Int]  = {
    ???
  }

  val A = Array(0, 0, 0, 1, 1, 0, 0, 1, 1, 0, 0)
//    Array(1, 0, 1, 0, 1)
  val B = 5

  var result = Array.empty[Int]
  var PS = new Array[Int](A.length)
  PS(0) = A(0)
  for(i <- 1 until A.length){
    PS(i) = PS(i-1) + A(i)
  }
  println(PS.mkString(","))

  var count = 0
  for(i <- B until A.length - B) {
    println(s"i: ${i}")
    println(s"PS(${i} - 1) - PS(${i}-${B}) : ${PS(i - 1) - PS(i-B)}")
    println(s"PS(${i}+${B}) - PS(${i}): ${PS(i+B) - PS(i)}")
    if(B == 1 && (i - B - 1) < 0) {
        if(PS(i-1) == PS(i+B) - PS(i)) {
          count = count + 1
          result :+= i
        }
    } else {
      if (PS(i - 1) - PS(i - 1 - B) == PS(i + B) - PS(i)) {
        count = count + 1
        result :+= i
      }
    }
  }
  println(s"count: ${count}")
  println(result.mkString(","))
}
