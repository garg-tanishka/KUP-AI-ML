// Author - Tanishka Garg

package com.knoldus.QuestionTwo.C

class LinkedList_API {

  //method to create linked list
  def create[A](items: A*):LinkedList_WithBuiltInMethods[A] = {
    var result: LinkedList_WithBuiltInMethods[A] = new EmptyList[A]
    for (item <- items.reverse) {
      result = new NonEmptyList[A](item, result)
    }
    result
  }
}
