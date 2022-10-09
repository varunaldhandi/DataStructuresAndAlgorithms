package com.scaler.datastructures.intermediate.hashing
import scala.collection.mutable.Map
object SubArrayWithGivenSum extends  App {


  def solve(A: Array[Int], B: Int): Array[Int]  = {
    var mp = Map.empty[Int, Int]
    mp(0) = -1
    var PS = 0
    for (i <- 0 to A.length - 1) {
      PS = PS + A(i)
      println(s"PS is ${PS} and B-PS is ${B - PS}")
      if (mp.contains(PS - B)) {

        return A.slice(mp(PS - B) + 1, i + 1)
      } else {
        mp(PS) = i
      }
    }
    return Array(-1)

  }

  val A = Array(1, 2, 3, 4, 5)
  val B = 5
  println(solve(A, B).mkString(","))
}
