
class Table{

    void printTable(int n){
        synchronized(this){//synchronized block
            for(int i=1;i<=5;i++){
                System.out.println(n*i);
                try{
                    Thread.sleep(400);
                }catch(Exception e){System.out.println(e);}
            }
        }
    }//end of the method
}

class MyThread1 extends Thread{
    Table t;
    MyThread1(Table t){
        this.t=t;
    }
    public void run(){
        t.printTable(5);
    }

}
class MyThread2 extends Thread{
    Table t;
    MyThread2(Table t){
        this.t=t;
    }
    public void run(){
        t.printTable(100);
    }
}

class MyThread3 extends Thread{
    Table t;
    MyThread3(Table t){
        this.t=t;
    }
    public void run(){
        t.printTable(2);
    }
}

class MyThread4 extends Thread{
    Table t;
    MyThread4(Table t){
        this.t=t;
    }
    public void run(){
        t.printTable(3);
    }
}

public class TestSynchronizedBlock1{
    public static void main(String args[]){
        Table obj = new Table();//only one object
       // Table obj1 = new Table();//anoher object
        MyThread1 t1=new MyThread1(obj);
        MyThread2 t2=new MyThread2(obj);
       // MyThread3 t3=new MyThread3(obj1);
       // MyThread4 t4=new MyThread4(obj1);
        t1.start();
        t2.start();
        //t3.start();  //for this need to use  static synchronized
        //t4.start();
    }
}