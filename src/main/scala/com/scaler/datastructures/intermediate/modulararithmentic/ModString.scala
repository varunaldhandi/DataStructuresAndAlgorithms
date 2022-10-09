package com.scaler.datastructures.intermediate.modulararithmentic

object ModString extends App {
def findMod(A: String, B: Int) : Int = {
  ???
}
//  val A = "842554936302263"
  val A = "6562800446546751053033681283622332585949169375825307419010747907087102529693988502714663897293527240363734284937813181135000995192664742291904645171438423695200374401117403"
//  val B = 41
  val B = 36173
  val n = A.length
  var sum = 0L
  var ten = 1L
  for(i <- n-1 to (0, -1)) {
//    println(s"ten: ${ten} and A(${i}): ${A(i)} and sun : ${sum}")
    var c = ten * A(i).toString.toInt
    sum = (sum % B) + (c % B)
//    println(s"sum : ${sum}")
    ten = ten * 10
  }
//  for(i <- n-1 to (0, -1)){
//    sum = sum + (twice * A(i))
//    twice = twice * 2
//  }
println(sum % B)


}
