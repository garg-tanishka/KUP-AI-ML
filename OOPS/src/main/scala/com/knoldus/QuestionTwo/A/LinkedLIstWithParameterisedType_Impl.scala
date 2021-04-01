// Author - Tanishka Garg

package com.knoldus.QuestionTwo.A

object LinkedLIstWithParameterisedType_Impl extends App{

 val input1 = 1
 val input2 = 2
 val input3 = 3
 val input4 = 4

 //creating objects of LinkedListWithParameterisedType class with different number of parameters and type
 val objectOne = new LinkedListWithParameterisedType[Int](input1,input2,input3,input4)
 val objectTwo = new LinkedListWithParameterisedType[String]("Tanishka","Swantika")

 //accessing all the methods declared
 print("INTEGER TYPE")
 print("\nPrinting the entire Linked List with Four parameters: ")
 objectOne foreach print
 print(s"\nPrinting the Head of the List: ${objectOne.item}")
 print(s"\nApply method of the List: ${objectOne.apply(1)}")

 print("\n\nSTRING TYPE")
 print("\nPrinting the entire Second Linked List with Two parameters: ")
 objectTwo foreach print
 print(s"\nPrinting the Head of the List: ${objectTwo.item}")
 print(s"\nApply method of the List: ${objectTwo.apply(1)}")

}
