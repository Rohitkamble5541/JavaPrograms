package practiceprograms.Oops.AccessModifiers;

class Protect_modifiers {

    /*
    The code is accessible in the same package and subclasses. You will learn more about subclasses and superclasses in the inheritance
     */

    protected   int age = 30;
    protected String name = "Rohit";
    protected String Lastnm = "Kamble";

    protected String email = "rohit.kamble.world@gmail.com";
}

class student extends Protect_modifiers
{
    public static void main(String[] args) {

        student st = new student();
        System.out.println("Name is :-" + st.name + "\nLastname:-" + st.Lastnm + "\nAge is:-" + st.age + "\nEmail is :- " + st.email);


    }

}
