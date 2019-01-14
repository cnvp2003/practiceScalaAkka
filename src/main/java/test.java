/**
 * Created by pati80 on 4/5/18.
 */

import java.util.HashSet;
import java.util.concurrent.CountDownLatch;

public class test {

   /* public static void main(String[] args) {
        CountDownLatch latch = new CountDownLatch(3);

        Waiter      waiter      = new Waiter(latch);
        Decrementer decrementer = new Decrementer(latch);
        try {
            new Thread(waiter).start();
            new Thread(decrementer).start();

            Thread.sleep(4000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }*/

    public static void main(String[] args) {
        /*int[] i = {1};
test t = new test();
t.increment(i);*/

System.out.println(increment0(5, 3));
    }

   private static int increment0(int a, int b){
        if(b == 0) {
            return a;
        } else {
            return increment1( a , a-b);
        }
    }

    private static int increment1(int a, int b){
        if(a == 0) {
            return b;
        } else {
            return increment0(b ,a);
        }
    }

}




