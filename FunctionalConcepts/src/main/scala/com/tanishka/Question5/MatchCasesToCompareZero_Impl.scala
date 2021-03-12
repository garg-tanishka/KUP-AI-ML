// Author - Tanishka Garg

package com.tanishka.Question5

import scala.io.StdIn.{readDouble, readLine}

object MatchCasesToCompareZero_Impl {

  def main(args: Array[String]): Unit = {

    /* In main function, I have done following things :-
     1. Created an instance of MatchCasesToCompareZero_Api class.
     2. Inside while loop, I have used try-catch block -
       * In try-block, I have taken one input from user as a Double i.e., amount.
         Then I have called the comparingZero method from the instance created.
       * In catch-block, I have caught all NumberFormatException exceptions by showing a message - "Enter valid inputs." */
    val matchCasesToCompareZero_Api = new MatchCasesToCompareZero_Api
    var continue = "Y"
    while (continue == "Y") {
      try {
        print("Enter the amount you want to compare from zero: ")
        val amount: Double = readDouble()
        print("Result is : " + matchCasesToCompareZero_Api.comparingZero(amount))
      }
      catch {
        case _: NumberFormatException => print("Enter valid inputs.")
      }
      print("\nDo you want to continue (Y or N): ")
      continue = readLine()
    }
  }
}
