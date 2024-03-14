package practiceprograms.Basicpro.CodingInterviewquestions;

import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {

        // Create a program that determines whether a given year is a leap year.
        // A leap year is divisible by 4, but not by 100 unless it is also divisible by 400.
        // Use an if-else statement to make this determination.

        Scanner sc = new Scanner(System.in);
        System.out.println("please enter any year , i will tell you entered year is leap year or not:");
        int leapyear = sc.nextInt();

        if ((leapyear%4==0 && leapyear%100!=0) || (leapyear%400==0))
        {
            System.out.println("Entered year is leap year:"+leapyear);
        }
        else
        {
            System.out.println("Entered year is not leap year:"+leapyear);
        }


    }
}
