// Author - Tanishka Garg

package com.tanishka.Question3

object First_Impl extends App{

  //Creating an object of First class to invoke first method
  val firstObject = new First

  val charsList = ('a' to 'f').toList

  val intList = (1 to 3).toList

  print(s"First 3 elements from the List[a,b,c,d,e,f} with built-in Function: ${firstObject.firstWithInBuiltFunction(charsList,3)}")

  print(s"\nFirst 2 elements from the List[1,2,3] with for-loop: ${firstObject.firstWithFor(intList,2)}")

  print(s"\nFirst 2 elements from the List[a,t,o] with FoldLeft method: ${firstObject.firstWithFoldLeft(List('a','t', 'o'), 2)}")

  print(s"\nFirst 2 elements from the List[tanishka, garg, priya] Recursively : ${firstObject.firstWithRecursive(List("tanishka", "garg","priya"), 2)}")

}
