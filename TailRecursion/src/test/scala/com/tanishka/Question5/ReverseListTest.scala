// Author - Tanishka Garg

package com.tanishka.Question5

import com.tanishka.Question5.ReverseList.reverseList
import org.scalatest.flatspec.AnyFlatSpec

class ReverseListTest  extends AnyFlatSpec {

  val negativeInput:Double = -2

  //Test cases for Character Type
  "reverseList" should "be valid if all the elements in the List are of Character Type" in {
    val actualResult = reverseList(List('T', 'a', 'n', 'i', 's', 'h', 'k', 'a'))
    val expectedResult = List('a', 'k', 'h', 's', 'i', 'n', 'a', 'T')
    assert(actualResult === expectedResult)
  }

  "reverseList" should "be valid if there is only one element in the List of Character Type" in {
    val actualResult = reverseList(List('T'))
    val expectedResult = List('T')
    assert(actualResult === expectedResult)
  }

  //Test cases for String Type
  "reverseList" should "be valid if all the elements in the List are of String Type" in {
    val actualResult = reverseList(List("tanishka", "garg","divya"))
    val expectedResult = List("divya","garg","tanishka")
    assert(actualResult === expectedResult)
  }

  "reverseList" should "be valid if there is only one element in the List of String Type" in {
    val actualResult = reverseList(List("tanishka"))
    val expectedResult = List("tanishka")
    assert(actualResult === expectedResult)
  }

  //Test cases for Integer Type
  "reverseList" should "be valid if all the elements in the List are of Integer Type" in {
    val actualResult = reverseList(List(0,1,2,3))
    val expectedResult = List(3,2,1,0)
    assert(actualResult === expectedResult)
  }

  "reverseList" should "be valid if there is only one element in the List of Integer Type" in {
    val actualResult = reverseList(List(1))
    val expectedResult = List(1)
    assert(actualResult === expectedResult)
  }

  //Test cases for Double Type
  "reverseList" should "be valid if all the elements in the List are of Double Type" in {
    val actualResult = reverseList(List(0.1,1.1,1.1,2.2))
    val expectedResult = List(2.2,1.1,1.1,0.1)
    assert(actualResult === expectedResult)
  }

  "reverseList" should "be valid if there is only one element in the List of Double Type" in {
    val actualResult = reverseList(List(1.1))
    val expectedResult = List(1.1)
    assert(actualResult === expectedResult)
  }

  //Test cases for Any Type
  "reverseList" should "be valid if all the elements in the List are of Any Type" in {
    val actualResult = reverseList(List(0.1,"tanishka","garg",'T',"tanishka",'%','T',negativeInput))
    val expectedResult = List(negativeInput, 'T', '%',"tanishka",'T',"garg","tanishka",0.1)
    assert(actualResult === expectedResult)
  }

  "reverseList" should "be valid if there is only one element in the List of Any Type" in {
    val actualResult = reverseList(List(negativeInput))
    val expectedResult = List(negativeInput)
    assert(actualResult === expectedResult)
  }

  //Test case for the List is empty
  "reverseList" should "be valid if the List is empty" in {
    val actualResult = reverseList(List())
    val expectedResult = List()
    assert(actualResult === expectedResult)
  }

  //Test case for invalid output
  "reverseList" should "be invalid" in {
    val actualResult = reverseList(List('T', 'a', 'n', 'i', 's', 'h', 'k', 'a'))
    val expectedResult = List('T', 'a', 'n', 'i', 's', 'h', 'k', 'a')
    assert(actualResult != expectedResult)
  }
}
