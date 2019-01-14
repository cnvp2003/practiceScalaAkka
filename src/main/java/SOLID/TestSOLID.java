package SOLID;

/**
 * Created by pati80 on 21/10/2018.
 */
public class TestSOLID {

    public static void main(String[] args) {

        // Get salries of all Employee
        IEmployee perm = new PermanantEmployee();
        IEmployee temp = new TemporaryEmployee();
        IEmployee cont = new ContractEmployee();

        System.out.println("PER Sal:"+perm.getSalary());
        System.out.println("temp Sal:"+temp.getSalary());
        System.out.println("cont Sal:"+cont.getSalary());  //Lisknov substitution  (no need to change code to work
                                                           // with new derived class from base class)

        // Get Bonus of eligible Employee
        Employee perm1 = new PermanantEmployee();
        Employee temp1 = new TemporaryEmployee();
        //Employee cont1 = new ContractEmployee();


        System.out.println("PER Bonus:"+perm1.calculateBonus(perm1.getSalary()));
        System.out.println("temp Bonus:"+temp1.calculateBonus(temp1.getSalary()));
    }
}

