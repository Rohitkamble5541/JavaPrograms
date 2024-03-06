package practiceprograms.Loops;

public class Foreachloop {
    public static void main(String[] args) {

        /*

        There is also a "for-each" loop, which is used exclusively to loop through elements in an array:


        for (type variableName : arrayName) {
         // code block to be executed
         }
         */

        String [] cars = {"volvo","BMW","Ford","Mazda"};

        for(String i : cars)
        {
            System.out.println(i);
        }
    }
}
