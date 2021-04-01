// Author - Tanishka Garg

package com.knoldus.QuestionOne

import java.util.Date

//console class that can track the make, model, debut date, wifi type, physical, media formats supported, and maximum video resolution.
class Console(val make: String, val model: String, val debut: Date, val wifiType: Option[String],
              val mediaFormats: List[MediaFormat], val maxVideoResolution: VideoResolution){

  //Override the default toString method
  override def toString: String = {
    s"GameConsole(Make: $make, Model: $model)\n"
  }
}
