package practiceprograms.Oops.Consturctors;

public class Consturctorwithinitialvalues {

    int x;  // Create a class attribute
    public Consturctorwithinitialvalues(){

        // Note that the constructor name must match the class name, and it cannot have a return type (like void).
        x= 5; // Set the initial value for the class attribute x

        System.out.println(x);
    }

    public static void main(String[] args) {

        Consturctorwithinitialvalues con = new Consturctorwithinitialvalues();  // Create an object of class Main (This will call the constructor)
        System.out.println(con.x);  // Print the value of x


        /*
        Also note that the constructor is called when the object is created.
        All classes have constructors by default: if you do not create a class constructor yourself,
        Java creates one for you. However, then you are not able to set initial values for object attributes.
         */

    }
}
