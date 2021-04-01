// Author - Tanishka Garg

package com.knoldus.QuestionOne
import org.scalatest.flatspec.AnyFlatSpec

class GameTest extends AnyFlatSpec {

  val consoles = new ConsoleLibrary()
  val gta5 = new Game("GTA V", "Rockstar North", List(consoles.Xbox2))

  //Test cases for toString method
  "The toString method" should "be valid" in {
    val actualResult = gta5.toString
    val expectedResult = "Game(GTA V, by Rockstar North)"
    assert(actualResult === expectedResult)
  }

  "The toString method" should "be invalid" in {
    val actualResult = gta5.toString
    val expectedResult = "GTA V, by Rockstar North"
    assert(actualResult != expectedResult)
  }

  //Test cases for isSupported method
  "The isSupported method" should "be valid" in {
    val actualResult = gta5.isSupported(consoles.Xbox2)
    val expectedResult = true
    assert(actualResult === expectedResult)
  }

  "The isSupported method" should "be invalid" in {
    val actualResult = gta5.isSupported(consoles.NintendoSwitch)
    val expectedResult = true
    assert(actualResult != expectedResult)
  }

}
