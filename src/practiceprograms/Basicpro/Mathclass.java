package practiceprograms.Basicpro;

public class Mathclass {

    public static void main(String[] args) {


        // findout maximum number
        System.out.println("The maximimum number between '15' and '5' :- ");
        System.out.println(Math.max(15,5));

        // findout minimum number
        System.out.println("The minimum number between '10' and '95' :-");
        System.out.println(Math.min(10,95));

        // The Math.sqrt(x) method returns the square root of x:
        System.out.println("The square root of 64 is:-");
        System.out.println(Math.sqrt(64));

        //The Math.abs(x) method returns the absolute (positive) value of x:
        System.out.println("The Math.abs(x) method returns the absolute (positive) value of x");
        System.out.println(Math.abs(-4.7));

        // Math.random() returns a random number between 0.0 (inclusive), and 1.0 (exclusive):
        System.out.println("Math.random() returns a random number between 0.0 (inclusive), and 1.0 (exclusive):-");
        System.out.println(Math.random());

        // To get more control over the random number, for example, if you only want a random number between 0 and 100, you can use the following formula:

        System.out.println("To get more control over the random number, for example, if you only want a random number between 0 and 100, you can use the following formula:-");
        System.out.println(Math.random()*101);

    }
}
