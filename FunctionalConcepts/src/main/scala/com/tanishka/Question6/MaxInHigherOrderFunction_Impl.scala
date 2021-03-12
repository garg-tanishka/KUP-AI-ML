// Author - Tanishka Garg

package com.tanishka.Question6
import scala.io.StdIn.{readInt, readLine}

object MaxInHigherOrderFunction_Impl {

  def main(args: Array[String]): Unit = {

    /* In main function, I have done following things :-
     1. Created an instance of MaxInHigherOrderFunction_Api class.
     2. Inside while loop, I have used try-catch block -
       * In try-block, I have taken three input from user i.e., tupleInput1,tupleInput2 and tupleInput3.
         Then I have called the pickMaxInHigherOrderFunction method from the instance created.
       * In catch-block, I have caught all NumberFormatException exceptions by showing a message - "Enter valid inputs." */
    val maxInHigherOrderFunction = new MaxInHigherOrderFunction_Api
    var continue = "Y"
    while (continue == "Y") {
      try {
        print("Enter three integers for tuple: \n")
        val tupleInput1 = readInt()
        val tupleInput2 = readInt()
        val tupleInput3 = readInt()

        print("Result is : " + maxInHigherOrderFunction.pickMaxInHigherOrderFunction((tupleInput1,tupleInput2,tupleInput3),
          maxInHigherOrderFunction.maxOfTwoNumbers))
      }
      catch {
        case _: NumberFormatException => print("Enter valid inputs.")
      }
      print("\nDo you want to continue (Y or N): ")
      continue = readLine()
    }
  }

}
