package com.scaler.datastructures.advanced.stacks

/**
 * Given a string A denoting an expression. It contains the following operators '+', '-', '*', '/'.

Check whether A has redundant braces or not.

NOTE: A will be always a valid expression and will not contain any white spaces.
  A = "((a+b))" - Redundant
  A = "(a+(a+b))" - Not redundant
 return 1 if redundant braces are found, else return 0
 */
import collection.mutable.Stack

object RedundantBrackets extends App {
  def braces(A: String) : Int = {
    val st = Stack[Char]()
    var isRedundant = 1
    for(ch <- A) {
      if(ch != ')') {
        println(s"Inside if condition. pushing ${ch} to stack.")
        st.push(ch)
      } else {
        println("Inside else")
        if(st.top == '(') return 1
        while(st.top != '(') {
          if(st.top == '+' || st.top == '-' || st.top == '*' || st.top == '/') isRedundant = 0
          st.pop()
        }
        if(isRedundant == 1) return 1
        isRedundant = 1
        println("Popping opening paranthesis")
        st.pop()
      }
    }
    return 0
  }

  println(braces("(a*b)+(b*(d+(a)))"))
//  println(braces("a+b"))
}
