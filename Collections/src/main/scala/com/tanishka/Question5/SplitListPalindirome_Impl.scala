// Author - Tanishka Garg

package com.tanishka.Question5

object SplitListPalindirome_Impl extends App{

  val splitListObject = new SplitListPalindrome

  val list = List("Tanishka Garg", "Swantika", "Rahul", "Durgesh", "Nikhil", "Praanav", "racecar")

  print(s"\nOriginal List is : $list" )

  print(s"\nSplit Lists with built-in Function : ${splitListObject.splitPalindromeWithBuiltInFunction(list)}")

  print(s"\nSplit Lists are : ${splitListObject.splitListPalindrome(list)}")

}
