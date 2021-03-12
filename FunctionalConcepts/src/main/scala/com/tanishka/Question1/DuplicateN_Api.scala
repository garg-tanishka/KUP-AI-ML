// Author - Tanishka Garg

package com.tanishka.Question1

class DuplicateN_Api {

  //method for duplicating the elements of the list by "duplicateTimes" times.
  def duplicateN[Any](duplicateTimes: Int, inputList: List[Any]):List[Any] = {
    inputList flatMap {
      List.fill(duplicateTimes)(_)
    }
  }
}
