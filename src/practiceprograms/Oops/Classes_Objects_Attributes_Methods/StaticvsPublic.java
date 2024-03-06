package practiceprograms.Oops.Classes_Objects_Attributes_Methods;

public class StaticvsPublic {

    static void StaticMethod(){
        System.out.println("Static methods can be called without creating objects");

    }

    public void PublicMethod(){
        System.out.println("Public methods must be called by creating objects");
    }


    public static void main(String[] args) {

        StaticMethod();  // without creating object static method can be called

        StaticvsPublic vs = new StaticvsPublic();  // creating object of Public method calls then called public method
        vs.PublicMethod(); // Call the public method on the object



    }
}
