package practiceprograms.Oops.Classes_Objects_Attributes_Methods;

public class Final_dontmodifyvalue {


    // If you don't want the ability to override existing values, declare the attribute as final:

    final int value1 = 45;

    public static void main(String[] args) {

        Final_dontmodifyvalue myObject = new Final_dontmodifyvalue();
       // myObject.value1 = 90; // getting error cannot assign a value to final variable value1
        System.out.println(myObject.value1);
    }

}


