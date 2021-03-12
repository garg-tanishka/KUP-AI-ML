// Author - Tanishka Garg

package com.tanishka.Question3
import org.scalatest.flatspec.AnyFlatSpec

class DuplicateList_ApiTest extends AnyFlatSpec{

  val duplicateList = new DuplicateList_Api

  //Test case for Character Type List
  "Duplicate" should "be valid if the elements are of Character Type" in {
    val actualResult = duplicateList.duplicateList(List('a','b','c'))
    val expectedResult = List('a','a','b','b','c','c')
    assert(actualResult === expectedResult)
  }

  //Test case for String Type List
  "Duplicate" should "be valid if the elements are of String Type" in {
    val actualResult = duplicateList.duplicateList(List("tanishka","garg"))
    val expectedResult = List("tanishka","tanishka","garg","garg")
    assert(actualResult === expectedResult)
  }

  //Test case for Integer Type List
  "Duplicate" should "be valid if the elements are of Integer Type" in {
    val actualResult = duplicateList.duplicateList(List(1,2,3))
    val expectedResult = List(1,1,2,2,3,3)
    assert(actualResult === expectedResult)
  }

  //Test case for Double Type List
  "Duplicate" should "be valid if the elements are of Double Type" in {
    val actualResult = duplicateList.duplicateList(List(1.1,2.1,3.1))
    val expectedResult = List(1.1,1.1,2.1,2.1,3.1,3.1)
    assert(actualResult === expectedResult)
  }

  //Test case for Any Type List
  "Duplicate" should "be valid if the elements are of Any Type" in {
    val actualResult = duplicateList.duplicateList(List(1.1,"tanishka",3,'T','('))
    val expectedResult = List(1.1,1.1,"tanishka","tanishka",3,3,'T','T','(','(')
    assert(actualResult === expectedResult)
  }

  //Test case for Empty List
  "Duplicate" should "be valid if the List is empty" in {
    val actualResult = duplicateList.duplicateList(List())
    val expectedResult = List()
    assert(actualResult === expectedResult)
  }

  //Test case for one element in the List
  "Duplicate" should "be valid if the List has one element" in {
    val actualResult = duplicateList.duplicateList(List('a'))
    val expectedResult = List('a','a')
    assert(actualResult === expectedResult)
  }

  //Test case for invalid output
  "Duplicate" should "be invalid" in {
    val actualResult = duplicateList.duplicateList(List(1.1,"tanishka",3,'T','('))
    val expectedResult = List(1.1,1.1,"tanishka","tanishka",3,3)
    assert(actualResult != expectedResult)
  }
}
