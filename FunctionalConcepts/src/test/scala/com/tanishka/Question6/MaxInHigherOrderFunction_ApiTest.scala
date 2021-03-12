// Author - Tanishka Garg

package com.tanishka.Question6

import org.scalatest.flatspec.AnyFlatSpec

class MaxInHigherOrderFunction_ApiTest extends AnyFlatSpec{

  val maxInHigherOrderFunction = new MaxInHigherOrderFunction_Api

  "Maximum Higher Order Function" should "be valid" in {
    val actualResult = maxInHigherOrderFunction.pickMaxInHigherOrderFunction((35,90,108),maxInHigherOrderFunction.maxOfTwoNumbers)
    val expectedResult = 108
    assert(actualResult === expectedResult)
  }

  "Maximum Higher Order Function" should "be invalid" in {
    val actualResult = maxInHigherOrderFunction.pickMaxInHigherOrderFunction((35,90,108),maxInHigherOrderFunction.maxOfTwoNumbers)
    val expectedResult = 0
    assert(actualResult != expectedResult)
  }

}
