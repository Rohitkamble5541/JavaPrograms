package practiceprograms.Loops;

public class Breakwithwhile {

    public static void main(String[] args) {

        int i =0;
        while (i<10)
        {
            if (i==4)
            {
                break;
            }
            System.out.println(i);
            i++;

        }
    }
}
