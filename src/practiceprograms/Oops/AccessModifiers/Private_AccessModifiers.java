package practiceprograms.Oops.AccessModifiers;

public class Private_AccessModifiers {

    // The code is only accessible within the declared class


    private int age = 45;
    private String Name = "Rohit";
    private String Lastname = "Kamble";

    public static void main(String[] args) {

        Private_AccessModifiers pr = new Private_AccessModifiers();
        System.out.println("My name is :-" + pr.Name + "\nLast name is:-" + pr.Lastname + "\nAge is:-" +pr.age);



    }

}



