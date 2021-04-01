// Author - Tanishka Garg

package com.knoldus.QuestionTwo.C

import org.scalatest.flatspec.AnyFlatSpec

class LinkedList_WithBuiltInMethodsTest extends AnyFlatSpec{

  val input1 = 1
  val input2 = 2
  val input3 = 3
  val input4 = 4
  val input5 = 5
  val input6 = 6

  val input7 = 3.6
  val input8 = 8.9
  val input9 = 2.4

  //creating object of LinkedList_API class
  val linkedList_API = new LinkedList_API

  //accessing create method declared inside the LinkedList_API class
  val intLinkedList: LinkedList_WithBuiltInMethods[Int] = linkedList_API.create(input1,input2,input3,input4,input5,input6)
  val doubleLinkedList: LinkedList_WithBuiltInMethods[Double] = linkedList_API.create(input7,input8,input9)
  val stringLinkedList: LinkedList_WithBuiltInMethods[String] = linkedList_API.create("Tanishka", "Swantika", "Priya")
  val charLinkedList: LinkedList_WithBuiltInMethods[Char] = linkedList_API.create('T', 'a', 'n', 'i','s', 'h', 'k', 'a')

  //creating object of NonEmptyList class
  val intNonEmptyList = new NonEmptyList[Int](2,intLinkedList)
  val doubleNonEmptyList = new NonEmptyList[Int](2,intLinkedList)
  val stringNonEmptyList = new NonEmptyList[Int](2,intLinkedList)
  val charNonEmptyList = new NonEmptyList[Int](2,intLinkedList)

  /*TEST CASES FOR TYPE INTEGER*/

  //Test cases for apply method
  "Validating apply method with Integer type" should "be valid" in {
    val actualResult = intNonEmptyList.apply(1)
    val expectedResult = Some(1)
    assert(actualResult === expectedResult)
  }

  "Validating apply method with Integer type" should "be invalid" in {
    val actualResult = intNonEmptyList.apply(1)
    val expectedResult = Some(2)
    assert(actualResult != expectedResult)
  }

  //Test cases for headOption method
  "Validating headOption method with Integer type" should "be valid" in {
    val actualResult = intNonEmptyList.headOption
    val expectedResult = Some(2)
    assert(actualResult === expectedResult)
  }

  "Validating headOption method with Integer type" should "be invalid" in {
    val actualResult = intNonEmptyList.headOption
    val expectedResult = Some(1)
    assert(actualResult != expectedResult)
  }

  //Test cases for size method
  "Validating size method with Integer type" should "be valid" in {
    val actualResult = intNonEmptyList.size
    val expectedResult = 7
    assert(actualResult === expectedResult)
  }

  "Validating size method with Integer type" should "be invalid" in {
    val actualResult= intNonEmptyList.size
    val expectedResult = 5
    assert(actualResult != expectedResult)
  }

  /*-----------------------------------------------------------------------------*/

  /*TEST CASES FOR TYPE DOUBLE*/

  //Test cases for apply method
  "Validating apply method with Double type" should "be valid" in {
    val actualResult = doubleLinkedList.apply(1)
    val expectedResult = Some(8.9)
    assert(actualResult === expectedResult)
  }

  "Validating apply method with Double type" should "be invalid" in {
    val actualResult = doubleLinkedList.apply(1)
    val expectedResult = Some(2)
    assert(actualResult != expectedResult)
  }

  //Test cases for headOption method
  "Validating headOption method with Double type" should "be valid" in {
    val actualResult = doubleLinkedList.headOption
    val expectedResult = Some(3.6)
    assert(actualResult === expectedResult)
  }

  "Validating headOption method with Double type" should "be invalid" in {
    val actualResult = doubleLinkedList.headOption
    val expectedResult = Some(1)
    assert(actualResult != expectedResult)
  }

  //Test cases for size method
  "Validating size method with Double type" should "be valid" in {
    val actualResult = doubleLinkedList.size
    val expectedResult = 3
    assert(actualResult === expectedResult)
  }

  "Validating size method with Double type" should "be invalid" in {
    val actualResult= doubleLinkedList.size
    val expectedResult = 5
    assert(actualResult != expectedResult)
  }

  /*-------------------------------------------------------------------------*/

  /*TEST CASES FOR TYPE STRING*/

  //Test cases for apply method
  "Validating apply method with String type" should "be valid" in {
    val actualResult = stringLinkedList.apply(1)
    val expectedResult = Some("Swantika")
    assert(actualResult === expectedResult)
  }

  "Validating apply method with String type" should "be invalid" in {
    val actualResult = stringLinkedList.apply(1)
    val expectedResult = Some("Tanishka")
    assert(actualResult != expectedResult)
  }

  //Test cases for headOption method
  "Validating headOption method with String type" should "be valid" in {
    val actualResult = stringLinkedList.headOption
    val expectedResult = Some("Tanishka")
    assert(actualResult === expectedResult)
  }

  "Validating headOption method with String type" should "be invalid" in {
    val actualResult = stringLinkedList.headOption
    val expectedResult = Some("Swantika")
    assert(actualResult != expectedResult)
  }

  //Test cases for size method
  "Validating size method with String type" should "be valid" in {
    val actualResult = stringLinkedList.size
    val expectedResult = 3
    assert(actualResult === expectedResult)
  }

