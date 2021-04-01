// Author - Tanishka Garg

package com.knoldus.QuestionTwo.C

abstract class LinkedList_WithBuiltInMethods[A] {

  def foreach(f: A => Unit): Unit

  def apply(index: Int): Option[A]

  def headOption: Option[A] = apply(0)

  lazy val head: A = headOption.get

  def tail: LinkedList_WithBuiltInMethods[A]

  //method to filter the list according to the function passed in the parameters
  def filter(f: A => Boolean): LinkedList_WithBuiltInMethods[A] = {
    var result: LinkedList_WithBuiltInMethods[A] = new EmptyList[A]
    foreach { i =>
      if ( f(i) ) {
        result = new NonEmptyList[A](i, result)
      }
    }
    result.reverse
  }

  //method will return the size of the list
  lazy val size: Int = {
    var count = 0
    foreach { _ => count += 1 }
    count
  }

  //method map will perform the function in the list which will be passed in the parameters
  def map[B](f: A => B): LinkedList_WithBuiltInMethods[B] = {
    var result: LinkedList_WithBuiltInMethods[B] = new EmptyList[B]
    foreach { i =>
      result = new NonEmptyList[B](f(i), result)
    }
    result.reverse
  }

  //method to return the reverse of the list
  lazy val reverse: LinkedList_WithBuiltInMethods[A] = {
    var result: LinkedList_WithBuiltInMethods[A] = new EmptyList[A]
    foreach { i => result = new NonEmptyList[A](i, result) }
    result
  }
}

//class implementing abstract class
class NonEmptyList[A](val item: A, val tail: LinkedList_WithBuiltInMethods[A]) extends LinkedList_WithBuiltInMethods[A] {

  // iterates over each element in list and perform operation based on parameter passed in method.
  override def foreach(f: A => Unit): Unit = {
    f(item)
    tail.foreach(f)
  }

  //method to return the index of the list
  override def apply(index: Int): Option[A] = {
    if (index < 1) Some(item) else tail.apply(index - 1)
  }
}

//class implementing abstract class
class EmptyList[A] extends LinkedList_WithBuiltInMethods[A] {

  //will print nothing because we haven't passed the linked list
  override def foreach(f: A => Unit): Unit = {}

  //will return None because we haven't passed the linked list
  override def apply(index: Int): Option[A] = None

  //will return null because we haven't passed the linked list
  override def tail: LinkedList_WithBuiltInMethods[A] = null
}
