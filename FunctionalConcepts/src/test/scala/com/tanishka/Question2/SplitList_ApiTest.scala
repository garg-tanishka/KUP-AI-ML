// Author - Tanishka Garg

package com.tanishka.Question2
import org.scalatest.flatspec.AnyFlatSpec

class SplitList_ApiTest extends AnyFlatSpec{

  val splitList_Api = new SplitList_Api

  //Test case for Character Type List
  "Split" should "be valid if the elements are of Character Type" in {
    val actualResult = splitList_Api.splitList(2,List('a','b','c'))
    val expectedResult = (List('a','b') ,List('c'))
    assert(actualResult === expectedResult)
  }

  //Test case for String Type List
  "Split" should "be valid if the elements are of String Type" in {
    val actualResult = splitList_Api.splitList(2,List("tanishka","garg","divya","gupta"))
    val expectedResult = (List("tanishka","garg"),List("divya","gupta"))
    assert(actualResult === expectedResult)
  }

  //Test case for Integer Type List
  "Split" should "be valid if the elements are of Integer Type" in {
    val actualResult = splitList_Api.splitList(2,List(1,2,3,0,1,2))
    val expectedResult = (List(1,2),List(3,0,1,2))
    assert(actualResult === expectedResult)
  }

  //Test case for Double Type List
  "Split" should "be valid if the elements are of Double Type" in {
    val actualResult = splitList_Api.splitList(2,List(1.1,2.1,3.1,1.1))
    val expectedResult = (List(1.1,2.1),List(3.1,1.1))
    assert(actualResult === expectedResult)
  }

  //Test case for Any Type List
  "Split" should "be valid if the elements are of Any Type" in {
    val actualResult = splitList_Api.splitList(2,List(1.1,"tanishka",3,'T','('))
    val expectedResult = (List(1.1,"tanishka"),List(3,'T','('))
    assert(actualResult === expectedResult)
  }

  //Test case for invalid output
  "Split" should "be invalid" in {
    val actualResult = splitList_Api.splitList(2,List(1.1,"tanishka",3,'T','('))
    val expectedResult = (List(1.1,1.1,"tanishka","tanishka",3,3),List())
    assert(actualResult != expectedResult)
  }

}