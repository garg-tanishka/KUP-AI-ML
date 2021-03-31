// Author - Tanishka Garg

package com.tanishka.Question5

class SplitListPalindrome {

  //method should return two List
  def splitPalindromeWithBuiltInFunction(list: List[String]): (List[String] , List[String]) = list partition (s => s == s.reverse)

  //method should return two List
  def splitListPalindrome(list: List[String]) : (List[String] , List[String]) = {
    list.foldLeft((List[String](),List[String]())) { (a, b) =>
      if (b == b.reverse) (b :: a._1, a._2) else (a._1, b:: a._2)
    }
  }

}
