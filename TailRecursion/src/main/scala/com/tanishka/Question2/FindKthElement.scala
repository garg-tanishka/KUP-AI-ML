// Author - Tanishka Garg

package com.tanishka.Question2

import scala.annotation.tailrec
import scala.io.StdIn.{readInt, readLine}

object FindKthElement {

  /* In this method we are repeatedly removing the first element and decreasing the given index until it reaches 0.
  DRY RUN - indexToFind = 2 , List[1,2,3,4,5,6] , OUTPUT = 3
  I Iteration   : (2 , [1,2,3,4,5,6] :: [2,3,4,5,6] ) => (2-1=1 , [2,3,4,5,6])
  II Iteration  : (1 , [2,3,4,5,6]   :: [3,4,5,6])    => (1-1=0 , [3,4,5,6] )
  III Iteration : (0 , 3 ) => 3
  */
  @tailrec
  def findKthElementFomList[A](indexToFind: Int, inputList: List[A]): A = (indexToFind, inputList) match {
    case (0, topValueOfList :: _ ) => topValueOfList
    case (indexToFind, _ :: listWithoutTopValue) => findKthElementFomList(indexToFind - 1, listWithoutTopValue)
    case (_, Nil) => throw new NoSuchElementException
  }

  /* In main function, I have done following things :-
   Inside while loop, I have used try-catch block -
    * In try-block, I have taken two inputs from user i.e., sizeOfList and inputList for taking a List from user.
      Then I have taken one more input from user i.e., indexToFind(which index needs to find in the list)
      Then I have called the findKthElementFomList method passing the indexToFind and inputList in parameters.
    * In catch-block, I have caught all NumberFormatException exceptions and NoSuchElementException.
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

        print(s"List Entered : $inputList")
        print("\nEnter the index value from List to find: ")
        val indexToFind: Int = readInt()

        print(s"$indexToFind index value in list is : " + findKthElementFomList(indexToFind,inputList))
      }
      catch {
        case _: NumberFormatException => print("Enter valid inputs.")
        case _: NoSuchElementException => print("out of scope value entered")
      }
      print("\nDo you want to continue (Y or N): ")
      continue = readLine()
    }
  }
}

