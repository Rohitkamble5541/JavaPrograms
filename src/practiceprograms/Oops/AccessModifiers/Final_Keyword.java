package practiceprograms.Oops.AccessModifiers;

public class Final_Keyword {
    // If you don't want the ability to override existing attribute values, declare attributes as final:


    final int age = 31;
    final String Name = "Rohit";
    final float pi = 3.14f;
    final double d = 452.633352d;




    public static void main(String[] args) {

        Final_Keyword fn = new Final_Keyword();
       // fn.age = 35;          // will generate an error: cannot assign a value to a final variable
        //fn.Name = "Prakash";  // will generate an error: cannot assign a value to a final variable
        //fn.pi = 3.15;        // will generate an error: cannot assign a value to a final variable
        //fn.d = 635452.566656;     // will generate an error: cannot assign a value to a final variable

        System.out.println(fn.Name);
    }

}
