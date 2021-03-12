// Author - Tanishka Garg

package com.tanishka.Question8
import scala.io.StdIn.readLine

object Conditional_Impl {

  def main(args: Array[String]): Unit = {

    /* In main function, I have done following things :-
     1. Created an instance of Conditional_Api class.
     2. Inside while loop, I have used try-catch block -
       * In try-block, I have taken one input from user as a String i.e., inputString.
         Then I have called the conditional method from the instance created.
       * In catch-block, I have caught all NumberFormatException exceptions by showing a message - "Enter valid inputs." */
    val conditionalObject = new Conditional_Api
    var continue = "Y"
    while (continue == "Y") {
      try {
        print("Enter a string value: ")
        val inputString = readLine()
        val result = conditionalObject.conditional[String](inputString, _.length > 4, _.reverse)
        print("Result :" + result)
      }
      catch {
        case _: NumberFormatException => print("Enter valid inputs.")
      }
      print("\nDo you want to continue (Y or N): ")
      continue = readLine()
    }
  }

}
