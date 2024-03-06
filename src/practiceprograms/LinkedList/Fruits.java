package practiceprograms.LinkedList;


import java.util.LinkedList;

public class Fruits {

    public static void main(String[] args) {

        LinkedList<String> objfruit = new LinkedList<String>();

        objfruit.add("Apple");
        objfruit.add("Mango");
        objfruit.add("Banana");
        objfruit.add("Strawaberry");
        objfruit.add("Orange");
        objfruit.add("pinapble");
        objfruit.add("Apple");

        System.out.println("Linked list is following");
        System.out.println(objfruit);

        // print the size of the linked list
        System.out.println("Size of the linked list is :- "+ objfruit.size());

        // print all elements in the list
        System.out.println("Print array elements are as follows :-");

        // change the value
        objfruit.set(3,"Blackberry");

        // Add first element in the begining
        objfruit.addFirst("Grapes");

        // Add last element in the list
        objfruit.addLast("Tomato");

        // get first element
        System.out.println("This is the first element in the list :-" + objfruit.getFirst());

        // get last element
        System.out.println("This is the first element in the list :- "+ objfruit.getLast());


        // Using for loop method
        for (int i = 0; i < objfruit.size() ; i++) {
            System.out.println(objfruit.get(i));

        }


        // using for each method
//        for (String fruit : objfruit)
//        {
//            System.out.println(fruit);
//        }

    }
}
