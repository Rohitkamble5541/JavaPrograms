package practiceprograms.Basicpro.CodingInterviewquestions;

import java.util.Scanner;

public class PalindromeString {

    public static void main(String[] args) {

        //Palindrome number algorithm
        //Get the number to check for palindrome
        //Hold the number in temporary variable
        //Reverse the number
        //Compare the temporary number with reversed number
        //If both numbers are same, print "palindrome number"
        //Else print "not palindrome number"

        String original , reverse="";

        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter any string , i will tell you string is palindrome or not:");
        original = sc.nextLine();

       int length = original.length();

        for (int i = length-1; i >=0 ; i--)
        {
            reverse = reverse+original.charAt(i);
            
        }

        if (original.equals(reverse))
        {
            System.out.println("String is palindrome");
        }
        else
        {
            System.out.println("String is not palindrome");
        }



    }
}
