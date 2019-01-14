/**
  * Write a Person class with an instance variable age and a constructor that takes an integer initialAge as a parameter.
  * The constructor must assign initialAge to age after confirming the argument passed as initialAge is not negative;
  * if a negative argument is passed as initialAge, the constructor should set age to 0 and print Age is not valid, setting age to 0..
  * In addition, you must write the following instance methods:
  * 1. yearPasses() should increase the age instance variable by 1.
  * 2. amIOld() should perform the following conditional actions:
  *     If age < 13, print You are young..
  *     If age >= 13 and age < 18, print You are a teenager..
  *     Otherwise, print You are old..
  * To help you learn by example and complete this challenge, much of the code is provided for you,
  * but you'll be writing everything in the future. The code that creates each instance of your Person class is in the main method.
  * Don't worry if you don't understand it all quite yet!
  */


class Person {
  var age: Int = 0

  def this(initialAge:Int) = {
    // Add some more code to run some checks on initialAge
    this()
    if(!(Math.abs(initialAge-1)>Math.abs(initialAge))){
      age = initialAge
    }else{
      age = 0
      println(s"Age is not valid, setting age to 0.")
    }
  }

  def amIOld(): Unit = {
    // Do some computations in here and print out the correct statement to the console
    age match {
      case age if(age < 13) => println(s"You are young.")
      case age if(age >= 13 && age <18) => println(s"You are a teenager.")
      case _ => println(s"You are old.")
    }
  }

  def yearPasses(): Unit = {
    // Increment the age of the person in here
    age += 1
  }

}

object ClassVsInstance {

  def main(args: Array[String]) {
    var T=scala.io.StdIn.readInt()
    var i=0
    for(i<-1 to T){
      var age=scala.io.StdIn.readInt()
      var p=new Person(age)
      p.amIOld()
      var j=0
      for(j<-1 to 3){
        p.yearPasses()
      }
      p.amIOld()
      System.out.println()

    }
  }
}