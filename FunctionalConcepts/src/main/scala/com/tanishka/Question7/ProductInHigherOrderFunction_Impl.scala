// Author - Tanishka Garg

package com.tanishka.Question7

import scala.io.StdIn.{readInt, readLine}

object ProductInHigherOrderFunction_Impl {

  def main(args: Array[String]): Unit = {

    /* In main function, I have done following things :-
     1. Created an instance of ProductInHigherOrderFunction_Api class.
     2. Inside while loop, I have used try-catch block -
       * In try-block, I have taken two input from user i.e., input1 and input2.
         Then I have called the product method from the instance created.
       * In catch-block, I have caught all NumberFormatException exceptions by showing a message - "Enter valid inputs." */
    val productInHigherOrderFunction = new ProductInHigherOrderFunction_Api
    var continue = "Y"
    while (continue == "Y") {
      try {
        print("\nEnter two value: ")
        val input1 = readInt()
        val input2 = readInt()

        val tripler = productInHigherOrderFunction.product(input1)
        print("Result: " + tripler(input2))
      }
      catch {
        case _: NumberFormatException => print("Enter valid inputs.")
      }
      print("\nDo you want to continue (Y or N): ")
      continue = readLine()
    }
  }


}
