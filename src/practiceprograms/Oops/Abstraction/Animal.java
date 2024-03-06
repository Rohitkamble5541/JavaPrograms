package practiceprograms.Oops.Abstraction;

/*
Abstract Classes and Methods
Data abstraction is the process of hiding certain details and showing only essential information to the user.
Abstraction can be achieved with either abstract classes or interfaces (which you will learn more about in the next chapter).

The abstract keyword is a non-access modifier, used for classes and methods:

Abstract class: is a restricted class that cannot be used to create objects (to access it, it must be inherited from another class).

Abstract method: can only be used in an abstract class, and it does not have a body. The body is provided by the subclass (inherited from).
An abstract class can have both abstract and regular methods:

*/


abstract class Animal {     // Abstract class

  public abstract void animalsound();  // Abstract Method

    public void sleep()  // Regular Method
    {
        System.out.println("pig is sleeping 'zzz'");
    }

}

class pig extends Animal{

    @Override
    public void animalsound() {
        System.out.println("The pig says: wee wee");
    }
}

class Runnable {

    public static void main(String[] args) {
        pig p = new pig();  // Create a Pig object
        p.animalsound();
        p.sleep();

    }
}
