package practiceprograms.Basicpro;

import java.util.Scanner;

public class Takeinputuser {

    public static void main(String[] args) {

        System.out.println("Addition operatons performed:-");

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first number");
        int first =sc.nextInt();

        System.out.println("Enter Second number");
        int second =sc.nextInt();


        int Result = first+second;
        System.out.println("Addition of two number is:- "+Result);

        sc.close();
    }
}
