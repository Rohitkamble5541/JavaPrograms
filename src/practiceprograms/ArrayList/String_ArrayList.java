package practiceprograms.ArrayList;

import java.util.ArrayList;

public class String_ArrayList {

    public static void main(String[] args) {

/*        ArrayList allows duplicates and it is implemented as a resizable array.
          ArrayList elements will be stored internally using indexing notation.
          This is one of the most widely used concrete class.
          It is fast to access the elements, but slow to insert and delete the elements.
*/


        ArrayList<String> object = new ArrayList<String>(); // creating object of array list

        // now add values into the array

        object.add("BMW");
        object.add("Volvo");
        object.add("ferrari");
        object.add("Maruti");
        object.add("BMW");

        System.out.println(object);

       // object.size();

        // get method is using for the accessing the items
         object.get(0);
         object.get(3);

         // change the value or set the value
         object.set(3 , "new maruti");

         // remove the value
        object.remove(1);

        // print out the values using for each loop

        System.out.println("Cars information");

        for(String i : object)
        {
            System.out.println(i);
        }

//        for (int i = 0; i <object.size() ; i++) {
//            System.out.println(object.get(i));
//
//        }

    }
}
