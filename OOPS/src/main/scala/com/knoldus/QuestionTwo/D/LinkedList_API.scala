// Author - Tanishka Garg

package com.knoldus.QuestionTwo.D

class LinkedList_API {

  //method to create linked list
  def create[A](items: A*):LinkedList_WithRecursionMethods[A] = {
    var result: LinkedList_WithRecursionMethods[A] = new EmptyList[A]
    for (item <- items.reverse) {
      result = new NonEmptyList[A](item, result)
    }
    result
  }
}
