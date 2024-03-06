package practiceprograms.Oops.Interface.Regular_Interface;

interface Animal {

    public void AnimalSound();  // interface method (does not have a body)

    public void Sleep();  // interface method (does not have a body)
}

class pig implements Animal{

    @Override
    public void AnimalSound() {
        // The body of animalSound() is provided here

        System.out.println("The pig sound is weee weee" );

    }

    @Override
    public void Sleep() {
        // The body of Sleep() is provided here
        System.out.println("The pig is sleep Zzzzz");

    }
}

public class Runnable {

    public static void main(String[] args) {

        pig p1 = new pig(); // Create a Pig object
        p1.AnimalSound();
        p1.Sleep();

    }
}