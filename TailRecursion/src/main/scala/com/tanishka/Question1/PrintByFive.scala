// Author - Tanishka Garg
package com.tanishka.Question1

import scala.annotation.tailrec
import scala.io.StdIn.{readInt, readLine}

object PrintByFive {

  /* method adding 5 to startValue until startValue <= endValue .
    DRY RUN - startValue - 15, OUTPUT = result(15 20 25)
      I Iteration : if( 15 <= 25 ) => (15,25, result(15))
I     I Iteration : if( 20 <= 25 ) => (20,25, result(15, 20));
      III Iteration : if( 25 <= 25 ) => (25,25, result(15,20,25))
      IV Iteration : result(15,20,25) */

  def printByFive(startValue: Int, endValue: Int) : List[Int] = {
    @tailrec
    def fives(currentValue: Int, maxValue: Int, result: List[Int]): List[Int] = {
      if (currentValue <= maxValue) {
        fives(currentValue + 5, maxValue, result :+ currentValue)
      }
      else{
        result
      }
    }
    fives(startValue, endValue, Nil)
  }

  /* In main function, I have done following things :-
   Inside while loop, I have used try-catch block -
    * In try-block, I have taken two inputs from user i.e., startValue and endValue.
      Then I have called the printByFive method passing the startValue and endValue in parameters.
    * In catch-block, I have caught all NumberFormatException exceptions by showing a message - "Enter valid inputs."
 */
  def main(args: Array[String]): Unit = {
    var continue = "Y"
    while (continue == "Y") {
      try {
        print("Enter the start value and end value(5-50):  \n")
        val startValue: Int = readInt()
        if (startValue >= 5 && startValue <= 50) {
          val endValue: Int = readInt()

          if (endValue >= 5 && endValue <= 50) {
            print("Result is : ")
            printByFive(startValue,endValue).foreach(print)
          }
          else {
            print("Enter values in 5-50 range only.")
          }
        }
        else {
          print("Enter values in 5-50 range only.")
        }
      }
      catch {
        case _: NumberFormatException => print("Enter valid inputs.")
      }
      print("\nDo you want to continue (Y or N): ")
      continue = readLine()
    }
  }
}
