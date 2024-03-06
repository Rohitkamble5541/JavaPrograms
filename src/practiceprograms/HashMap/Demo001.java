package practiceprograms.HashMap;

import java.util.HashMap;

public class Demo001 {

    public static void main(String[] args) {


        HashMap<String,String> hp = new HashMap<String,String>();
        hp.put("USA","Washington DC");
        hp.put("Norway","Oslo");
        hp.put("England","London ");
        hp.put("Germany","Berlin ");
        hp.put("India","Mumbai");
        hp.put("India","Mumbai");  // It doesn't allow duplicate values


        System.out.println(hp);

        // access all elements using for loop

        // get individual element
        System.out.println(hp.get("England"));

        // access all elements using for each loop

        for (String capitals : hp.keySet())
        {
           System.out.println(capitals);
        }


    }


}
