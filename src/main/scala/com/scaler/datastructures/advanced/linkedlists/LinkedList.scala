package com.scaler.datastructures.advanced.linkedlists

object LinkedList extends App {
  var first = new Node(5)
  var second =  new Node(6)
  first.next = second
  var third = new Node(7)
  second.next = third

  var ptr = first
  while(ptr != null) {
    println(ptr.data)
    ptr = ptr.next
  }

  def search(head: Node, k: Int) : Boolean = {
    if(head == null) return false
    return (head.data == k || search(head.next, k))
  }

  println(search(first, 10))
  println("***************LINKED LIST****************")
  def toLinkedList(ar: Array[Int]) : Node = {
    var head : Node = new Node(ar(0))
    var temp = head
    for(i <- 1 until ar.length){
      temp.next = new Node(ar(i))
      temp = temp.next
    }
  head
  }
  val ar = Array(6, 89, 12, 3, 78)
  var ll = toLinkedList(ar)

  while(ll != null) {
    println(ll.data)
    ll = ll.next
  }

}
