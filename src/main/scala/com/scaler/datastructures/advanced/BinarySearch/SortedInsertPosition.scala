package com.scaler.datastructures.advanced.BinarySearch
import scala.util.control._
object SortedInsertPosition extends App {
def searchInsert(A: Array[Int], B: Int) : Int = {
  ???
}
  val A = Array(17, 30, 32, 69, 94, 96, 106, 118, 127, 159, 169, 170, 178, 183, 209, 238, 242, 247, 253, 261, 265, 279, 288, 302, 305, 316, 352, 357, 374, 376, 392, 402, 410, 421, 439, 442, 444, 446, 454, 458, 464, 467, 468, 498, 500, 513, 523, 541, 545, 556, 575, 608, 616, 629, 631, 635, 669, 674, 682, 686, 693, 695, 719, 733, 754, 755, 756, 778, 802, 822, 824, 828, 835, 847, 848, 862, 864, 878, 883, 885, 904, 908, 928, 934)
  val B =  104

  var l = 0
  var r = A.length - 1
  var mid = 0
  var loop = new Breaks
  loop.breakable {
    while (l <= r) {
      mid = (l + r) / 2
      if (A(mid) == B) {
        println(s"Answer is : ${mid}")
        loop.break()
      } else if (A(mid) < B) {
        l = mid + 1
      } else {
        r = mid - 1
      }
    }
  }

  println(s"mid: ${mid}, A(mid) : ${A(mid)}")

  if(B < A(mid)) {
    println(s"mid: ${mid }")
  } else {
    println(s"mid: ${mid + 1}")
  }
//  if(A.length % 2 == 0){
//    println(mid)
//  } else {
//    println(mid + 1)
//  }


}
