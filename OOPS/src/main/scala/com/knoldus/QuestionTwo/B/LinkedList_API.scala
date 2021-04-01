// Author - Tanishka Garg

package com.knoldus.QuestionTwo.B

class LinkedList_API {

  //method to create linked list
  def create[A](items: A*):LinkedList_Methods[A] = {
    var result: LinkedList_Methods[A] = new EmptyList[A]
    for (item <- items.reverse) {
      result = new NonEmptyList[A](item, result)
    }
    result
  }
}
