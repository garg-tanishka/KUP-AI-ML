// Author - Tanishka Garg
package com.tanishka.Question5

import scala.annotation.tailrec
import scala.io.StdIn.{readInt, readLine}

object ReverseList {
  /* In this method we are repeatedly inserting the top element of the List in resultList.
  DRY RUN  - inputList[1,2,3]
  I Iteration   : (1, [2,3] ) => ( 1 :: [1] , [2,3] )
  II Iteration  : (2, [3] )   => ( 2 :: [2,1] ,[3] )
  III Iteration : (3, [Nil] ) => ( 3 :: [3,2,1] , [Nil] )
  IV Iteration  : Nil => [3,2,1]
  */
  def reverseList[A](inputList: List[A]): List[A] = {
    @tailrec
    def reverseRecursive(resultList: List[A], currentList: List[A]): List[A] = currentList match {
      case Nil => resultList
      case topValueOfList :: listWithoutTopValue => reverseRecursive(topValueOfList :: resultList, listWithoutTopValue)
    }
    reverseRecursive(Nil, inputList)
  }

  /* In main function, I have done following things :-
   Inside while loop, I have used try-catch block -
    * In try-block, I have taken two inputs from user i.e., sizeOfList and inputList for taking a List from user.
      Then I have called the reverseList method passing the inputList in parameters.
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
        print(s"Original List: $inputList")
        print("\nReversed List: " + reverseList(inputList))
      }
      catch {
        case _: NumberFormatException => print("Enter valid inputs.")
      }
      print("\nDo you want to continue (Y or N): ")
      continue = readLine()
    }
  }
}
