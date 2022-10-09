package com.scaler.datastructures.intermediate.strings

import scala.util.control.Breaks
import scala.collection.mutable.Map
object LongestPalindromicSubstring extends  App {
val A = "abbcccbbbcaaccbababcbcabca"
  val loop = new Breaks
  var ans = 0
  var strMap = Map.empty[Int, String]
  // Odd length substring

    for(i <- 0 to A.length - 1){
      var cnt = 1
      var l = i-1
      var r = i + 1

      loop.breakable {
        while (l >= 0 && r < A.length) {
          if (A(l) == A(r)) {
            cnt = cnt + 2
          } else {
            loop.break()
          }
          if(!strMap.contains(cnt)) {
            strMap(cnt) = A.substring(l, r + 1)
          }
          l = l - 1
          r = r + 1
        }

      }
      ans = ans max cnt

    }

  //Even length substring
    for (i <- 0 to A.length - 1) {
      var cnt = 0
      var l = i
      var r = i + 1

      loop.breakable {
        while (l >= 0 && r < A.length) {
          if (A(l) == A(r)) {
            cnt = cnt + 2
          } else {
            loop.break()
          }
          if (!strMap.contains(cnt)) {
            strMap(cnt) = A.substring(l, r + 1)
          }
          l = l - 1
          r = r + 1
        }

      }
      ans = ans max cnt

    }
  if(ans == 1) {
    A(0).toString
  } else {
    strMap(ans)
  }
  println(s"Longest palindromic length: ${ans}, ${strMap(ans)}")

}
