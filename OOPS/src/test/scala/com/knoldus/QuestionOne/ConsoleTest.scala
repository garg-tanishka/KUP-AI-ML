// Author - Tanishka Garg

package com.knoldus.QuestionOne
import org.scalatest.flatspec.AnyFlatSpec

import java.util.Date

class ConsoleTest extends AnyFlatSpec {

  // Converts String to Date.
  def strToDate(s: String): Date = {
    val format = new java.text.SimpleDateFormat("yyyy-MM-dd")
    format.parse(s)
  }

  val Xbox2 = new Console("TTN", "Standard", strToDate("2021-11-10"), Some("a/b"), List(new CartridgeMediaFormat), new HD)

  //Test cases for toString method
  "The toString method" should "be valid" in {
    val actualResult = Xbox2.toString
    val expectedResult = "GameConsole(Make: TTN, Model: Standard)\n"
    assert(actualResult === expectedResult)
  }

  "The toString method" should "be invalid" in {
    val actualResult = Xbox2.toString
    val expectedResult = "GameConsole(Make: TTN, Model: Standard)"
    assert(actualResult != expectedResult)
  }

}
