// Author - Tanishka Garg

package com.knoldus.QuestionTwo.B

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
  val intLinkedList = linkedList_API.create(input1,input2,input3,input4,input5,input6)

  /*----------------------------------------------------------------------------------------*/

  //creating object of NonEmptyList class with Integer Type
  val intNonEmptyList = new NonEmptyList[Int](2,intLinkedList)

  //accessing all the methods declared inside the NonEmptyList class
  print("\nPrinting the Linked List forEach method through nonEmpty class: ")
  intNonEmptyList foreach print
  print("\nApply method for nonEmpty class : ")
  print(intNonEmptyList.apply(1))
  print("\nHead method for nonEmpty class : ")
  print(intNonEmptyList.headOption)

  /*-----------------------------------------------------------------------------------------*/

  //creating object of EmptyList class
  val intEmptyList = new EmptyList[Int]

  //accessing all the methods declared inside the EmptyList class
  print("\n\nPrinting the Linked List forEach method through nonEmpty class: IT WILL PRINT NOTHING ")
  intEmptyList foreach print
  print("\nApply method for EmptyList class : ")
  print(intEmptyList.apply(1))
}
