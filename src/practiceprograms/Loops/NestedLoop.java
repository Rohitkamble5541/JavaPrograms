package practiceprograms.Loops;

public class NestedLoop {

    public static void main(String[] args) {

        for (int i = 1; i <=2 ; i++) {
            System.out.println("**********outer loop**************** :- " + i);   // Executes 2 times

            for (int j = 1; j <=3 ; j++) {
                System.out.println("****Inner loop**** :-" + j);  // Executes 6 times (2 * 3)


            }

        }
    }
}
