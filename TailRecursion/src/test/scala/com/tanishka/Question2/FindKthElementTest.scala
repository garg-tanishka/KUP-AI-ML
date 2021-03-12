// Author - Tanishka Garg

package com.tanishka.Question2
import com.tanishka.Question2.FindKthElement.findKthElementFomList
import org.scalatest.flatspec.AnyFlatSpec

class FindKthElementTest extends AnyFlatSpec{

  val negativeInput:Double= -2

  //Test case for Character Type List
  "Kth Element" should "be valid if the elements are of Character Type" in {
    val actualResult = findKthElementFomList(2,List('T','a','n','i','s','h','k','a'))
    val expectedResult = 'n'
    assert(actualResult === expectedResult)
  }

  //Test case for String Type List
  "Kth Element" should "be valid if the elements are of String Type" in {
    val actualResult = findKthElementFomList(2,List("garg","gupta","tanishka","divya"))
    val expectedResult = "tanishka"
    assert(actualResult === expectedResult)
  }

  //Test case for Integer Type List
  "Kth Element" should "be valid if the elements are of Integer Type" in {
    val actualResult = findKthElementFomList(2,List(1,2,0,3))
    val expectedResult = 0
    assert(actualResult === expectedResult)
  }

  //Test case for Double Type List
  "Kth Element" should "be valid if the elements are of Double Type" in {
    val actualResult = findKthElementFomList(2,List(0.1,1.1,1.1,2.2))
    val expectedResult = 1.1
    assert(actualResult === expectedResult)
  }

  //Test case for Any Type List
  "Kth Element" should "be valid if the elements are of Any Type" in {
    val actualResult = findKthElementFomList(2,List(0.1,"tanishka","garg",'T',"tanishka",'%','T',negativeInput))
    val expectedResult = "garg"
    assert(actualResult === expectedResult)
  }

  //Test case for invalid output
  "Kth Element" should "be invalid" in {
    val actualResult = findKthElementFomList(2,List('T','a','n','i','s','h','k','a'))
    val expectedResult = 's'
    assert(actualResult != expectedResult)
  }

}
