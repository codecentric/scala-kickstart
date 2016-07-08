package de.codecentric.scalakickoff

object App {

  // in java: public final int number = 5  
  val number = 5

  // in java: public int mutableNum = 5
  var mutableNum = 5
  
  // in java: public int giveNumber { return 5 }
  def giveNumber = 5

  def main(args: Array[String]) {
    println(s"Hello from Scala $number")
  }
}
