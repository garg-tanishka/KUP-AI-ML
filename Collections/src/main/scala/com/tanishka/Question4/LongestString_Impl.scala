// Author - Tanishka Garg

package com.tanishka.Question4

object LongestString_Impl extends App {

  //Creating an object of LongestString class to invoke longest method
  val longestObject = new LongestString

  val names = List("Priya", "Tanishka Garg", "Swantika", "Rahul", "Durgesh", "Nikhil", "Praanav")

  print(s"List to select Longest String : $names")

  print(s"\nLongest String in the List with built-in Function: ${longestObject.longestWithBuiltInFunction(names)}")

  print(s"\nLongest String in the List with Fold method : ${longestObject.longestWithFold(names)}")

  print(s"\nLongest String in the List with Reduce method: ${longestObject.longestWithReduce(names)}")

  print(s"\nLongest String in the List with Generic Type: ${longestObject.longestWithGenericType[String](names, (x,y) => if (x.length > y.length) x else y)}")

}
