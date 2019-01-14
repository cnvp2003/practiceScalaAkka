package SOLID;

/**
 * Created by pati80 on 21/10/2018.
 */

// OCP for Employee class.

public abstract class Employee implements IEmployee, IEmployeeBonus{
    public  String name;
    public  int Id;
    public abstract double calculateBonus(double salary); //not neccesary to declare it here
}