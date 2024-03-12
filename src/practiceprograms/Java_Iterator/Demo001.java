package practiceprograms.Java_Iterator;

import java.util.ArrayList;
import java.util.Iterator;

public class Demo001 {

    public static void main(String[] args) {

        // Make a collection
        ArrayList<String> cars = new ArrayList<String>();
        cars.add("Volvo");
        cars.add("BMW");
        cars.add("Ford");
        cars.add("Mazda");

        // Get the iterator
        Iterator<String> it = cars.iterator();

        // Print the first item
        System.out.println(it.next());


        while(it.hasNext()) {
            System.out.println(it.next());
        }

        // Removing Items from a Collection

//        while(it.hasNext()) {
//            String i = it.next();
//            if(i < 10) {
//                it.remove();
//            }
    }
}
