// Author - Tanishka Garg

package com.tanishka.Question1

import org.scalatest.flatspec.AnyFlatSpec

class ListOfOddNumbersTest extends AnyFlatSpec{

  val listOfOddNumbers = new ListOfOddNumbers
  val input1 = 1
  val input2 = 3
  val input3 = 5
  val input4 = 7
  val input5 = 9
  val input6 = 11
  val input7 = 13
  val input8 = 15
  val input9 = 17
  val input10 = 19

  //Test cases for listOf20OddNumbers method
  "ListOfOddNumbers" should "be valid and return odd number of list from 1-20 in Long" in {
    val actualResult = listOfOddNumbers.listOf20OddNumbers
    val expectedResult = List(input1,input2,input3,input4,input5,input6,input7,input8,input9,input10)
    assert(actualResult === expectedResult)
  }

  "ListOfOddNumbers" should "be invalid" in {
    val actualResult = listOfOddNumbers.listOf20OddNumbers
    val expectedResult = List(input1,input2,input3,input5,input6,input7,input8,input9,input10)
    assert(actualResult != expectedResult)
  }

  //Test cases for listOf20OddNumbersWithFor method
  "listOf20OddNumbersWithFor" should "be valid and return odd number of list from 1-20 in Long" in {
    val actualResult = listOfOddNumbers.listOf20OddNumbersWithFor
    val expectedResult = List(input1,input2,input3,input4,input5,input6,input7,input8,input9,input10)
    assert(actualResult === expectedResult)
  }

  "listOf20OddNumbersWithFor" should "be invalid" in {
    val actualResult = listOfOddNumbers.listOf20OddNumbersWithFor
    val expectedResult = List(input1,input2,input3,input5,input6,input7,input8,input9,input10)
    assert(actualResult != expectedResult)
  }

  //Test cases for listOf20OddNumbersWithFilter method
  "listOf20OddNumbersWithFilter" should "be valid and return odd number of list from 1-20 in Long" in {
    val actualResult = listOfOddNumbers.listOf20OddNumbersWithFilter
    val expectedResult = List(input1,input2,input3,input4,input5,input6,input7,input8,input9,input10)
    assert(actualResult === expectedResult)
  }

  "listOf20OddNumbersWithFilter" should "be invalid" in {
    val actualResult = listOfOddNumbers.listOf20OddNumbersWithFilter
    val expectedResult = List(input1,input2,input3,input5,input6,input7,input8,input9,input10)
    assert(actualResult != expectedResult)
  }

}
