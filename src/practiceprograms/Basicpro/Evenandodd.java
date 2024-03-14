package practiceprograms.Basicpro;

import java.util.Scanner;

public class Evenandodd {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter any number , i will tell you number is even or odd:-");
        int number = sc.nextInt();
        if (number%2==0)
        {
            System.out.println("Given number is even:"+number);
        }

        else
        {
            System.out.println("Given number is odd:"+number);
        }
    }
}
