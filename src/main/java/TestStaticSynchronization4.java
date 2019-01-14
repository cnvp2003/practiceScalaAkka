/**
 * Created by pati80 on 22/10/2018.
 */

class Table1{

    synchronized static void printTable(int n){
        for(int i=1;i<=10;i++){
            System.out.println(n*i);
            try{
                Thread.sleep(400);
            }catch(Exception e){}
        }
    }
}

class MyThread11 extends Thread{
    public void run(){
        Table1.printTable(1);
    }
}

class MyThread21 extends Thread{
    public void run(){
        Table1.printTable(10);
    }
}

class MyThread31 extends Thread{
    public void run(){
        Table1.printTable(100);
    }
}

class MyThread41 extends Thread{
    public void run(){
        Table1.printTable(1000);
    }
}

public class TestStaticSynchronization4{
    public static void main(String t[]){
        MyThread11 t1=new MyThread11();
        MyThread21 t2=new MyThread21();
        MyThread31 t3=new MyThread31();
        MyThread41 t4=new MyThread41();
        t1.start();
        t2.start();
        t3.start();
        t4.start();
    }
}