package practiceprograms.Oops.JavaInput;

import java.util.Scanner;


/*
If you enter wrong input (e.g. text in a numerical input),
you will get an exception/error message (like "InputMismatchException").

 */

public class Takeinput {

    public static void main(String[] args) {

        // take various types of input from the user

        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter user Firstname , Lastname , age , salary:- ");
        System.out.println("=============================");

        System.out.println("Please enter First Name:-");
        String fname = sc.nextLine();

        System.out.println("Please enter Last Name:-");
        String lname = sc.nextLine();

        System.out.println("Please enter Age:-");
        int age = sc.nextInt();

        System.out.println("Please enter Salary:-");
        double sal = sc.nextDouble();

        sc.close();

        System.out.println("**************************Employee information Table ***********************************");

        System.out.println("Employee First name is :-" +fname );
        System.out.println("Employee Last name is :-" +lname );
        System.out.println("Employee Age is :-" + age );
        System.out.println("Employee salary :-" + sal );


    }
}
