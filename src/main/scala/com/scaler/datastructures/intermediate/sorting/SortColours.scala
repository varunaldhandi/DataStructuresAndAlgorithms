package com.scaler.datastructures.intermediate.sorting

object SortColours extends App {
var nums = Array(2,1,0,0,1,2,1,2)

  for(i <- 0 to nums.length - 1 ) {
    var temp = 0
    for(j <- 0 to nums.length - 1) {
      if(nums(i) <= nums(j)) {
        temp = nums(j)
        nums(j) = nums(i)
        nums(i) = temp
      }
    }
  }

  println(nums.mkString(","))
}
