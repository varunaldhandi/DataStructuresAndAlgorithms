package com.scaler.datastructures.advanced.stacks
import collection.mutable.Stack

object BalancingBrackets extends App {
 def isBalanced(seq: String) : Boolean = {
  val st = Stack[Char]()

  for (i <- seq) {
   println(s"The value of i is ${i}")
   if (i == '[' || i == '{' || i == '(') {
    println(s"Inside if block. value of i is ${i}")
    st.push(i)
   }
   else {
    if(st.isEmpty) return false
    println(s"Inside else block. value of i is ${i}")
    i match {
     case ']' => if (st.top == '[') st.pop() else return false
     case '}' => if (st.top == '{') st.pop() else return false
     case ')' => {
      println(s"Inside case ')'. The value of i is ${i}")
      if (st.top == '('){
       println("The top value of stack is '('. Hence popping")
       st.pop()
      } else {
       println("The top value of stack is not '('. Hence, returning false.")
       return false
      }
     }
    }
   }
  }
  if(st.isEmpty) true else false

 }
 val str = "))))))))"
// for(i <- str) println(i)
 println(isBalanced(str))
// for(i <- str) println(i)
}
