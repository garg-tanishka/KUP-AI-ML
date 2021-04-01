// Author - Tanishka Garg

package com.knoldus.QuestionOne

class Game(val name: String, val maker: String, val consoles: List[Console]) {

  //method that returns true if a given console is supported.
  def isSupported(console: Console): Boolean = consoles.contains(console)

  //Override the default toString method
  override def toString : String = s"Game($name, by $maker)"

}
