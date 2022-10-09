package com.scaler.datastructures.intermediate.strings

object LongestCommonPrefix extends  App {
  val arrStr = Array("abcdefgh",  "abcxyz", "abcghijk", "abcefgh","dc")


  var minLength: Int = arrStr(0).length
  for(i <- 1 to arrStr.length - 1) {
    var len : Int = arrStr(i).length
    if(len < minLength){
      minLength =  len
    }
  }
var prefix = ""
var isPrefix = false
  for(j <- 0 to minLength - 1) {
    for(i <- 0 to arrStr.length - 2) {
      if(arrStr(i)(j) == arrStr(i+1)(j)){
        isPrefix = true
      } else {
        isPrefix = false
      }

    }
    if(isPrefix) {
      prefix = prefix + arrStr(0)(j)
    }
  }

  println(s"Prefix ${prefix} ")
}
