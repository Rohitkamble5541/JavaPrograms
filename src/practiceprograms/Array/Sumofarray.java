package practiceprograms.Array;

public class Sumofarray {

    public static void main(String[] args) {

        int array[] ={1, 5, 10, 25};
        int sum=0;

        for (int i = 0; i <array.length ; i++) {

            sum = array[i]+sum;

        }

        System.out.println("The sum is:"+sum);
    }
}
