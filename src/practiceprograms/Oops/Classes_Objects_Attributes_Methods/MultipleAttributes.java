package practiceprograms.Oops.Classes_Objects_Attributes_Methods;

public class MultipleAttributes {

    int age = 25;
    String fname = "Rohit";
    String lname = "Kamble";

    public static void main(String[] args) {


        MultipleAttributes myattri = new MultipleAttributes();
        System.out.println("First name is :-" + myattri.fname +"" + "\nLast name is:-" + myattri.lname);
        System.out.println("my age is:-" + myattri.age);

    }
}


