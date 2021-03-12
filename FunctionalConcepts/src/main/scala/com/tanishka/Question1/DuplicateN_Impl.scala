// Author - Tanishka Garg

package com.tanishka.Question1
import scala.io.StdIn.{readInt, readLine}

object DuplicateN_Impl {

  /* In main function, I have done following things :-
  1. Created an instance of DuplicateN_Api class.
  2. Inside while loop, I have used try-catch block -
   * In try-block, I have taken three inputs from user i.e., sizeOfList ,inputList and duplicateTimes(for how many times list has to duplicate).
     Then I have called the duplicateN method from the instance created.
   * In catch-block, I have caught all NumberFormatException exceptions by showing a message - "Enter valid inputs." */
  def main(args: Array[String]): Unit = {

    val duplicateN_Api = new DuplicateN_Api
    var continue = "Y"
    while (continue == "Y") {
      try {
        print("Enter the total elements to be inserted in the List: ")
        val sizeOfList: Int = readInt()

        print(s"Enter $sizeOfList elements: \n")
        val inputList = List.fill(sizeOfList) {
          readLine()
        }
        print("Enter how many times you want the List to get duplicated : ")
        val duplicateTimes = readInt()

        print(s"Original List : $inputList")
        print("\nDuplicated List : " + duplicateN_Api.duplicateN(duplicateTimes, inputList))
      }
      catch {
        case _: NumberFormatException => print("Enter valid inputs.")
      }
      print("\nDo you want to continue (Y or N): ")
      continue = readLine()
    }
  }
}
