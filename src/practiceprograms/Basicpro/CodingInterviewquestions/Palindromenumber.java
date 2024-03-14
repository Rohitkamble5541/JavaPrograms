package practiceprograms.Basicpro.CodingInterviewquestions;

import java.util.Scanner;

public class Palindromenumber {

    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any number:");
        int number = sc.nextInt();

        String originalstring = Integer.toString(number);
        String reversedString = new StringBuilder(originalstring).reverse().toString();

        if (originalstring.equals(reversedString))
        {
            System.out.println(number+": is plaindrome");
        }
        else
        {
            System.out.println(number+": is not plaindrome");
        }
        sc.close();

    }
}
