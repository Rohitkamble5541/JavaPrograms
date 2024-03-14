package practiceprograms.Basicpro.CodingInterviewquestions;

import java.util.Scanner;

public class Printtable {
    public static void main(String[] args) {

        // 2 X i = Result


        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter any number:-");
        int number = sc.nextInt();
        for(int i=1; i <= 10; i++)
        {
            System.out.println(number+"X"+i+"="+number*i);

        }




    }
}
