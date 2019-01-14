
object StringLetsReview {


  def main(args: Array[String]) {
    val n = scala.io.StdIn.readInt()

    1 to n foreach { _ =>
      val in = scala.io.StdIn.readLine()
      val myCharArray = in.toList
      var evenString = ""
      var oddString = ""

      for(i <- 0 until myCharArray.length){
        if(i % 2 ==0){
          evenString += myCharArray(i)
        }else{
          oddString += myCharArray(i)
        }
      }
      println(s"$evenString $oddString")
    }

  }

  def even ={

  }

  def odd ={

  }

}