// Author - Tanishka Garg

package com.tanishka.Question8

class Conditional_Api {

  //method where if p(x) is true then f(x) will run else x
  def conditional[A](x: A, p: A => Boolean, f: A => A): A = {
    if (p(x)) f(x) else x
  }

}
