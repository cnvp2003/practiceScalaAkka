import scala.collection.mutable

object MinimumAverageTimeWithListBuffer {

  case class Customer(orderTime: Int, cookTime: Int) {
    override def toString(): String =  s"Customer [OrderTime=$orderTime, CookTime=$cookTime]"
  }

  def main(args: Array[String]) {
    val customers = mutable.ListBuffer.empty[Customer]
    val n = scala.io.StdIn.readInt()

    1 to n foreach { _ =>
      val in = scala.io.StdIn.readLine()
      val customer = Customer(in.split(" ").head.toInt, in.split(" ").last.toInt)
      customers += customer
    }

    val averageWaitTime = getTotalTime(customers) / n
    println(s"${averageWaitTime}")
  }


  def getTotalTime(customers: mutable.ListBuffer[Customer]): Long = {
    var totalTime = 0L
    var currTime = 0L
    val customersInCookOrder = customers.sortWith(_.cookTime < _.cookTime)
    customersInCookOrder.map { customer =>
      if(customer.orderTime <= currTime){
        currTime = Math.max(currTime, customer.orderTime)
      }
      currTime += customer.cookTime
      totalTime += currTime - customer.orderTime
    }
    totalTime
  }

}