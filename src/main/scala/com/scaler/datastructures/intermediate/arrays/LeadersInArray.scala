package com.scaler.datastructures.intermediate.arrays

object LeadersInArray extends App {
//  My approach
val nums = Array(15, -1, 7, 2, 5, 4, 2, 3)
  var max = nums(nums.length - 1)
  var cnt = 1
  var i = nums.length - 1
  while(i >= 1) {
    if(nums(i - 1) > max) {
      max = nums(i-1)
      cnt = cnt + 1
    }
    i = i - 1
  }
  println(cnt)
}
