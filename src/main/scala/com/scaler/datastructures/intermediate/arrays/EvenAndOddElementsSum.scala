package com.scaler.datastructures.intermediate.arrays

object EvenAndOddElementsSum extends App {
def getPrefixEvenAndOddSumArrays(ar: Array[Int]) : (Array[Int], Array[Int]) = {
  var PE =  Array[Int]()
  var PO =  Array[Int]()
  var i = 1
  PE :+= ar(0)
  PO :+= 0

  while(i<ar.length){
    if(i % 2 == 0) {
      PE :+= PE(i-1) + ar(i)
      PO :+= PO(i-1)
    } else {
      PE :+= PE(i-1)
      PO :+= PO(i-1) + ar(i)
    }
    i = i + 1
  }

  (PE, PO)
}
  def skipIndex(ar: Array[Int], index: Int): Array[Int] = {
    var i = 0
    var newArray = Array[Int]()
    while(i < ar.length) {
      if(i != index)
        newArray :+= ar(i)
      i = i + 1
    }
    newArray
  }

  var skip = 0
  val nums = Array(1,2,3,4,5,6,7,8,9,10)
//  var (even, odd) = getPrefixEvenAndOddSumArrays(nums)
//  println(even.mkString(","))
//  println(odd.mkString(","))

  var cnt = 0
  while(skip < nums.length) {
    cnt = 0
    var newArray = skipIndex(nums, skip)
    println(newArray.mkString(","))
    var (even, odd) = getPrefixEvenAndOddSumArrays(newArray)
    println(even(even.length) - 1)
    println(odd(odd.length) - 1)
    if(even(even.length - 1) == odd(odd.length - 1))
      cnt = cnt + 1
    skip = skip + 1
  }
  println(cnt)
}
