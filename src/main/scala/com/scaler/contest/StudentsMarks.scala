package com.scaler.contest
import scala.util.Sorting

object StudentsMarks extends  App {

    var A = Array("xecabdvf2", "ucgce4", "hcldoom2", "q9")
    var nameRegex = "[a-zA-Z]*".r
    var marksRegex = "\\d*".r
    var name = nameRegex.findFirstIn(A(0)).get
  var marks = marksRegex.findFirstIn(A(0)).get




//  import scala.util.Sorting
//
//  case class Person(name:String, age:Int)
//  val people = Array(Person("bob", 30), Person("ann", 32), Person("carl", 19))
//
//  // sort by age
//  object AgeOrdering extends Ordering[Person] {
//    def compare(a:Person, b:Person) = a.age compare b.age
//  }
//  Sorting.quickSort(people)(AgeOrdering)




  //  def marksComparator(a: String, b: String) : String = {
//    ???
//  }
//var A = Array("adarsh80", "harsh95", "shivam95")
//  var A = Array("xecabdvf2", "ucgce4", "hcldoom2", "q9")
//  val nums = Array(80, 95, 95)
//  println(nums.sorted(Ordering[Int].reverse).mkString(","))

//  val a = "harsh95"
//  val b = "shivam95"
//  for(i<- 0 to A.length - 1) {
//    var temp = ""
//    for(j <- i + 1 to A.length  -1) {
//      if (A(i).substring(A(i).length - 1, A(i).length).toInt < A(j).substring(A(j).length - 1, A(j).length).toInt) {
//        println(s"${A(i)} is less than ${A(j)}, hence swapping")
//        temp = A(i)
//        A(i) = A(j)
//        A(j) = temp
//
//      }
//
//    }
//
//  }
//  println(A.sorted.mkString(","))
}
