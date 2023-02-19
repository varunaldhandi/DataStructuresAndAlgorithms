package com.scaler.datastructures.advanced.linkedlists
import com.scaler.datastructures.advanced.linkedlists.LinkedList

object MiddleElement extends App {
  var ll = LinkedList.toLinkedList(Array(5, 3, 4, 89, 12, 11, 10))

  def getMiddleElement(head: Node) : Node = {
    var slow = head
    var fast = head
    while(fast != null && fast.next != null) {
        slow = slow.next
        fast = fast.next.next
    }

    slow
  }
  val middle = getMiddleElement(ll)
  println(s"Middle element: ${middle.data}")
}
