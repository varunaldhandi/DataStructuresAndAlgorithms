package com.scaler.datastructures.intermediate.hashing
import scala.collection.mutable.Map

object ShaggyAndDistances extends App {

def solve(A: Array[Int]) : Int = {
  var mp = Map.empty[Long, Int]
  var ans = A.length
  for (i <- 0 until A.length) {

    if (mp.contains(A(i))) {
      mp(A(i)) = i - mp(A(i))
      ans = if (ans < mp(A(i))) ans else mp(A(i))
      return ans

    } else {
      mp(A(i)) = i
    }
  }
  return -1
}

  var A = Array(7, 1, 3, 4, 1, 7)

  println(solve(A))

}
