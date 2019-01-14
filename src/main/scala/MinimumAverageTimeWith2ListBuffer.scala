import scala.collection.mutable

object MinimumAverageTimeWith2ListBuffer {

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
    val customerPriority = mutable.ListBuffer.empty[Customer]
    var totalTime = 0L
    var currentTime = 0L
    val customersInTimeOrder = customers.sortWith(_.orderTime < _.orderTime)

    while (customersInTimeOrder.nonEmpty || customerPriority.nonEmpty) {
      while (customersInTimeOrder.nonEmpty && (customerPriority.isEmpty || customersInTimeOrder.head.orderTime <= currentTime)) {
        val customer = customersInTimeOrder.head
        customersInTimeOrder -= customer
        customerPriority += customer
        currentTime = Math.max(currentTime, customer.orderTime)
      }

      customerPriority.sortWith(_.cookTime < _.cookTime).map { customer =>
        currentTime += customer.cookTime
        totalTime += currentTime - customer.orderTime
      }
      customerPriority.clear()
    }
    totalTime
  }
}