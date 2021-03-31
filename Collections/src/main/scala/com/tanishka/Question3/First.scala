// Author - Tanishka Garg

package com.tanishka.Question3

class First {

  //method returning the first x elements by 'take' method
  def firstWithInBuiltFunction[A](elements: List[A], count: Int): List[A] = elements take count

  //method returning the first x elements by for-loop
  def firstWithFor[A](elements: List[A], count: Int): List[A] = {
    val list = for (i <- 0 until count) yield elements(i)
    list.toList
  }

  //method returning the first x elements by foldLeft method
  def firstWithFoldLeft[A](elements: List[A], count: Int): List[A] = {
    elements.foldLeft[List[A]](Nil) { (a: List[A], i: A) =>
      if (a.size >= count) a else i :: a
    }.reverse
  }

  //method returning the first x elements by recursive function
  def firstWithRecursive[A](elements: List[A], count: Int): List[A] = {
    if (count > 0 && elements.tail != Nil){
      elements.head :: firstWithRecursive(elements.tail, count - 1)
    }
    else{
      Nil
    }
  }

}
