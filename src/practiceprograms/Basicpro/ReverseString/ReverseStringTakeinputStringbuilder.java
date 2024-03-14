package practiceprograms.Basicpro.ReverseString;

import java.util.Scanner;

public class ReverseStringTakeinputStringbuilder {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter any word i will reverse it");
        String Originalstring = sc.nextLine();

        StringBuilder sb = new StringBuilder();
        sb.append(Originalstring);
        sb.reverse();
        System.out.println("Reverse String is:-"+sb);
    }
}
