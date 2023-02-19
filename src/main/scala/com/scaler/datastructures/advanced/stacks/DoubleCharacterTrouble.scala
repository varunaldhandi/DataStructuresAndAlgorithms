package com.scaler.datastructures.advanced.stacks
import collection.mutable.Stack
object DoubleCharacterTrouble extends App {
def doubleCharacterTrouble(str: String) : String = {
  val st = Stack[Char]()
  if(str.length != 0) st.push(str(0)) else return ""

  for(i <- 1 until  str.length) {
    if(st.top == str(i)) st.pop() else st.push(str(i))
  }
  var result = ""
  while(!st.isEmpty) {
    result =  st.top + result
    st.pop()
  }
  result
}

  val input = "abbccdef"
  println(doubleCharacterTrouble(input))

}
