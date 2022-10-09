package com.scaler.datastructures.intermediate.hashing

import scala.collection.immutable.HashSet
object AmazingSubarrays extends  App {
val hsVowels : HashSet[Char] = HashSet('A', 'E', 'I', 'O', 'U', 'a', 'e', 'i', 'o', 'u')
  val str = "ABEC"
  val n = str.length
  var ans = 0


  for(i <- 0 to str.length - 1) {
    if(hsVowels.contains(str(i))) {
      ans = ans + (n - i)
    }
  }
  println(ans)
}
