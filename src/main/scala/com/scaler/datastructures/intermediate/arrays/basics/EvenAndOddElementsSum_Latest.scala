package com.scaler.datastructures.intermediate.arrays.basics

object EvenAndOddElementsSum_Latest extends App {
  def getPrefixEvenAndOddSumArrays(ar: Array[Int]): (Array[Int], Array[Int]) = {
    var PE = Array[Int]()
    var PO = Array[Int]()
    var i = 1
    PE :+= ar(0)
    PO :+= 0

    while (i < ar.length) {
      if (i % 2 == 0) {
        PE :+= PE(i - 1) + ar(i)
        PO :+= PO(i - 1)
      } else {
        PE :+= PE(i - 1)
        PO :+= PO(i - 1) + ar(i)
      }
      i = i + 1
    }

    (PE, PO)
  }

  //  val nums = Array(1,2,3,4,5,6,7,8,9,10)
  val nums = Array(1, 1, 1)
  val (prefixEven, prefixOdd) = getPrefixEvenAndOddSumArrays(nums)
  var cnt = 0
  var prefixEvenSum = 0
  var prefixOddSum = 0
  var n = nums.length
  for (i <- 0 to n - 1) {
    if (i == 0) {
      prefixEvenSum = prefixOdd(n - 1) - prefixOdd(i)
      prefixOddSum = prefixEven(n - 1) - prefixEven(i)
      println(s"i value: ${i}, prefixEvenSum: ${prefixEvenSum}, prefixOddSum: ${prefixOddSum}")
    } else {
      prefixEvenSum = prefixEven(i - 1) + (prefixOdd(n - 1) - prefixOdd(i))
      prefixOddSum = prefixOdd(i - 1) + (prefixEven(n - 1) - prefixEven(i))
      println(s"i value: ${i}, prefixEvenSum: ${prefixEvenSum}, prefixOddSum: ${prefixOddSum}")
    }

    if (prefixEvenSum == prefixOddSum) {
      cnt = cnt + 1
    }
  }
  println(s"count: ${cnt}")


}
