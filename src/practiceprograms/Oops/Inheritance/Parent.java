package practiceprograms.Oops.Inheritance;

// single inheritance

public class Parent {

    protected String name1 ;
    protected int age ;

    protected String work;

}
class child extends Parent{

    public static void main(String[] args) {

        child ch = new child();
        ch.age = 45;
        ch.name1 = "Abaso";
        ch.work = "governament sevant";

        System.out.println("Father name is :-" + ch.name1 + "\nFather age is:-" + ch.age + "\nWork is:-"+ch.work);
    }


}
