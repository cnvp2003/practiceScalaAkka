package singapore

object Fib {
  def main(args: Array[String]) {
    println(s"FIB ${fib(0)}")
    println(s"FIB ${fib(1)}")
    println(s"FIB ${fib(2)}")
    println(s"FIB ${fib(3)}")
    println(s"FIB ${fib(4)}")
    println(s"FIB ${fib(5)}")
    println(s"FIB ${fib(6)}")
    println(s"FIB ${fibo(6)}")
  }

  //Recursion
  def fib(i: Int):Int = {
    i match {
      case 0 | 1 => i
     // case i:Int if(i <=2) => 1
      case _ => fib(i-1) + fib(i-2)
    }
  }

  //tail Recursion
  def fibo(n:Int):Int={
    def fibonac(n1:Int, a:Int, b:Int):Int = {
      n1 match {
        case 0 => a
        case _ => fibonac(n1-1, b, a+b)
      }
    }
    fibonac(n, 0, 1)
  }
}