  "Validating size method with String type" should "be invalid" in {
    val actualResult= stringLinkedList.size
    val expectedResult = 5
    assert(actualResult != expectedResult)
  }

  /*----------------------------------------------------------------------------*/

  /*TEST CASES FOR TYPE CHAR*/

  //Test cases for apply method
  "Validating apply method with Char type" should "be valid" in {
    val actualResult = charLinkedList.apply(1)
    val expectedResult = Some('a')
    assert(actualResult === expectedResult)
  }

  "Validating apply method with Char type" should "be invalid" in {
    val actualResult = charLinkedList.apply(1)
    val expectedResult = Some('T')
    assert(actualResult != expectedResult)
  }

  //Test cases for headOption method
  "Validating headOption method with Char type" should "be valid" in {
    val actualResult = charLinkedList.headOption
    val expectedResult = Some('T')
    assert(actualResult === expectedResult)
  }

  "Validating headOption method with Char type" should "be invalid" in {
    val actualResult = charLinkedList.headOption
    val expectedResult = Some('a')
    assert(actualResult != expectedResult)
  }

  //Test cases for size method
  "Validating size method with Char type" should "be valid" in {
    val actualResult = charLinkedList.size
    val expectedResult = 8
    assert(actualResult === expectedResult)
  }

  "Validating size method with Char type" should "be invalid" in {
    val actualResult= charLinkedList.size
    val expectedResult = 5
    assert(actualResult != expectedResult)
  }

  /*--------------------------------------------------------------------------------------------------------------*/

  //creating object of NonEmptyList class
  val intEmptyList = new EmptyList[Int]
  val doubleEmptyList = new EmptyList[Double]
  val stringEmptyList = new EmptyList[String]
  val charEmptyList = new EmptyList[Char]

  /*TEST CASES FOR TYPE INTEGER*/

  //Test cases for apply method
  "Validating apply method with Integer type of emptyList" should "be valid" in {
    val actualResult = intEmptyList.apply(1)
    val expectedResult = None
    assert(actualResult === expectedResult)
  }

  "Validating apply method with Integer type of emptyList" should "be invalid" in {
    val actualResult = intEmptyList.apply(1)
    val expectedResult = Some(1)
    assert(actualResult != expectedResult)
  }
  //Test cases for size method
  "Validating size method with Integer type of emptyList" should "be valid" in {
    val actualResult = intEmptyList.size
    val expectedResult = 0
    assert(actualResult === expectedResult)
  }

  "Validating size method with Integer type of emptyList" should "be invalid" in {
    val actualResult = intEmptyList.size
    val expectedResult = 7
    assert(actualResult != expectedResult)
  }

  /*--------------------------------------------------------------------------------------*/

  /*TEST CASES FOR TYPE DOUBLE*/

  //Test cases for apply method
  "Validating apply method with Double type of emptyList" should "be valid" in {
    val actualResult = doubleEmptyList.apply(1)
    val expectedResult = None
    assert(actualResult === expectedResult)
  }

  "Validating apply method with Double type of emptyList" should "be invalid" in {
    val actualResult = doubleEmptyList.apply(1)
    val expectedResult = Some(1)
    assert(actualResult != expectedResult)
  }
  //Test cases for size method
  "Validating size method with Double type of emptyList" should "be valid" in {
    val actualResult = doubleEmptyList.size
    val expectedResult = 0
    assert(actualResult === expectedResult)
  }

  "Validating size method with Double type of emptyList" should "be invalid" in {
    val actualResult = doubleEmptyList.size
    val expectedResult = 6
    assert(actualResult != expectedResult)
  }

  /*----------------------------------------------------------------------------------*/

  /*TEST CASES FOR TYPE STRING*/

  //Test cases for apply method
  "Validating apply method with String type of emptyList" should "be valid" in {
    val actualResult = stringEmptyList.apply(1)
    val expectedResult = None
    assert(actualResult === expectedResult)
  }

  "Validating apply method with String type of emptyList" should "be invalid" in {
    val actualResult = stringEmptyList.apply(1)
    val expectedResult = Some('t')
    assert(actualResult != expectedResult)
  }
  //Test cases for size method
  "Validating size method with String type of emptyList" should "be valid" in {
    val actualResult = stringEmptyList.size
    val expectedResult = 0
    assert(actualResult === expectedResult)
  }

  "Validating size method with String type of emptyList" should "be invalid" in {
    val actualResult = stringEmptyList.size
    val expectedResult = 1
    assert(actualResult != expectedResult)
  }

  /*-----------------------------------------------------------------------------*/

  /*TEST CASES FOR TYPE CHAR*/

  //Test cases for apply method
  "Validating apply method with Char type of emptyList" should "be valid" in {
    val actualResult = charEmptyList.apply(1)
    val expectedResult = None
    assert(actualResult === expectedResult)
  }

  "Validating apply method with Char type of emptyList" should "be invalid" in {
    val actualResult = charEmptyList.apply(1)
    val expectedResult = Some('t')
    assert(actualResult != expectedResult)
  }
  //Test cases for size method
  "Validating size method with Char type of emptyList" should "be valid" in {
    val actualResult = charEmptyList.size
    val expectedResult = 0
    assert(actualResult === expectedResult)
  }

  "Validating size method with Char type of emptyList" should "be invalid" in {
    val actualResult = charEmptyList.size
    val expectedResult = 4
    assert(actualResult != expectedResult)
  }
}
