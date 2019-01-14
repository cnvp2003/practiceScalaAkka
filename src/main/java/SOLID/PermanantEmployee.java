package SOLID;

/**
 * Created by pati80 on 21/10/2018.
 */
public class PermanantEmployee extends Employee {

    @Override
    public double calculateBonus(double salary) {
        return salary * .10;
    }

    @Override
    public double getSalary() {
        return 30000;
    }
}
