// Author - Tanishka Garg

package com.tanishka.Question2

class Factor {

  //return the list of factors of number filtering 1 and number itself
  def factors(value: Int):List[Int] = {
    (2 until (value-1) filter (value % _ == 0) ).toList
  }

}
