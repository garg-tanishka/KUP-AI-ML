// Author - Tanishka Garg

package com.tanishka.Question2

object Factor_Impl extends App {

  //Creating an object of Factor class to invoke factors method
  val factor = new Factor

  val value = 15

 print(s"Factors of $value [ except 1 and number itself ] : ${factor.factors(value)} ")

}
