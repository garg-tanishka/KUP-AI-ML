// Author - Tanishka Garg

package com.tanishka.Question4

class AreaOfCircle_Api {

  // Checking if the radius of circle is non-zero then calculating the area of circle.
  def areaOfCircle(radiusOfCircle: String): Double = {
    radiusOfCircle.isEmpty match {
      case true => 0
      case false => math.pow(radiusOfCircle.toDouble,2) * math.Pi
    }
  }
}
