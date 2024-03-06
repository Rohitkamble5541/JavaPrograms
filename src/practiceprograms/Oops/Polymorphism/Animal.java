package practiceprograms.Oops.Polymorphism;

// Polymorphism

public class Animal {

    public void animalSound(){
        System.out.println("The animal makes a sound");
    }
}

class Pigs extends Animal
{
    @Override
    public void animalSound() {
        System.out.println("The pig says : wee wee");
    }
}

class Cats extends Animal
{
    @Override
    public void animalSound() {
        System.out.println("The Cats says : meows meows");

    }
}

class Dogs extends Animal
{
    @Override
    public void animalSound() {
        System.out.println("The Dogs says : woof, woof");
    }
}

class Birds extends Animal
{
    @Override
    public void animalSound() {
        System.out.println("The Birds says : squawk");
    }
}

class Runnable
{
    public static void main(String[] args) {

        Animal a = new Animal();  // Create a Animal object
        a.animalSound();

        Pigs p = new Pigs();      // Create a Pig object
        p.animalSound();

        Cats c = new Cats();  // Create a Dog object
        c.animalSound();

        Dogs d = new Dogs();
        d.animalSound();

        Birds b = new Birds();
        b.animalSound();


    }
}




