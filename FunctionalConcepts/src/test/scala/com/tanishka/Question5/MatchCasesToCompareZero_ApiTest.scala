// Author - Tanishka Garg

package com.tanishka.Question5

import org.scalatest.flatspec.AnyFlatSpec

class MatchCasesToCompareZero_ApiTest extends AnyFlatSpec{

  val matchCasesToCompareZero_Api = new MatchCasesToCompareZero_Api
  val input1:Int= 67
  val input2:Double= 98.67
  val input3:Double = 0.78
  val input4:Double= -9.0

  //Test case for Integer Type value
  "Comparing zero" should "be valid if the value is of Integer Type" in {
    val actualResult = matchCasesToCompareZero_Api.comparingZero(input1)
    val expectedResult = "greater"
    assert(actualResult === expectedResult)
  }

  //Test case for Double Type value
  "Comparing zero" should "be valid if the value is of Double Type" in {
    val actualResult = matchCasesToCompareZero_Api.comparingZero(input2)
    val expectedResult = "greater"
    assert(actualResult === expectedResult)
  }

  "Comparing zero" should "be valid if the value is smaller in Double Type" in {
    val actualResult = matchCasesToCompareZero_Api.comparingZero(input3)
    val expectedResult = "greater"
    assert(actualResult === expectedResult)
  }

  //Test case for negative Type value
  "Comparing zero" should "be valid if the value is of negative Type" in {
    val actualResult = matchCasesToCompareZero_Api.comparingZero(input4)
    val expectedResult = "smaller"
    assert(actualResult === expectedResult)
  }

  //Test case if value = 0
  "Comparing zero" should "be valid if the value is 0 " in {
    val actualResult = matchCasesToCompareZero_Api.comparingZero(0)
    val expectedResult = "same"
    assert(actualResult === expectedResult)
  }
}
