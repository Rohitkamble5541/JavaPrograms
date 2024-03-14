package practiceprograms.Basicpro.ReverseString;

public class ReverseStringCharAt {

    public static void main(String[] args) {

        String mystring = "Rohit Kamble";
        String newstring= "";


        for (int i = 0; i < mystring.length() ; i++)
        {

            newstring = mystring.charAt(i)+newstring;

        }
        System.out.println("Reverse string is:-"+newstring);
    }
}
