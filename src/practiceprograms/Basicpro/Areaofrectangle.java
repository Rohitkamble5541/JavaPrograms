package practiceprograms.Basicpro;

import java.util.Scanner;

public class Areaofrectangle {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter length:-");
        int length =sc.nextInt();
        System.out.println("Please enter width:-");
        int width =sc.nextInt();
        int Area = length*width;
        System.out.println("Area of rectangle is:-"+Area);

    }
}
