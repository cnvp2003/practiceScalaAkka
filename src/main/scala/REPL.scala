/**
  * Created by pati80 on 14/12/2018.
  */
object REPL {

  def main(args: Array[String]): Unit = {
    //val n = scala.io.Source.stdin.getLines().take(1).toString
    //val n = scala.io.StdIn.readInt()

    //val r = 1 to 100 by 3
    //val l = List.fill(100)(util..nextInt(100))
    //case i if(i + shift > list.size) => list(shift)
    val list = List.range(1, 101)
    list.map { x =>
      x match {
        case i if (i % 3 == 0 & i % 7 == 0) => println(s"HappyDays")
        case i if (i % 3 == 0) => println(s"Happy")
        case i if (i % 7 == 0) => println(s"Days")
        case i => println(i)
      }
    }

/*
    for (i <- 1 to 21){
     if(i%3 ==0 & i %7==0 ) println(s"HappyDays")
     if(i%3 ==0 ) println(s"Happy")
     if(i %7==0 ) println(s"Days")
     else println(i)

   }*/
  }

}
