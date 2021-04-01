// Author - Tanishka Garg

package com.knoldus.QuestionTwo.D

object Application extends App{

  val input1 = 1
  val input2 = 2
  val input3 = 3
  val input4 = 4
  val input5 = 5
  val input6 = 6

  //creating object of LinkedList_API class
  val linkedList_API = new LinkedList_API

  //accessing create method declared inside the LinkedList_API class
  val linkedList = linkedList_API.create(input1,input2,input3,input4,input5,input6)

  /*----------------------------------------------------------------------------------------*/

  //creating object of NonEmptyList class
  val nonEmptyList = new NonEmptyList[Int](2,linkedList)

  //accessing all the methods declared inside the NonEmptyList class
  print("Printing the Linked List by forEach method through nonEmpty class: ")
  nonEmptyList foreach print
  print("\nApply method for nonEmpty class : ")
  print(nonEmptyList.apply(1))
  print("\nHead method for nonEmpty class : ")
  print(nonEmptyList.headOption)
  print("\nTail method for nonEmpty class : ")
  nonEmptyList.tail.foreach(print)
  print("\nFilter method for nonEmpty class : ")
  nonEmptyList.filter(_ < 3).foreach(print)
  print("\nSize method for nonEmpty class : ")
  print(nonEmptyList.size)
  print("\nMap method for nonEmpty class : ")
  nonEmptyList.map(x => x*2).foreach(print)
  print("\nReverse method for nonEmpty class : ")
  nonEmptyList.reverse.foreach(print)

  /*--------------------------------------------------------------------------------------------*/

  //creating object of EmptyList class
  val emptyList = new EmptyList[Int]

  //accessing all the methods declared inside the EmptyList class
  print("\nPrinting the Linked List forEach method through EmptyList class:  IT WILL PRINT NOTHING")
  emptyList foreach print
  print("\nApply method for EmptyList class : ")
  print(emptyList.apply(1))
  print(emptyList.headOption)
  print("\nTail method for EmptyList class :  IT WILL PRINT NOTHING")
  emptyList.tail
  print("\nFilter method for EmptyList class :  IT WILL PRINT NOTHING")
  emptyList.filter(_ < 3).foreach(print)
  print("\nSize method for EmptyList class : ")
  print(emptyList.size)
  print("\nMap method for EmptyList class :  IT WILL PRINT NOTHING")
  emptyList.map(x => x*x).foreach(print)
  print("\nReverse method for EmptyList class :  IT WILL PRINT NOTHING ")
  emptyList.reverse.foreach(print)

}
