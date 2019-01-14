
class Table2{

    synchronized static void printTable(int n){
        for(int i=1;i<=10;i++){
            System.out.println(n*i);
            try{
                Thread.sleep(400);
            }catch(Exception e){}
        }
    }
}

class MyThread12 extends Thread{
    public void run(){
        Table1.printTable(1);
    }
}

class MyThread22 extends Thread{
    public void run(){
        Table1.printTable(10);
    }
}

class MyThread32 extends Thread{
    public void run(){
        Table1.printTable(100);
    }
}




class MyThread42 extends Thread{
    public void run(){
        Table1.printTable(1000);
    }
}

public class TestStaticSync{
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