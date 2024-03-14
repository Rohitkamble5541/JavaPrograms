package practiceprograms.Basicpro.ReverseString;

public class ReverseStringCharAt2 {
    public static void main(String[] args) {

        String OriginalString = "Rohit Kamble";
        String NewString="";

        for (int i = 0; i <OriginalString.length() ; i++) {

            NewString = OriginalString.charAt(i)+NewString;

        }
        System.out.println("Reverse STring is:-"+NewString);
    }
}

