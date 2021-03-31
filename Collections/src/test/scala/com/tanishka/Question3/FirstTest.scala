// Author - Tanishka Garg

package com.tanishka.Question3

import org.scalatest.flatspec.AnyFlatSpec

class FirstTest extends AnyFlatSpec{

  val first = new First

  //Test cases for firstWithInBuiltFunction method
  "firstWithInBuiltFunction" should "be valid if List is of type Char" in {
    val actualResult = first.firstWithInBuiltFunction(List('a','e', 'u'),2)
    val expectedResult = List('a','e')
    assert(actualResult === expectedResult)
  }

  "firstWithInBuiltFunction" should "be valid if List is of type String" in {
    val actualResult = first.firstWithInBuiltFunction(List("Tanishka Garg", "Divya Gupta", "Purva Choudhary"),2)
    val expectedResult = List("Tanishka Garg", "Divya Gupta")
    assert(actualResult === expectedResult)
  }

  "firstWithInBuiltFunction" should "be valid if List is of type Int" in {
    val actualResult = first.firstWithInBuiltFunction(List(1,0,2,3),3)
    val expectedResult = List(1,0,2)
    assert(actualResult === expectedResult)
  }

  "firstWithInBuiltFunction" should "be valid if List is of type Double" in {
    val actualResult = first.firstWithInBuiltFunction(List(1.1,2.2,3.3,0.1),2)
    val expectedResult = List(1.1,2.2)
    assert(actualResult === expectedResult)
  }

  "firstWithInBuiltFunction" should "be invalid" in {
    val actualResult = first.firstWithInBuiltFunction(List('a','e', 'u'),2)
    val expectedResult =  List('a')
    assert(actualResult != expectedResult)
  }

  //Test cases for firstWithFor method
  "firstWithFor" should "be valid if List is of type Char" in {
    val actualResult = first.firstWithFor(List('a','e', 'u'),2)
    val expectedResult = List('a','e')
    assert(actualResult === expectedResult)
  }

  "firstWithFor" should "be valid if List is of type String" in {
    val actualResult = first.firstWithFor(List("Tanishka Garg", "Divya Gupta", "Purva Choudhary"),2)
    val expectedResult = List("Tanishka Garg", "Divya Gupta")
    assert(actualResult === expectedResult)
  }

  "firstWithFor" should "be valid if List is of type Int" in {
    val actualResult = first.firstWithFor(List(1,0,2,3),3)
    val expectedResult = List(1,0,2)
    assert(actualResult === expectedResult)
  }

  "firstWithFor" should "be valid if List is of type Double" in {
    val actualResult = first.firstWithFor(List(1.1,2.2,3.3,0.1),2)
    val expectedResult = List(1.1,2.2)
    assert(actualResult === expectedResult)
  }

  "firstWithFor" should "be invalid" in {
    val actualResult = first.firstWithFor(List('a','e', 'u'),2)
    val expectedResult =  List('a')
    assert(actualResult != expectedResult)
  }

  //Test cases for firstWithFoldLeft method
  "firstWithFoldLeft" should "be valid if List is of type Char" in {
    val actualResult = first.firstWithFoldLeft(List('a','e', 'u'),2)
    val expectedResult = List('a','e')
    assert(actualResult === expectedResult)
  }

  "firstWithFoldLeft" should "be valid if List is of type String" in {
    val actualResult = first.firstWithFoldLeft(List("Tanishka Garg", "Divya Gupta", "Purva Choudhary"),2)
    val expectedResult = List("Tanishka Garg", "Divya Gupta")
    assert(actualResult === expectedResult)
  }

  "firstWithFoldLeft" should "be valid if List is of type Int" in {
    val actualResult = first.firstWithFoldLeft(List(1,0,2,3),3)
    val expectedResult = List(1,0,2)
    assert(actualResult === expectedResult)
  }

  "firstWithFoldLeft" should "be valid if List is of type Double" in {
    val actualResult = first.firstWithFoldLeft(List(1.1,2.2,3.3,0.1),2)
    val expectedResult = List(1.1,2.2)
    assert(actualResult === expectedResult)
  }

  "firstWithFoldLeft" should "be invalid" in {
    val actualResult = first.firstWithFoldLeft(List('a','e', 'u'),2)
    val expectedResult =  List('a')
    assert(actualResult != expectedResult)
  }

  //Test cases for firstWithRecursive method
  "firstWithRecursive" should "be valid if List is of type Char" in {
    val actualResult = first.firstWithRecursive(List('a','e', 'u'),2)
    val expectedResult = List('a','e')
    assert(actualResult === expectedResult)
  }

  "firstWithRecursive" should "be valid if List is of type String" in {
    val actualResult = first.firstWithRecursive(List("Tanishka Garg", "Divya Gupta", "Purva Choudhary"),2)
    val expectedResult = List("Tanishka Garg", "Divya Gupta")
    assert(actualResult === expectedResult)
  }

  "firstWithRecursive" should "be valid if List is of type Int" in {
    val actualResult = first.firstWithRecursive(List(1,0,2,3),3)
    val expectedResult = List(1,0,2)
    assert(actualResult === expectedResult)
  }

  "firstWithRecursive" should "be valid if List is of type Double" in {
    val actualResult = first.firstWithRecursive(List(1.1,2.2,3.3,0.1),2)
    val expectedResult = List(1.1,2.2)
    assert(actualResult === expectedResult)
  }

  "firstWithRecursive" should "be invalid" in {
    val actualResult = first.firstWithRecursive(List('a','e', 'u'),2)
    val expectedResult =  List('a')
    assert(actualResult != expectedResult)
  }

}
