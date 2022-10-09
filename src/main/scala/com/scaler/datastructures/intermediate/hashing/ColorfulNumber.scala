package com.scaler.datastructures.intermediate.hashing
import scala.collection.mutable.Map
import scala.util.control._

object ColorfulNumber extends App {
  def colorful(A: Int) : Int = {
    val str = A.toString
    val mp = Map.empty[Int, Int]
    var prod = 1
      for (i <- 0 until str.length) {
        prod = 1
        for (j <- i until str.length) {
          prod = prod * (str(j) - '0')
          if (mp.contains(prod)) {
            mp(prod) = mp(prod) + 1
          } else {
            mp(prod) = 1
          }

          if (mp(prod) > 1) {
            return 0
          }
        }

      }


    return 1
  }

  val A = 23
  println(colorful(A))
//  val str = A.toString
//  var prod = 1
//  for(i <- 0 until str.length){
//    prod = 1
//    for(j <- i until str.length){
//      prod = prod * (str(j) - '0')
//      println(prod)
//    }
//  }
}

