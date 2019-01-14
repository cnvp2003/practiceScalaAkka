
object ConvertToPM {

  def formatTime(inputTime: String) = {
    if(inputTime.length == 2)
      inputTime
    else
      "0" + inputTime
  }

  def main(args: Array[String]) {
    val sc = new java.util.Scanner (System.in)
    val time = sc.next()


    val isPM = time.toUpperCase().contains("PM")
    val hours = time.split("[a-zA-Z]").toList
    val list = hours(0).split(":").toList

    val formatedList = list.map(formatTime)
    val timeIn24 = if(isPM) {
      if (formatedList(0).toInt == 12) formatedList(0)
      else (formatedList(0).toInt + 12)
    }else{
      if (formatedList(0).toInt == 12) "00" else formatedList(0)
    }

    println(timeIn24 + ":" + formatedList(1)+ ":" + formatedList(2))
  }
}