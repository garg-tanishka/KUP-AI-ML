// Author - Tanishka Garg

package com.tanishka.Question5

class MatchCasesToCompareZero_Api {

  //method for comparing the amount by 0 and then showing corresponding message.
  def comparingZero(amount:Double):String={
    amount match{
      case amount if amount > 0 => "greater"
      case amount if amount < 0 => "smaller"
      case amount if amount == 0 => "same"
    }
  }

}
