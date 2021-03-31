// Author - Tanishka Garg

package com.tanishka.Question2

import org.scalatest.flatspec.AnyFlatSpec

class FactorTest extends AnyFlatSpec{

  val factor = new Factor

  val input1 = 15
  val input2 = 25
  val output1 = 3
  val output2 = 5

  val inputPrime = 7

  //Test cases for factors method
  "Factors" should "be valid" in {
    val actualResult = factor.factors(input1)
    val expectedResult = List(output1,output2)
    assert(actualResult === expectedResult)
  }

  "Factors" should "return empty when we entire prime number" in {
    val actualResult = factor.factors(inputPrime)
    val expectedResult = List()
    assert(actualResult === expectedResult)
  }

  "Factors" should "be invalid" in {
    val actualResult = factor.factors(input2)
    val expectedResult = List(output1)
    assert(actualResult != expectedResult)
  }

}
