package SOLID;

/**
 * Created by pati80 on 21/10/2018.
 */
public class TemporaryEmployee extends Employee {

    @Override
    public double calculateBonus(double salary) {
        return salary * .10;
    }

    @Override
    public double getSalary() {
        return 20000;
    }
}
