// Author - Tanishka Garg

package com.tanishka.Question3

class DuplicateList_Api {

  //method for duplicating the elements in the list
  def duplicateList[Any](inputList: List[Any]): List[Any] = inputList.flatMap(x => List[Any](x, x))

}
