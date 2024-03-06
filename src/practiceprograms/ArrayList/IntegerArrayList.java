package practiceprograms.ArrayList;

import java.util.ArrayList;
import java.util.Collections;

public class IntegerArrayList {

    public static void main(String[] args) {

        ArrayList<Integer> integernumber = new ArrayList<Integer>();
        integernumber.add(11);
        integernumber.add(12);
        integernumber.add(134563);
        integernumber.add(14);
        integernumber.add(15);
        integernumber.add(16);

        System.out.println("Total array size is :- "+integernumber.size());  // size is 6

        System.out.println("fifth number position value is :- "+integernumber.get(5));


        // sort the values
        Collections.sort(integernumber);

        // now i want to delete the value 6 position value

        // integernumber.remove(6);

        // print the array using for loop

        for (int i = 0; i <integernumber.size() ; i++) {
            System.out.println(integernumber.get(i));

        }

        // print the array using for each loop

//        for (int mynumberarray : integernumber)
//        {
//            System.out.println(mynumberarray);
//
//        }


    }
}
