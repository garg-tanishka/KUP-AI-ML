// Author - Tanishka Garg

package com.tanishka.Question2

import scala.io.StdIn.{readInt, readLine}

object SplitList_Impl {

  def main(args: Array[String]): Unit = {

    /* In main function, I have done following things :-
  1. Created an instance of SplitList_Api class.
  2. Inside while loop, I have used try-catch block -
   * In try-block, I have taken three inputs from user i.e., sizeOfList ,inputList and splitTill.
     Then I have called the splitList method from the instance created.
   * In catch-block, I have caught all NumberFormatException exceptions by showing a message - "Enter valid inputs." */
    val splitList_Api = new SplitList_Api
    var continue = "Y"
    while (continue == "Y") {
      try {
        print("Enter the total elements to be inserted in the List: ")
        val sizeOfList: Int = readInt()

        print(s"Enter $sizeOfList elements: \n")
        val inputList = List.fill(sizeOfList) {
          readLine()
        }

        print("Enter from where you want to split the List: ")
        val splitTill = readInt()

        print(s"Original List : $inputList")
        print("\nDuplicated List : " + splitList_Api.splitList(splitTill, inputList))
      }
      catch {
        case _: NumberFormatException => print("Enter valid inputs.")
      }
      print("\nDo you want to continue (Y or N): ")
      continue = readLine()
    }
  }

}
