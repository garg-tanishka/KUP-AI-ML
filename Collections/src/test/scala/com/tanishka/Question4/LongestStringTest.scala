// Author - Tanishka Garg

package com.tanishka.Question4

import org.scalatest.flatspec.AnyFlatSpec

class LongestStringTest extends AnyFlatSpec{

  val longestString = new LongestString

  val names = List("Priya", "Tanishka Garg", "Swantika", "Rahul", "Durgesh", "Nikhil", "Praanav")

  //Test cases for longestWithGenericType method
  "longestWithGenericType" should "be valid" in {
    val actualResult = longestString.longestWithGenericType[String](names, (x,y) => if (x.length > y.length) x else y)
    val expectedResult = "Tanishka Garg"
    assert(actualResult === expectedResult)
  }

  "longestWithGenericType" should "be invalid" in {
    val actualResult = longestString.longestWithGenericType[String](names, (x,y) => if (x.length > y.length) x else y)
    val expectedResult = "Tanishka"
    assert(actualResult != expectedResult)
  }

  //Test cases for longestWithFold method
  "longestWithFold" should "be valid" in {
    val actualResult = longestString.longestWithFold(names)
    val expectedResult = "Tanishka Garg"
    assert(actualResult === expectedResult)
  }

  "longestWithFold" should "be invalid" in {
    val actualResult = longestString.longestWithFold(names)
    val expectedResult = "Tanishka"
    assert(actualResult != expectedResult)
  }

  //Test cases for longestWithReduce method
  "longestWithReduce" should "be valid" in {
    val actualResult = longestString.longestWithReduce(names)
    val expectedResult = "Tanishka Garg"
    assert(actualResult === expectedResult)
  }

  "longestWithReduce" should "be invalid" in {
    val actualResult = longestString.longestWithReduce(names)
    val expectedResult = "Tanishka"
    assert(actualResult != expectedResult)
  }

  //Test cases for longestWithBuiltInFunction method
  "longestWithBuiltInFunction" should "be valid" in {
    val actualResult = longestString.longestWithBuiltInFunction(names)
    val expectedResult = "Tanishka Garg"
    assert(actualResult === expectedResult)
  }

  "longestWithBuiltInFunction" should "be invalid" in {
    val actualResult = longestString.longestWithBuiltInFunction(names)
    val expectedResult = "Tanishka"
    assert(actualResult != expectedResult)
  }
}
