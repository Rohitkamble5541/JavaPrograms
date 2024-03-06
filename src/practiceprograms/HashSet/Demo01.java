package practiceprograms.HashSet;

import java.util.HashSet;

public class Demo01 {

    public static void main(String[] args) {

        HashSet<String> hs = new HashSet<String>();

        hs.add("Volwo");
        hs.add("BMW");
        hs.add("ferrari");
        hs.add("maruti");
        hs.add("BMW");  // it does'nt keep duplicate values

        System.out.println(hs);

        System.out.println("size of the hash set is:-" + hs.size());


        // check if elements all ready exists
        System.out.println("if value is already exists:-"+hs.contains("BMW"));

        // for each

        for (String cars : hs)
        {
            System.out.println(cars);
        }


    }


}
