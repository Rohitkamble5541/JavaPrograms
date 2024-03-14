package practiceprograms.Basicpro.ReverseString;

public class ReverseStringStringBuilder {

    public static void main(String[] args) {

       String Name = "Rohit Kamble";

       StringBuilder sb = new StringBuilder();
       sb.append(Name);
       sb.reverse();

        System.out.println(sb);

    }
}
