package practiceprograms.Loops;

public class Dowhilewithbreak {

    public static void main(String[] args) {

        int i =0;
        do {
            System.out.println(i);
            i++;
            if (i==4)
            {
                break;
            }

        }
        while(i<=10);

    }
}
