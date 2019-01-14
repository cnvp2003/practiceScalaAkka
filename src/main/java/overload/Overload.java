package overload;


public class Overload {

    public static void main(String args[]){
       Overload ol = new Overload();
       ol.println(new Object());        //Object method call
       //ol.println(null);              //Object method call

        //println(null);               //Static call
        println(new Object());         //Static call
    }

    public static void println(Object obj){
        System.out.println("Object... "+obj);
    }

    public void println(Integer i){
        System.out.println("Integer.. "+i);
    }
    public void println(String s){
        System.out.println("String.. "+s);
    }

}
