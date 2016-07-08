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
    val person = new Person("Peter", "Parker")
    println(person)
    println(s"Name: ${person.firstName} ${person.lastName}")
  }
}

class Person(val firstName: String, val lastName: String)
