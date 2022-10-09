package com.scaler.problemsolving

object MultiplicationTable extends App {
val num = 2
  for(i <- 1 to 10) {
    println(s"${num} * ${i} = ${num * i}")
  }
}
