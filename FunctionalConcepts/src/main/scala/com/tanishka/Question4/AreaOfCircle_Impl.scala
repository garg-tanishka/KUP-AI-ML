// Author - Tanishka Garg

package com.tanishka.Question4
import scala.io.StdIn.readLine

object AreaOfCircle_Impl {

  def main(args: Array[String]): Unit = {

    /* In main function, I have done following things :-
      1. Created an instance of AreaOfCircle_Api class.
      2. Inside while loop, I have used try-catch block -
        * In try-block, I have taken one input from user as a string i.e., radiusOfCircle.
          Then I have called the areaOfCircle method from the instance created.
        * In catch-block, I have caught all NumberFormatException exceptions by showing a message - "Enter valid inputs." */
    val areaOfCircle_Api = new AreaOfCircle_Api
    var continue = "Y"
    while (continue == "Y") {
      try {
        print("Enter the Radius of the circle: ")
        val radiusOfCircle: String = readLine()
        print("Area of Circle: " + areaOfCircle_Api.areaOfCircle(radiusOfCircle))
      }
      catch {
        case _: NumberFormatException => print("Enter valid inputs.")
      }
      print("\nDo you want to continue (Y or N): ")
      continue = readLine()
    }
  }


}
