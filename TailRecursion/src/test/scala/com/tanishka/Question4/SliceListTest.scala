// Author - Tanishka Garg

package com.tanishka.Question4

import com.tanishka.Question4.SliceList.sliceList
import org.scalatest.flatspec.AnyFlatSpec

class SliceListTest  extends AnyFlatSpec{

  val negativeInput:Double= -2

  //Test case for Character Type List
  "Slice" should "be valid if the elements are of Character Type" in {
    val actualResult = sliceList(1,3,List('T','a','n','i','s','h','k','a'))
    val expectedResult = List('a','n')
    assert(actualResult === expectedResult)
  }

  //Test case for String Type List
  "Slice" should "be valid if the elements are of String Type" in {
    val actualResult = sliceList(1,3,List("garg","gupta","tanishka","divya"))
    val expectedResult = List("gupta","tanishka")
    assert(actualResult === expectedResult)
  }

  //Test case for Integer Type List
  "Slice" should "be valid if the elements are of Integer Type" in {
    val actualResult = sliceList(1,3,List(1,2,0,3))
    val expectedResult = List(2,0)
    assert(actualResult === expectedResult)
  }

  //Test case for Double Type List
  "Slice" should "be valid if the elements are of Double Type" in {
    val actualResult = sliceList(1,3,List(0.1,1.1,1.1,2.2))
    val expectedResult = List(1.1,1.1)
    assert(actualResult === expectedResult)
  }

  //Test case for Any Type List
  "Slice" should "be valid if the elements are of Any Type" in {
    val actualResult = sliceList(1,3,List(0.1,"tanishka","garg",'T',"tanishka",'%','T',negativeInput))
    val expectedResult = List("tanishka","garg")
    assert(actualResult === expectedResult)
  }

  //Test case for invalid output
  "Slice" should "be invalid" in {
    val actualResult = sliceList(1,3,List('T','a','n','i','s','h','k','a'))
    val expectedResult = List('c')
    assert(actualResult != expectedResult)
  }

}