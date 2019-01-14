package scala.codeChallange

object SherlockSquares {
  /*def main(args: Array[String]): Unit = {
   val sc = new java.util.Scanner(System.in);
    val n = sc.nextInt()
    val arr = new Array[String](n)
    for (arr_i <- 0 to n - 1) {
     arr(arr_i) = sc.useDelimiter("\n").next()
  /*    val first = sc.nextDouble()
      val second = sc.nextDouble()
      var square: Double=1
      var i =1
      var count=0
      while(square<=second){
        square = Math.pow(i,2)
        if(square<=second){
          if(square>=first){
            count += 1
          }
        }
        i += 1

      }
      println(count)
*/    }

    arr.toList.map{
      x =>
        val a = x.split(" ")
        val first = a(0)
        val second = a(1)
        val buf: scala.collection.mutable.ArrayBuffer[Int] = ArrayBuffer()
        for(i <- first.toInt to second.toInt){
          if(Math.pow(i, 2) >= first.toDouble &&  Math.pow(i, 2) <= second.toDouble){
           buf += i
          }
        }
        println(buf.toList.size)

    }
  }*/

  def main(args: Array[String]) {
    val t = readLine.toInt;
    for(i <- 1 to t) println(f(readLine.split(" ")));
  }

  def f(n:Array[String]):Long = {
    return Math.sqrt(n(1).toInt).toLong - Math.sqrt(n(0).toInt-1).toLong;
  }
}
