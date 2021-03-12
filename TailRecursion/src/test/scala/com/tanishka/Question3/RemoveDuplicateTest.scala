// Author - Tanishka Garg

package com.tanishka.Question3

import com.tanishka.Question3.RemoveDuplicate.removeDuplicate
import org.scalatest.flatspec.AnyFlatSpec

class RemoveDuplicateTest extends AnyFlatSpec{

  val negativeInput: Double = -2
  //Test cases for Character Type List
  "removeDuplicate" should "be valid if the List is of Character Type" in {
    val actualResult = removeDuplicate(List('T','a','n','n','i','s','h','k','a','a','a'))
    val expectedResult = List('T','a','n','i','s','h','k')
    assert(actualResult === expectedResult)
  }

  "removeDuplicate" should "be valid if the List is of Character Type with one element in it" in {
    val actualResult = removeDuplicate(List('T'))
    val expectedResult = List('T')
    assert(actualResult === expectedResult)
  }

  //Test cases for Integer Type List
  "removeDuplicate" should "be valid if the List is of Integer Type" in {
    val actualResult = removeDuplicate(List(1,2,1,2,3))
    val expectedResult = List(1,2,3)
    assert(actualResult === expectedResult)
  }

  "removeDuplicate" should "be valid if the List is of Integer Type with one element in it" in {
    val actualResult = removeDuplicate(List(1))
    val expectedResult = List(1)
    assert(actualResult === expectedResult)
  }

  //Test cases for String Type List
  "removeDuplicate" should "be valid if the List is of String Type" in {
    val actualResult = removeDuplicate(List("tanishka","garg","tanishka"))
    val expectedResult = List("tanishka","garg")
    assert(actualResult === expectedResult)
  }

  "removeDuplicate" should "be valid if the List is of String Type with one element in it" in {
    val actualResult = removeDuplicate(List("tanishka"))
    val expectedResult = List("tanishka")
    assert(actualResult === expectedResult)
  }

  //Test cases for Double Type List
  "removeDuplicate" should "be valid if the List is of Double Type" in {
    val actualResult = removeDuplicate(List(0.1,1.1,1.1,2.2))
    val expectedResult = List(0.1,1.1,2.2)
    assert(actualResult === expectedResult)
  }

  "removeDuplicate" should "be valid if the List is of Double Type with one element in it" in {
    val actualResult = removeDuplicate(List(1.1))
    val expectedResult = List(1.1)
    assert(actualResult === expectedResult)
  }

  //Test cases for Any Type List
  "removeDuplicate" should "be valid if the List is of Any Type" in {
    val actualResult = removeDuplicate(List(0.1,"tanishka","garg",'T',"tanishka",'%','T',negativeInput))
    val expectedResult = List(0.1,"tanishka","garg",'T','%',negativeInput)
    assert(actualResult === expectedResult)
  }

  "removeDuplicate" should "be valid if the List is of Any Type of element in it" in {
    val actualResult = removeDuplicate(List("*"))
    val expectedResult = List("*")
    assert(actualResult === expectedResult)
  }

  //Test case when empty List is passed
  "removeDuplicate" should "be valid if the List is empty" in {
    val actualResult = removeDuplicate(List())
    val expectedResult = List()
    assert(actualResult === expectedResult)
  }

  //Test case to check invalid results
  "removeDuplicate" should "be invalid" in {
    val actualResult = removeDuplicate(List(0.1,"tanishka","garg",'T',"tanishka",'%','T',2))
    val expectedResult = List("*")
    assert(actualResult != expectedResult)
  }

}
