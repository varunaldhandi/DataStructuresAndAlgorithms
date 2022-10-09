package com.scaler.datastructures.intermediate.arrays.prefixsum

/**
 * You are given an integer array A of size N.

You have to pick B elements in total. Some (possibly 0) elements from left end of array A and some (possibly 0) from the right end of array A to get the maximum sum.

Find and return this maximum possible sum.

NOTE: Suppose B = 4, and array A contains 10 elements, then

You can pick the first four elements or can pick the last four elements, or can pick 1 from front and 3 from the back, etc. You need to return the maximum possible sum of elements you can pick.
 */
object PickFromBothSides extends App {
  def getPrefixSumArray(ar: Array[Int]) : Array[Int] = {
    var PS =  Array[Int]()
    PS :+= ar(0)
    for(i<- 1 to ar.length -1 ) {
      PS :+= PS(i-1) + ar(i)
    }
    PS
  }
//  val nums = Array(5,-2,3,1,2)
  val nums = Array(-584, -714, -895, -512, -718, -545, 734, -886, 701, 316, -329, 786, -737, -687, -645, 185, -947, -88, -192, 832, -55, -687, 756, -679, 558, 646, 982, -519, -856, 196, -778, 129, -839, 535, -550, 173, -534, -956, 659, -708, -561, 253, -976, -846, 510, -255, -351, 186, -687, -526, -978, -832, -982, -213, 905, 958, 391, -798, 625, -523, -586, 314, 824, 334, 874, -628, -841, 833, -930, 487, -703, 518, -823, 773, -730, 763, -332, 192, 985, 102, -520, 213, 627, -198, -901, -473, -375, 543, 924, 23, 972, 61, -819, 3, 432, 505, 593, -275, 31, -508, -858, 222, 286, 64, 900, 187, -640, -587, -26, -730, 170, -765, -167, 711, 760, -104, -333)

  val B  = 32
  var max = -999999
  var sum = 0
  val prefixSumArray = getPrefixSumArray(nums)
  println(prefixSumArray.mkString(","))
  val n = nums.length
  for(i <- 1 to B) {
    sum = prefixSumArray(i-1) + (prefixSumArray(n-1) - prefixSumArray(n-B+i-1))
    max = if(max > sum) max else sum
  }
  println(max)
}
