// Author - Tanishka Garg

package com.knoldus.QuestionTwo.A
import org.scalatest.flatspec.AnyFlatSpec

class LinkedListWithParameterisedTypeTest extends AnyFlatSpec{

  val input1 = 1
  val input2 = 2
  val input3 = 3
  val input4 = 4

  val intObjectOne = new LinkedListWithParameterisedType(input1,input2,input3,input4)
  val doubleObjectOne = new LinkedListWithParameterisedType(3.4,5.6,7.9)
  val stringObjectOne = new LinkedListWithParameterisedType("Tanishka","Swantika","Priya")
  val charObjectOne = new LinkedListWithParameterisedType('T','a','n','i','s','h','k','a')

  /*TEST CASES FOR INTEGER TYPE*/

  //Test cases for apply method
  "Validating apply method with Integer Type" should "be valid" in {
    val actualResult = intObjectOne.apply(1)
    val expectedResult = Some(2)
    assert(actualResult === expectedResult)
  }

  "Validating apply method with Integer Type" should "be invalid" in {
    val actualResult = intObjectOne.apply(1)
    val expectedResult = Some(1)
    assert(actualResult != expectedResult)
  }

  /*---------------------------------------------------------------------------*/

  /*TEST CASES FOR DOUBLE TYPE*/

  //Test cases for apply method
  "Validating apply method with Double Type" should "be valid" in {
    val actualResult = doubleObjectOne.apply(1)
    val expectedResult = Some(5.6)
    assert(actualResult === expectedResult)
  }

  "Validating apply method with Double Type" should "be invalid" in {
    val actualResult = doubleObjectOne.apply(1)
    val expectedResult = Some(3.4)
    assert(actualResult != expectedResult)
  }

  /*-----------------------------------------------------------------------------*/

  /*TEST CASES FOR STRING TYPE*/

  //Test cases for apply method
  "Validating apply method with String Type" should "be valid" in {
    val actualResult = stringObjectOne.apply(1)
    val expectedResult = Some("Swantika")
    assert(actualResult === expectedResult)
  }

  "Validating apply method with String Type" should "be invalid" in {
    val actualResult = stringObjectOne.apply(1)
    val expectedResult = Some("Tanishka")
    assert(actualResult != expectedResult)
  }

  /*-------------------------------------------------------------------------------*/

  /*TEST CASES FOR CHAR TYPE*/

  //Test cases for apply method
  "Validating apply method with Char Type" should "be valid" in {
    val actualResult = charObjectOne.apply(1)
    val expectedResult = Some('a')
    assert(actualResult === expectedResult)
  }

  "Validating apply method with Char Type" should "be invalid" in {
    val actualResult = charObjectOne.apply(1)
    val expectedResult = Some('T')
    assert(actualResult != expectedResult)
  }

}
