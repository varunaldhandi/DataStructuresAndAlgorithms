package com.scaler.datastructures.advanced.GCD

object DeleteOne extends  App {
  def solve(A: Array[Int]): Int = {
    ???
  }
  def gcd(A: Int,B: Int) : Int = {
    var temp = 0
    var a = A
    var b = B
    if(a > b) {
      temp = a
      a = b
      b = temp
    }
    if(a == 0) return b
    return  gcd(b % a, a)
  }

//  val A = Array(30, 24, 22, 18)
  val A = Array(7, 21)
  val n = A.length
  var prefix = new Array[Int](n)
  prefix(0) = A(0)

  for(i <- 1 until n){
    prefix(i) = gcd(prefix(i-1), A(i))
  }
  var suffix = new Array[Int](n)

  suffix(n - 1) = A(n - 1)
  for(i <- n-2 to(0, -1)){
    suffix(i) = gcd(suffix(i+1), A(i))
  }
  println(prefix.mkString(","))
  println(suffix.mkString(","))
  var ans = 0

  for(i <- 0 until n){
    if(i == 0){
      ans = ans max suffix(i+1)
    }
    else if(i == n-1) {
      ans = ans max prefix(i-1)
    } else {
      ans = ans max gcd(prefix(i - 1), suffix(i + 1))
    }
    println(s"ans : ${ans}")
  }
  println(ans)


}
