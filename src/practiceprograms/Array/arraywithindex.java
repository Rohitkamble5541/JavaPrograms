package practiceprograms.Array;

public class arraywithindex {

    public static void main(String[] args) {

        // declare the array and Access the Elements of an Array
        // starts with 0 and so on
        String car[] = {"BMW" ,"Volvo", "Marcediz" ,"Mahindra" };

        System.out.println(car[3]);

        // change the value
        car[3] = "ferrari";
        System.out.println(car[3]);

        // findout length of array
        // array length always start with the 1 to so on

        System.out.println(car.length);
    }
}
