package practiceprograms.Methods;

public class Main {


    /*
             Example Explained
             myMethod() is the name of the method
             static means that the method belongs to the Main class and not an object of the Main class.
             void means that this method does not have a return value.
     */

    static void Mymethod()
    {
        System.out.println("I just got executed...");

    }

    public static void main(String[] args) {

        Mymethod();  // Call a Method  To call a method in Java, write the method's name followed by two parentheses () and a semicolon;
        Mymethod();
        Mymethod();
    }
}
