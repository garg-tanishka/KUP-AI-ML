// Author - Tanishka Garg

package com.knoldus.QuestionOne
import java.util.Date

class ConsoleLibrary {

  // Converts String to Date.
  def strToDate(s: String): Date = {
    val format = new java.text.SimpleDateFormat("yyyy-MM-dd")
    format.parse(s)
  }

  print("\ntoString method of Console Class:\n")

  // To test console class we have 4 instances declared here
  val Xbox2 = new Console("Knoldus", "Community", strToDate("2021-01-04"), Some("a/b"), List(new CartridgeMediaFormat), new HD)
  print(Xbox2)

  val PS5 = new Console("TTN", "Ultimate", strToDate("2015-2-22"), Some("a/b/g"), List(new DvdMediaFormat), new HD)
  print(PS5)

  val NintendoSwitch = new Console("Microsoft", "Standard", strToDate("2010-01-04"), Some("b/g/n"), List(new BluRayMediaFormat, new DvdMediaFormat), new FHD)
  print(NintendoSwitch)

  val PS4 = new Console("Apple", "Community", strToDate("2018-2-04"), Some("g/n"), List(new USBMediaFormat), new UHD4K)
  print(PS4)

}
