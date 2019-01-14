package overriding;

public class  Bike extends Vehicle {
    int speed = 100;

    public int getSpeed() {
        return speed;
    }

    public void show(){
        System.out.println("Bike: "+speed);
    }
}