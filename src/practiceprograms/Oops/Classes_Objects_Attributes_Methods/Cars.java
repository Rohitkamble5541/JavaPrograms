package practiceprograms.Oops.Classes_Objects_Attributes_Methods;

public class Cars {

    // Create a Car object named myCar. Call the fullThrottle() and speed() methods on the myCar object

     public void fullThrottle(){
        System.out.println("The car is going as fast as it can!");

    }

    public void speed(int maxspeed){
        System.out.println("Max speed is: "+maxspeed);
    }

    public static void main(String[] args) {

        Cars mycar = new Cars();
        mycar.fullThrottle();
        mycar.speed(200);
    }

}

//Output
// The car is going as fast as it can!
// Max speed is: 200
/*
Remember that..
The dot (.) is used to access the object's attributes and methods.

To call a method in Java, write the method name followed by a set of parentheses (), followed by a semicolon (;).

A class must have a matching filename (Main and Main.java).
 */
