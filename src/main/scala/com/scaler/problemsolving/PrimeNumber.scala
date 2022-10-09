package com.scaler.problemsolving

object PrimeNumber {
def getCountOfFactors(n: Int) : Int = {
  var count = 0
  var i = 1
  while(i*i <= n){
    if(n%i == 0) {
      if( i == n/i) {

        count = count + 1
      } else {
        count = count + 2
      }

    }
    i = i + 1
  }

  count

}

  def printFactors(n: Int) : Unit = {
    var i = 1
    while ( i <= n) {
      if(n % i == 0){
        println(i)
      }
      i = i + 1
    }
  }
//  999563
  def main(args: Array[String]): Unit = {
    println("Enter a number:")
    var n = scala.io.StdIn.readInt()
    val factorCount = getCountOfFactors(n)
    if(factorCount == 2) {
      println("Prime")
    } else {
      println("Not Prime")
    }
//    printFactors(n)

  }
}
