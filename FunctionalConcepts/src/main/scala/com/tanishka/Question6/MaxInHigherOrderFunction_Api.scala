// Author - Tanishka Garg

package com.tanishka.Question6

class MaxInHigherOrderFunction_Api {

  //function literal for finding the maximum between two numbers.
  val maxOfTwoNumbers = (x: Int, y: Int) => if (x > y) x else y

  /*Higher order function taking "3-sized tuple" and "maxOfTwoNumbers" function literal in parameters.
  Then using "maxOfTwoNumbers" for finding the maximum number from the tuple.*/
  def pickMaxInHigherOrderFunction(tuple: (Int, Int, Int), maxOfTwoNumbers: (Int, Int) => Int): Int = {
    maxOfTwoNumbers(tuple._1, maxOfTwoNumbers(tuple._2, tuple._3))
  }

}
