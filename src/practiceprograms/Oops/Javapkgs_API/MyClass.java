package practiceprograms.Oops.Javapkgs_API;

import java.util.Scanner;

public class MyClass {

    // Take input from the user
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter your name:-");
        String username = sc.nextLine();
        System.out.println("Username is :- "+username);

        System.out.println("please enter your age:-");
        int age = sc.nextInt();
        System.out.println("Age is :-" + age);






    }
}
