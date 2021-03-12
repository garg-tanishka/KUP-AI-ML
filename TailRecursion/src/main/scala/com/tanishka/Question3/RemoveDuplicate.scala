// Author - Tanishka Garg

package com.tanishka.Question3

import scala.annotation.tailrec
import scala.io.StdIn.{readInt, readLine}

object RemoveDuplicate {

  /* In this method we are repeatedly checking if the currentList does not contains the element then
  adding that element in the currentList.
  DRY RUN - inputList - [1,2,1,2] , OUTPUT = ['1','2']
  I Iteration   : ( [1,2,1,2] , [ ] )  => ([2,1,2] , [1])
  II Iteration  : ( [2,1,2]   , [1] )  => ([1,2]   , [2,1])
  III Iteration : ( [1,2]     , [2,1]) => ([2]     , [2,1])
  IV Iteration  : ( [2]       , [2,1]) => ([Nil]   , [2,1])
  V Iteration   : [1,2]
  */
  def removeDuplicate[Any](inputList : List[Any]) : List[Any] = {
    @tailrec
    def removeDuplicateRecursive(inputListByUser: List[Any], currentList: List[Any]) : List[Any] = inputListByUser match {
      case Nil => currentList.reverse
      case topValueOfList :: listWithoutTopValue =>
        if (currentList.contains(topValueOfList)) {
          removeDuplicateRecursive (listWithoutTopValue, currentList)
        } else {
          removeDuplicateRecursive(listWithoutTopValue, topValueOfList :: currentList)
        }
    }
    removeDuplicateRecursive(inputList, Nil)
  }

  /* In main function, I have done following things :-
   Inside while loop, I have used try-catch block -
    * In try-block, I have taken two inputs from user i.e., sizeOfList and inputList for taking a List from user.
      Then I have called the removeDuplicate method passing the inputList in parameters.
    * In catch-block, I have caught all NumberFormatException exceptions by showing a message - "Enter valid inputs."
 */
  def main(args: Array[String]): Unit = {

    var continue = "Y"
    while (continue == "Y") {
      try {
        print("Enter the total elements to be inserted in the List: ")
        val sizeOfList: Int = readInt()

        print(s"Enter $sizeOfList elements: \n")
        val inputList = List.fill(sizeOfList) {
          readLine()
        }

        print(s"Original List: $inputList ")
        print("\nList with no duplicate elements: " + removeDuplicate(inputList))

      }
      catch {
        case _: NumberFormatException => print("Enter valid inputs.")
      }
      print("\nDo you want to continue (Y or N): ")
      continue = readLine()
    }
  }
}
