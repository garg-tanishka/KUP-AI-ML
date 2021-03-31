// Author - Tanishka Garg

package com.tanishka.Question1

object ListOfOddNumbers_Impl extends App{

  //Creating an object of ListOfOddNumbers class to invoke listOf20OddNumbers method
  val listOfOddNumbers = new ListOfOddNumbers


  print(s"\nList of Odd Long Numbers from [ 1 - 20 ] : ${listOfOddNumbers.listOf20OddNumbers}")

  print(s"\nList of Odd Long Numbers from [ 1 - 20 ] with For-Loop : ${listOfOddNumbers.listOf20OddNumbersWithFor}")

  print(s"\nList of Odd Long Numbers from [ 1 - 20 ] with Filter: ${listOfOddNumbers.listOf20OddNumbersWithFilter}")

}
