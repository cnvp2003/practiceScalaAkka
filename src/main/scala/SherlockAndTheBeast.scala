package scala.codeChallange

object SherlockAndTheBeast {

  def main(args: Array[String]) {
    val sc = new java.util.Scanner (System.in)
    val t = sc.nextInt()
    var a0 = 0
    val a = new Array[Int](t)

      for(a_i <- 0 to t-1) {
        a(a_i) = sc.nextInt()
    }
    a.toList.map{
      /*x => x match {
        case x if(x % 3 == 0 && x % 5 != 0) => {
          for(i <- 1 to x) {
            print("5")
          }
          println()
        }
        case x if(x % 3 != 0 && x % 5 == 0) => {
          for(i <- 1 to x) {
            print("3")
          }
          println()
        }

        case x if(x % 3 == 0 && x % 5 == 0) => {
          for(i <- 1 to x) {
            print("3")
          }
          println()
        }
        case x if ((x-5 > 0) && (x - 5) % 3 == 0)=> {
            for(i <- 1 to x-5)
            print("5")
            for(j <- 1 to 5)
              print(3)
            println()
        }
        case _ => println("-1")
      }*/
      x1 =>
      /*val y = x
        var z = y
        while (z % 3 != 0){
          z -= 5
        }

        if(z < 0) {
          println(-1)
        } else{
          for(i <- 1 to z)
            print(5)
          for(j <- 1 to y-z)
            print(3)
          println()
        }*/

        (0 to x1).find(x => x % 5 == 0 && (x1 - x) % 3 == 0) match {
          case None => println(-1)
          case Some(x) => println("5" * (x1 - x) + "3" * x)
        }

    }
  }
}

