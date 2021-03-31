// Author - Tanishka Garg

package com.tanishka.Question5

import org.scalatest.flatspec.AnyFlatSpec

class SplitListTest extends AnyFlatSpec{

  val splitList = new SplitListPalindrome

  val list = List("racecar", "Tanishka Garg", "Swantika", "Rahul", "Durgesh", "Nikhil", "Praanav")

  //Test cases for splitPalindromeWithBuiltInFunction method
  "splitPalindromeWithBuiltInFunction" should "be valid" in {
    val actualResult = splitList.splitPalindromeWithBuiltInFunction(list)
    val expectedResult = (List("racecar"), List("Tanishka Garg", "Swantika", "Rahul", "Durgesh", "Nikhil", "Praanav"))
    assert(actualResult === expectedResult)
  }

  "splitPalindromeWithBuiltInFunction" should "be invalid" in {
    val actualResult = splitList.splitPalindromeWithBuiltInFunction(list)
    assert(actualResult != null)
  }

  //Test cases for splitListPalindrome method
  "splitListPalindrome" should "be valid" in {
    val actualResult = splitList.splitListPalindrome(list)
    val expectedResult = (List("racecar"),List("Praanav", "Nikhil", "Durgesh", "Rahul", "Swantika", "Tanishka Garg"))
    assert(actualResult === expectedResult)
  }

  "splitListPalindrome" should "be invalid" in {
    val actualResult = splitList.splitListPalindrome(list)
    assert(actualResult != null)
  }

}
