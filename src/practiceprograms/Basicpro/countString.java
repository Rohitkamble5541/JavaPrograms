package practiceprograms.Basicpro;

public class countString {

    public static void main(String[] args) {

        String Name = "onw two three four Rohit Abaso Kamble";

        System.out.println("Length of the string is:-"+ Name.length());
       int countwords = Name.split("\\s").length;
        System.out.println("Count of the word is:"+countwords);


    }
}
