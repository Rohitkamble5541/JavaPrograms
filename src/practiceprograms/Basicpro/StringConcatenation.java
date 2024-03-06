package practiceprograms.Basicpro;

public class StringConcatenation {

    public static void main(String[] args) {

        String firstname = "Rohit";
        String lastname = "Kamble";

        // string concatenation using + operator
        System.out.println("String concatenation using '+'");
        System.out.println(firstname +" "+lastname);

        // string concatenation using concat() method
        System.out.println("String concatenation using 'concat()'");
        System.out.println(firstname.concat( lastname));

    }
}
