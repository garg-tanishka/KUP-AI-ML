// Author - Tanishka Garg
package com.tanishka.Question4

import scala.annotation.tailrec
import scala.io.StdIn.{readInt, readLine}

object SliceList {

  /* repeatedly comparing the counter with the end value to slice the List in two slices
  DRY RUN - inputList = [1,2,3,4,5] start = 1 end = 3 , OUTPUT = [2,3]
  sliceRecursive(count = 0 , currentList[1,2,3,4,5] , result = nil)
  I Iteration   :count = 1 , currentList[2,3,4,5]   , 1>=1 [2]
  II Iteration  :count = 2 , currentList[3,4,5]     , 2>=1 [3,2]
  III Iteration :count = 3 , currentList[4,5]       , 3>=1 [3,2]
  IV Iteration  :[2,3]
  */
  def sliceList[A](startIndex: Int, endIndex: Int, inputList: List[A]): List[A] = {
    @tailrec
    def sliceRecursive(count: Int, currentList: List[A], result: List[A]): List[A] = {
      if (currentList.isEmpty || count >= endIndex) {
        result.reverse
      }
      else {
        sliceRecursive(count + 1, currentList.tail, if (count >= startIndex){currentList.head :: result} else result)
      }
    }
    sliceRecursive(count= 0, inputList, Nil)
  }

  /* In main function, I have done following things :-
   Inside while loop, I have used try-catch block -
    * In try-block, I have taken two inputs from user i.e., sizeOfList and inputList for taking a List from user.
      Then I have taken two more inputs from user ie., startIndex and endIndex
      Then I have called the sliceList method passing the startIndex,endIndex and inputList in parameters.
    * In catch-block, I have caught all NumberFormatException exceptions by showing a message - "Enter valid inputs."
 */
  def main(args: Array[String]): Unit = {
    var continue = "Y"
    while (continue == "Y") {
      try {
        print("Enter the total elements to be inserted in the List: ")
        val sizeOfList: Int = readInt()

        print(s"Enter $sizeOfList elements : \n")
        val inputList = List.fill(sizeOfList) {
          readLine()
        }

        print(s"Original List: $inputList")

        print("\nEnter the start index: ")
        val startIndex = readInt()

        print("Enter the end index: ")
        val endIndex = readInt()

        print(s"Split list from $startIndex index to $endIndex index is :" + sliceList(startIndex,endIndex,inputList))
      }
      catch {
        case _: NumberFormatException => print("Enter valid inputs.")
      }
      print("\nDo you want to continue (Y or N): ")
      continue = readLine()
    }
  }
}
