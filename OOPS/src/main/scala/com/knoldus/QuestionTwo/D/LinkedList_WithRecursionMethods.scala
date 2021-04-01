// Author - Tanishka Garg

package com.knoldus.QuestionTwo.D

import scala.annotation.tailrec

abstract class LinkedList_WithRecursionMethods[A]{

  def foreach(f: A => Unit): Unit

  def apply(index: Int): Option[A]

  def headOption: Option[A] = apply(0)

  lazy val head: A = headOption.get

  def tail: LinkedList_WithRecursionMethods[A]

  def ::(a: A): LinkedList_WithRecursionMethods[A] = new NonEmptyList[A](a, this)

  //method to filter the list according to the function passed in the parameters
  def filter(f: A => Boolean): LinkedList_WithRecursionMethods[A] = {

    @tailrec
    def filterLists(src: LinkedList_WithRecursionMethods[A], dest: LinkedList_WithRecursionMethods[A], f: A => Boolean): LinkedList_WithRecursionMethods[A] = {
      src.headOption match {
        case Some(i) if f(i) => filterLists(src.tail, i :: dest, f)
        case Some(i) => filterLists(src.tail, dest, f)
        case None => dest
      }
    }

    val result: LinkedList_WithRecursionMethods[A] = filterLists(this, new EmptyList[A], f)
    result.reverse
  }

  //method to return the size of the list
  lazy val size: Int = {

    @tailrec
    def count(src: LinkedList_WithRecursionMethods[A], total: Int): Int = {
      src.headOption match {
        case Some(i) => count(src.tail, total + 1)
        case None => total
      }
    }

    count(this, 0)
  }

  //method map will perform the function in the list which will be passed in the parameters
  def map[B](f: A => B): LinkedList_WithRecursionMethods[B] = {

    @tailrec
    def mapLists[B](src: LinkedList_WithRecursionMethods[A], dest: LinkedList_WithRecursionMethods[B], f: A => B): LinkedList_WithRecursionMethods[B] = {
      src.headOption match {
        case Some(i) => mapLists(src.tail, f(i) :: dest, f)
        case None => dest
      }
    }

    val result: LinkedList_WithRecursionMethods[B] = mapLists(this, new EmptyList[B], f)
    result.reverse
  }

  //method to reverse the list
  lazy val reverse: LinkedList_WithRecursionMethods[A] = {

    @tailrec
    def reverseLists(src: LinkedList_WithRecursionMethods[A], dest: LinkedList_WithRecursionMethods[A]): LinkedList_WithRecursionMethods[A] = {
      src.headOption match {
        case Some(i) => reverseLists(src.tail, i :: dest)
        case None => dest
      }
    }

    reverseLists(this, new EmptyList[A])
  }
}

//NonEmptyList class implementing the abstract LinkedList_WithRecursionMethods class
class NonEmptyList[A](val item: A, val tail: LinkedList_WithRecursionMethods[A]) extends LinkedList_WithRecursionMethods[A] {

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

//EmptyList class implementing the abstract LinkedList_WithRecursionMethods class
class EmptyList[A] extends LinkedList_WithRecursionMethods[A] {

  //will print nothing
  override def foreach(f: A => Unit): Unit = {}

  //will return None
  override def apply(index: Int): Option[A] = None

  //will return null
  override def tail:LinkedList_WithRecursionMethods[A] = null
}

