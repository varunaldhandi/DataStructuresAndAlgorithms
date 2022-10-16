package com.scaler.datastructures.advanced.BinarySearch

class Solution {
  def searchInsert(A: Array[Int], B: Int): Int = {
    var l = 0
    var r = A.length - 1
    var mid = 0
    if (A(0) > B) {
      return 0
    }
    if (A(r) < B) {
      return r + 1
    }
    while (l <= r) {
      mid = (l + r) / 2
      if (A(mid) == B) {
        return mid
      } else if (A(mid) < B) {
        l = mid + 1
      } else {
        r = mid - 1
      }
    }

    if (B < A(mid)) {
      return mid
    } else {
      return mid + 1
    }


  }
}

