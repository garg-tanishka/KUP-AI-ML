// Author - Tanishka Garg

package com.tanishka.Question2
import scala.annotation.tailrec

class SplitList_Api {

  /* In this method basically I am extracting the head from remainingList and then
  appending it to resultList until the counter is 0.

  DRY RUN ----> fromValue = 3 , List(a,b,c,d,e,f) , OUTPUT - List(a,b,c) , List(d,e,f)
  Iteration I : (3, List(), List(a,b,c,d,e,f)) => (2, List(a) , List(b,c,d,e,f))
  Iteration II : (2, List(a) , List(b,c,d,e,f)) => (1, List(a,b) , List(c,d,e,f))
  Iteration III : (1, List(a,b) , List(c,d,e,f)) => (0, List(a,b,c) , List(d,e,f))
  Iteration IV : (0, List(a,b,c) , List(d,e,f)) => ( List(a,b,c) , List(c,d,f) )  */

  def splitList[A](splitTill: Int, inputList: List[A]):(List[A], List[A]) = {
    @tailrec
    def split[A](count: Int, resultList: List[A], remainingList: List[A]):(List[A],List[A]) = (count, remainingList) match {
      case (_, Nil) => (resultList, Nil)
      case (0, remainingList) => (resultList, remainingList)
      case (count, head::tail) => split(count - 1, resultList:::List(head), tail)
    }
    split(splitTill, List(), inputList)
  }
}
