// Author - Tanishka Garg

package com.tanishka.Question3
import scala.io.StdIn.{readInt, readLine}

object DuplicateList_Impl {

  def main(args: Array[String]): Unit = {

    /* In main function, I have done following things :-
  1. Created an instance of DuplicateList_Api class.
  2. Inside while loop, I have used try-catch block -
   * In try-block, I have taken three inputs from user i.e., sizeOfList ,inputList.
     Then I have called the duplicateList method from the instance created.
   * In catch-block, I have caught all NumberFormatException exceptions by showing a message - "Enter valid inputs." */
    val duplicateList_Api = new DuplicateList_Api
    var continue = "Y"
    while (continue == "Y") {
      try {
        print("Enter the total elements to be inserted in the List: ")
        val sizeOfList: Int = readInt()

        print(s"Enter $sizeOfList elements: \n")
        val inputList = List.fill(sizeOfList) {
          readLine()
        }

        print(s"Original List : $inputList")
        print("\nDuplicated List : " + duplicateList_Api.duplicateList(inputList))
      }
      catch {
        case _: NumberFormatException => print("Enter valid inputs.")
      }
      print("\nDo you want to continue (Y or N): ")
      continue = readLine()
    }
  }

}
