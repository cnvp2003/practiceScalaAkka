package overriding;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by pati80 on 25/11/2018.
 */
public class TestOverride {


    public static void main(String[] args) {
        final List list = new ArrayList<String>();   // final list cannot change object instance
        list.add("acbd");
        list.add("fsdfs");

        System.out.println("List:"+list);

        Vehicle bk = new Bike();
        System.out.println("Speed: "+bk.speed); //super class variable value
        bk.show();  // object instance value


        //System.out.println(this); // non-static reference
    }
}
