package practiceprograms.Basicpro.ReverseString;

public class ReverseString_Stringbuffer {

    public static void main(String[] args) {

        String mystring = "Rohit Kamble";
        System.out.println("Orifinal String :-"+mystring);

        StringBuffer sb = new StringBuffer();
        sb.append(mystring);
        sb.reverse();
        System.out.println("Reverse String:-"+sb);

        
    }
}
