// Author - Tanishka Garg

package com.knoldus.QuestionTwo.B

//abstract class defining two methods definition and one method implementation
abstract class LinkedList_Methods[A]{
  def foreach(f: A => Unit): Unit
  def apply(index: Int): Option[A]
  def headOption: Option[A] = apply(0)
}

//class extending abstract class and implementing the methods defined above
class NonEmptyList[A](val item: A, val next: LinkedList_Methods[A]) extends LinkedList_Methods[A] {

  // iterates over each element in list and perform operation based on parameter passed in method.
  override def foreach(f: A => Unit): Unit = {
    f(item)
    next.foreach(f)
  }

  //method returning the index of the list
  override def apply(index: Int): Option[A] = {
    if (index < 1) Some(item) else next.apply(index - 1)
  }

}

//class extending abstract class and implementing the methods defined above
class EmptyList[A] extends LinkedList_Methods[A] {

  //print nothing because we haven't passed the linked list
  override def foreach(f: A => Unit): Unit = {}

  //method will return None because we haven't passed the linked list
  override def apply(index: Int): Option[A] = None
}

