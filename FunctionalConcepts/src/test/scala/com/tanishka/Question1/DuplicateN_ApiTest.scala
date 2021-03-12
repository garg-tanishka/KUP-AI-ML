// Author - Tanishka Garg

package com.tanishka.Question1
import org.scalatest.flatspec.AnyFlatSpec

class DuplicateN_ApiTest extends AnyFlatSpec{

  val duplicateN = new DuplicateN_Api

  //Test case for Character Type List
  "DuplicateN" should "be valid if the elements are of Character Type" in {
    val actualResult = duplicateN.duplicateN(3,List('a','b','c'))
    val expectedResult = List('a','a','a','b','b','b','c','c','c')
    assert(actualResult === expectedResult)
  }

  //Test case for String Type List
  "DuplicateN" should "be valid if the elements are of String Type" in {
    val actualResult = duplicateN.duplicateN(3,List("tanishka","garg"))
    val expectedResult = List("tanishka","tanishka","tanishka","garg","garg","garg")
    assert(actualResult === expectedResult)
  }

  //Test case for Integer Type List
  "DuplicateN" should "be valid if the elements are of Integer Type" in {
    val actualResult = duplicateN.duplicateN(3,List(1,2,3))
    val expectedResult = List(1,1,1,2,2,2,3,3,3)
    assert(actualResult === expectedResult)
  }

  //Test case for Double Type List
  "DuplicateN" should "be valid if the elements are of Double Type" in {
    val actualResult = duplicateN.duplicateN(3,List(1.1,2.1,3.1))
    val expectedResult = List(1.1,1.1,1.1,2.1,2.1,2.1,3.1,3.1,3.1)
    assert(actualResult === expectedResult)
  }

  //Test case for Any Type List
  "DuplicateN" should "be valid if the elements are of Any Type" in {
    val actualResult = duplicateN.duplicateN(3,List(1.1,"tanishka",3,'T','('))
    val expectedResult = List(1.1,1.1,1.1,"tanishka","tanishka","tanishka",3,3,3,'T','T','T','(','(','(')
    assert(actualResult === expectedResult)
  }

  //Test case for invalid output
  "DuplicateN" should "be invalid" in {
    val actualResult = duplicateN.duplicateN(3,List(1.1,"tanishka",3,'T','('))
    val expectedResult = List(1.1,1.1,1.1)
    assert(actualResult != expectedResult)
  }

}
