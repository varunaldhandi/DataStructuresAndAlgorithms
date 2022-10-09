package com.scaler.problemsolving

object ProperDivisors extends App {
def getSumOfProperDivisors(n: Int)  = {
  var i = 1
  var sum = 0
  while( i * i <= n) {
    if ( n % i == 0) {
      if (n == n/i) {
          sum = sum + i
      } else if (n == i) {
        sum = sum
      } else {
        sum = sum + i + n/i
      }
    }
    i = i + 1
  }
  sum
}
  val number = scala.io.StdIn.readInt()
  for(i <- 1 to number) {
    val n = scala.io.StdIn.readInt()
    if(n == getSumOfProperDivisors(n)) {
      println("YES")
    } else {
      println("NO")
    }
  }



}
