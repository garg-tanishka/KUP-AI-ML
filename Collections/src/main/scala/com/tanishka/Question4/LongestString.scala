// Author - Tanishka Garg

package com.tanishka.Question4

class LongestString {

  val names = List("Priya", "Tanishka Garg", "Swantika", "Rahul", "Durgesh", "Nikhil", "Praanav")

  //method returning the longest string from the List of strings with build-in method
  def longestWithBuiltInFunction(l: List[String]): String = names.sortBy(0 - _.size).head

  //method returning the longest string from the List of strings with fold method
  def longestWithFold(list: List[String]): String = {
    names.fold("")((a,b) => if (a.length < b.length) b else a)
  }

  //method returning the longest string from the List of strings with reduce method
  def longestWithReduce(list: List[String]): String = {
    names.reduce((a,b) => if (a.length < b.length) b else a)
  }

  //method returning the longest string from the Generics List with function as parameters
  def longestWithGenericType[A](list: List[A], max: (A,A) => A): A = {
    list reduce ((a,b) => max(a,b))
  }

}
