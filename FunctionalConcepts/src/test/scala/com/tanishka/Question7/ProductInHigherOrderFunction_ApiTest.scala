// Author - Tanishka Garg

package com.tanishka.Question7

import org.scalatest.flatspec.AnyFlatSpec

class ProductInHigherOrderFunction_ApiTest extends AnyFlatSpec {

  val productInHigherOrderFunction = new ProductInHigherOrderFunction_Api
  val input1:Int = 80
  val input2:Int = 3

  //Test case for valid inputs
  "Product Higher Order Function" should "be valid" in {
    val intermediateResult = productInHigherOrderFunction.product(input1)
    val actualResult = intermediateResult(input2)
    val expectedResult = 240
    assert(actualResult === expectedResult)
  }

  //Test case for invalid inputs
  "Product Higher Order Function" should "be invalid" in {
    val intermediateResult = productInHigherOrderFunction.product(input1)
    val actualResult = intermediateResult(input2)
    val expectedResult = 89
    assert(actualResult != expectedResult)
  }
}
