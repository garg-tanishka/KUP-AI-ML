// Author - Tanishka Garg

package com.tanishka.Question8

import org.scalatest.flatspec.AnyFlatSpec

class ConditionalTest extends AnyFlatSpec{

  val conditionalObject = new Conditional_Api
  val input1:Int = 8
  val input2:Int = 3

  //Test case for valid inputs
  "Conditional" should "be valid" in {
    val actualResult = conditionalObject.conditional[String]("tanishka", _.length > 4, _.reverse)
    val expectedResult = "akhsinat"
    assert(actualResult === expectedResult)
  }

  "Conditional" should "be valid if length of string is less than 4" in {
    val actualResult = conditionalObject.conditional[String]("ta", _.length > 4, _.reverse)
    val expectedResult = "ta"
    assert(actualResult === expectedResult)
  }

  //Test case for invalid
  "Conditional" should "be invalid" in {
    val actualResult = conditionalObject.conditional[String]("ta", _.length > 4, _.reverse)
    val expectedResult = "tanishka"
    assert(actualResult != expectedResult)
  }

}
