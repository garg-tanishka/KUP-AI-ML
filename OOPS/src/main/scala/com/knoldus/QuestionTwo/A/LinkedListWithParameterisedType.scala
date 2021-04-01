// Author - Tanishka Garg

package com.knoldus.QuestionTwo.A

class LinkedListWithParameterisedType[A](items: A*) {

  //returning the head of the List
  val item: Option[A] = items.headOption

  val next: Option[LinkedListWithParameterisedType[A]] = {
    if (item.isDefined) Some(new LinkedListWithParameterisedType(items.tail: _*)) else None
  }

  // iterates over each element in list and perform operation based on parameter passed in method.
  def foreach(f: A => Unit): Unit = {
    for {i <- item; n <- next} {
      f(i)
      n.foreach(f)
    }
  }

  //method to return the index of the list
  def apply(index: Int): Option[A] = {
    if (index < 1) item else next flatMap (_.apply(index - 1))
  }

}
