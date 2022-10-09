package com.scaler.datastructures.intermediate.arrays.basics

object ArrayRotation extends App {

  def solve(ar: Array[Int], k: Int) : Array[Int] = {
    val n = ar.length
    var newAr = new Array[Int](n)

    for(i <- 0 to n-1) {
      newAr((i + k) % n) = ar(i)
    }
    newAr
  }
  val abc = scala.io.StdIn.readLine()
  val numRotations = scala.io.StdIn.readInt()
  val input = abc.split(" ").map(_.toInt)
//  val arSize = input(0)
//  val ar = (for(i <- 1 to arSize) yield input(i)).toArray
  println(solve(input, numRotations).mkString(" "))


}
