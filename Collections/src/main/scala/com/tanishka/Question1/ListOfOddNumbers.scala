// Author - Tanishka Garg

package com.tanishka.Question1

class ListOfOddNumbers {

  //return a list of first 20 odd long numbers through for-loop
  def listOf20OddNumbersWithFor: List[Long] ={
   (for (i <- 0L to 9L; j = i * 2 + 1) yield j).toList
  }

  //return a list of first 20 odd long numbers through filter
  def listOf20OddNumbersWithFilter : List[Long] = {
    (0L to 20L filter (_ % 2 == 1)).toList
  }

  //return a list of first 20 odd long numbers through map
  def listOf20OddNumbers: List[Long] = {
  (0L to 9L map (_ * 2 + 1)).toList
  }

}
