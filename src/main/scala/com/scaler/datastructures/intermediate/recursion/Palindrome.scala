package com.scaler.datastructures.intermediate.recursion

object Palindrome extends App {
def isPalindrome(str: String) : Boolean = {
  val n = str.length
  if(n <= 1) {
    return true
  }
  if(str(0) == str(n-1)){
    return isPalindrome(str.substring(1, n-1))
  } else {
    return false
  }
}

  println(isPalindrome("MALAYALAM"))
}
