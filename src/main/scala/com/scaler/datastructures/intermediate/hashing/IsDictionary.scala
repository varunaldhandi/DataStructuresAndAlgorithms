package com.scaler.datastructures.intermediate.hashing
import scala.collection.mutable.Map

object IsDictionary extends App {
  def solve(A: Array[String], B: String): Int  = {
  ???
  }

  val A = Array("fine", "none", "no")
  val B = "qwertyuiopasdfghjklzxcvbnm"
  var freq = Map.empty[Char, Int]

  for(i <- 0 until B.length) {
    freq(B(i)) = i + 1
  }
  println(freq)

  var index = freq(A(0)(0))

  for(i <- 0 until A.length) {
    println(s"A(${i}, 0): ${A(i)(0)} and freq(A(${i}(0)): ${freq(A(i)(0))}")
    if(index <= freq(A(i)(0))) {
      index = freq(A(i)(0))
    } else {
      println("Not in order")
    }
  }


}
