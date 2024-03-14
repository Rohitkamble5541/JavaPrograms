package practiceprograms.Basicpro.ReverseString;

import java.util.Scanner;

public class ReverStringtakeinputcharat {
    public static void main(String[] args) {

        String newstring ="";
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter any string i will tell you reverse string it:-");
        String OriginalString = sc.nextLine();

        for (int i = 0; i < OriginalString.length() ; i++) {

            newstring = OriginalString.charAt(i)+newstring;


        }
        System.out.println("Reverse string is:-"+newstring);

        sc.close();
    }
}
