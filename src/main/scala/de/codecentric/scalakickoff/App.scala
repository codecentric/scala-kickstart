package de.codecentric.scalakickoff

object App {

  // in java: public final int number = 5  
  val number = 5

  // in java: public int mutableNum = 5
  var mutableNum = 5
  
  // in java: public int giveNumber { return 5 }
  def giveNumber = 5

  def add(a: Int, b: Int) = {
    a + b
  }

  def main(args: Array[String]) = {
    val peter = new Person("Peter", "Parker")
    val bruce = new Person("Bruce", "Wayne")
    val tony = new Person("Tony", "Stark")

    val heroes = List(peter, bruce, tony)

    val overAllLength = heroes.map(_.firstName.length).reduce(_-_)
  }
}

case class Person(firstName: String = "James", lastName: String)
