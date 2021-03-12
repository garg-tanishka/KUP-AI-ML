// Author - Tanishka Garg

package com.tanishka.Question7

class ProductInHigherOrderFunction_Api {

  /*Higher order function with x as parameter returning a function with y as parameter
  which is giving product of x and y */
  def product(x: Int):Int => Int = (y: Int) => x * y

}
