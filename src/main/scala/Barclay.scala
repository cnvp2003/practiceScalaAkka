import scala.collection.immutable.TreeSet
import scala.collection.mutable.ListBuffer

object Barclay {


  def main(args: Array[String]): Unit = {
    //var z = (1 to 36000).toArray
    var z = Array(0, 1,2, 3,4,5,6,7,8,9, 10, 11, 13)
    println(s" result ${solutionnnnn(z)}")
  }

  def solutionnnnn(A: Array[Int]): Int = {
    var N: Int = A.length;
    var result: Int = 0;
    var i: Int = 0;


    /*public static int MaxDiff(int[] array){

      Map <Integer, Integer> map = new HashMap<>();
      int diff = 0;
      int count;
      int stableCount  = 0;
      if (array.length == 0) {
        return -1;
      }
      for (int i = 0; i < array.length; i++){
        count = 0;
        if(i != array.length -1){
          diff = Math.abs(array[i+1] - array[i]);
        }
        if(map.get(diff) == null) {
          map.put(diff, count);
        } else {
          count = map.get(diff)+1;
          map.put(diff, count);
        }

      }
      for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
        if(entry.getValue() >= 3) {
          stableCount = entry.getValue();
          return stableCount;
        }
      }
      return stableCount;
    }*/

   /* for(i <- 0 until N){
      for(j <- i until N){
        if (A(i) != A(j)) {

          result = Math.max(result, j - i);
          println(s"while A(i) != A(j):${A(i)}... ${A(j)} >> result ${result}")
        }
        println(s"result :${result}")
      }
    }*/

   // while (i < N) {

      /*var j: Int = i;
      while (j < N) {
        println(s"while :.. j ${j}.. N ${N}")
        if (A(i) != A(j)) {

          result = Math.max(result, j - i);
          println(s"while A(i) != A(j):${A(i)}... ${A(j)} >> result ${result}")
        }
        println(s"result :${result}")
        j = j + 1;
      }*/
     /* i = i + 1;
    }*/
    return result;
  }

    def solution0001(A: Array[Int], X: Int): Int = {
      var N: Int = A.length;
      if (N == 0) {
        return (-1);
      }
      var l: Int = 0;
      var r: Int = N - 1;
      while (l < r) {
        var m: Int = (l + r) / 2;
        if (A(m) > X) {
          r = m - 1;
        } else {
          l = m;
        }
      }
      if (A(l) == X) {
        return l;
      }
      return -1;
    }

}