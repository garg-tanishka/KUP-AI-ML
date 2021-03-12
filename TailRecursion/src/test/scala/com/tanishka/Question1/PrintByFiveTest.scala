// Author - Tanishka Garg

package com.tanishka.Question1
import com.tanishka.Question1.PrintByFive.printByFive
import org.scalatest.flatspec.AnyFlatSpec

class PrintByFiveTest extends AnyFlatSpec{

  val input1 = 15
  val input2 = 30
  val output1 = 20
  val output2 = 25

  //Valid Test cases
  "Values by Five" should "be valid" in {
    val actualResult = printByFive(input1,input2)
    val expectedResult = List(input1,output1,output2,input2)
    assert(actualResult === expectedResult)
  }
  "Values by Five" should "be valid if input1 < input2 the output will be empty List" in {
    val actualResult = printByFive(input2,input1)
    val expectedResult = List()
    assert(actualResult === expectedResult)
  }

  //Invalid Test cases
  "Values by Five" should "be invalid" in {
    val actualResult = printByFive(input1,input2)
    val expectedResult = List(input1,input2,output2,input2)
    assert(actualResult != expectedResult)
  }

}