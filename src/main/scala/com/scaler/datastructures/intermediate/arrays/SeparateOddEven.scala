package com.scaler.datastructures.intermediate.arrays

object SeparateOddEven extends App {
  val T = scala.io.StdIn.readLine().toInt
  var size = Array.empty[Int]
  var nums = Array.empty[String]

  for(i <- 1 to T) {
    size :+= scala.io.StdIn.readLine().toInt
    nums :+= scala.io.StdIn.readLine()
  }
  for(j <- 0 to T - 1) {
    var numbers = nums(j).split(" ").map(_.toInt)
    println(numbers.filter(_%2 == 1).mkString(" "))
    println(numbers.filter(_%2 == 0).mkString(" "))
  }
}
