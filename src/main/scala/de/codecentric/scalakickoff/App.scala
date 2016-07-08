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
    
    val maybePerson: Option[Person] = Some(peter)

    maybePerson match {
      case Some(person) if person.firstName == "Peter"  => println("It's Peter!")
      case Some(person)                                 => println(person)
      case None                                         => println("Nobody")
    }

    val tuples = for {
      x <- 1 until 10
      y <- 1 until 10
    } yield (x, y)

    println(tuples)
  }
}

case class Person(firstName: String = "James", lastName: String)
