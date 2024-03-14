package practiceprograms.Basicpro.ReverseString;

import java.util.Scanner;

public class ReverseStringTakeInputStringbuffer {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Please Enter any String:-");
        String OriginalString = sc.nextLine();

        StringBuffer sb = new StringBuffer();
        sb.append(OriginalString);
        sb.reverse();
        System.out.println("Reverstring is :-"+sb);
    }
}
