// Author - Tanishka Garg

package com.tanishka.Question4
import org.scalatest.flatspec.AnyFlatSpec

class AreaOfCircle_ApiTest extends AnyFlatSpec{

  val areaOfCircle_Api = new AreaOfCircle_Api

  //Test case for integer type radius
  "Area of Circle" should "be valid if radius is Integer" in {
    val actualResult = areaOfCircle_Api.areaOfCircle("23")
    val expectedResult = 1661.9025137490005
    assert(actualResult === expectedResult)
  }

  //Test case for double type radius
  "Area of Circle" should "be valid if radius is Double" in {
    val actualResult = areaOfCircle_Api.areaOfCircle("3.4")
    val expectedResult = 36.316811075498
    assert(actualResult === expectedResult)
  }

  //Test case for Zero radius
  "Area of Circle" should "be valid if radius is String Type" in {
    val actualResult = areaOfCircle_Api.areaOfCircle("0")
    val expectedResult = 0
    assert(actualResult === expectedResult)
  }

  //Test case for invalid output
  "Area of Circle" should "be invalid" in {
    val actualResult = areaOfCircle_Api.areaOfCircle("90")
    val expectedResult = 89
    assert(actualResult != expectedResult)
  }
}
