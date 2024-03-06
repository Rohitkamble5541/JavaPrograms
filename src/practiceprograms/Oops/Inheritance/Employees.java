package practiceprograms.Oops.Inheritance;

public class Employees {

    // Shows Employees name and salary

    String name = "Rohit";
    public void salary()
    {
        System.out.println("yearly salary is 600000");
    }
}


class Empinfo extends Employees
{
    public static void main(String[] args) {

        Empinfo emp = new Empinfo();
        System.out.println("Employee name is:-" + emp.name);
        emp.salary();


    }


}



