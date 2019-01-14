/**
  * Created by pati80 on 28/03/17.
  */
  import scala.collection.mutable

  // you can write to stdout for debugging purposes, e.g.
  // println("this is a debug message")

  object LiftStopsCount extends App{
    var lift = mutable.ListMap[Int, Int]()
    var count = 0
    //m floor, x number of ppl, Y weight capacity
    // a: Array[n] with y, b:Array[n] with m
    def solution(personWeight: Array[Int], personFloor: Array[Int], m: Int, x: Int, y: Int): Int = {
      // write your code in Scala 2.12
      checkOverLoad(personWeight, personFloor, y, x)
      println(s"count $count")
      count
    }

    def checkOverLoad(perWt: Array[Int],  flrList: Array[Int], maxCapacity:Int, numberOfppl: Int)= {
      if (perWt.sum <= maxCapacity && flrList.size <= numberOfppl) {
        // count stops based on flrList
        count += floorCount(flrList)
      } else {
        for (i <- perWt.indices){
          if (perWt(i) <= remainingWeight(maxCapacity) && checkPplInLift(numberOfppl)) {
            lift += (perWt(i) -> flrList(i))
          }else{
            totalCount
            lift.clear()
            lift += (perWt(i) -> flrList(i))
          }
        }
        totalCount
      }
    }

    def checkWeightInLift(lift: Array[Int], maxCapacity:Int):Boolean={
      if(lift.sum <= maxCapacity) true else false
    }

    def remainingWeight(maxCapacity:Int):Int={
      maxCapacity - lift.keys.sum
    }

    def checkPplInLift(numberOfppl: Int):Boolean={
      if(numberOfppl - (lift.size+1) <= numberOfppl && !(numberOfppl - (lift.size+1) < 0)) true else false
    }

    def totalCount()={
      count += floorCount(lift.values)
      count += 1 //for ground floor
    }

    def floorCount(flrList: Iterable[Int]):Int={
      flrList.toList.distinct.length
    }

    val a = Array(60, 80, 40)
    val a1 = Array(40, 40, 100, 80, 20)
    val b = Array(2, 3, 5)
    val b1 = Array(3, 3, 2, 2, 3)

    solution(a1, b1, 5, 2, 200)

}