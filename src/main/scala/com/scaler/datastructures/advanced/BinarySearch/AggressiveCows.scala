package com.scaler.datastructures.advanced.BinarySearch

object AggressiveCows extends App {
    def accommodate(A: Array[Int], distance: Int, M: Int) : Boolean = {
      var last_cow = A(0)
      var numCows = M
      numCows = numCows - 1
      for(i <- 1 until A.length) {
        if(A(i) - last_cow >= distance) {
          last_cow = A(i)
          numCows = numCows - 1
        }
        if(numCows == 0) {
          return true
        }
      }
      return false
    }

    def solve(A: Array[Int], B: Int): Int  = {
      var ans = -1
      var l = 1
      var r = A(A.length - 1) -  A(0)
      var mid = 0
      while(l <= r) {
        mid = l + ((r - l) / 2)
        println(s"l: ${l}, r: ${r} and mid: ${mid}")
        if(accommodate(A, mid, B)) {
          ans = mid
          l = mid + 1
        } else {
          r = mid - 1
        }
      }
      ans
    }
  println(solve(Array(0, 1000000000), 2))





}
