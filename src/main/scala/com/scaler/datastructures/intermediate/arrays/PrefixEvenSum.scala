package com.scaler.datastructures.intermediate.arrays

object PrefixEvenSum extends App {
  val nums = Array(3, -2, 4, 6, -3, 5)

  var PE = Array[Int]()
  var i = 1
  PE :+= nums(0)

  while (i < nums.length) {
    if (i % 2 == 1) {
      PE :+= PE(i - 1)
    } else {
      PE :+= PE(i - 1) + nums(i)
    }
    i = i + 1
  }


  println(PE.mkString(","))

  def getPrefixEvenSum(PE: Array[Int], q: Int): Int = {
    if (q % 2 == 0) {
      PE(q)
    } else {
      PE(q - 1)
    }
  }

  val q = 5

  println(getPrefixEvenSum(PE, q))

  //
  //  PE :+= 2
  //  PE :+= 1
  //  val abc = PE.appended(3)
  //  println(PE.length)
  //  println(PE(0))
  //  println(PE(1))
  //
  //  abc foreach println
}
