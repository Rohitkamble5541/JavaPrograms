package practiceprograms.Oops.Classes_Objects_Attributes_Methods;

public class MultipleObjects {

    // If you create multiple objects of one class,
    // you can change the attribute values in one object, without affecting the attribute values in the other


    int x = 90;


    public static void main(String[] args) {

        MultipleObjects myobject1 = new MultipleObjects();
        MultipleObjects myobject2 = new MultipleObjects();

        System.out.println("myObject1 value is :- "+ myobject1.x);
        myobject2.x = 95;
        System.out.println("myObject2 value is :- "+myobject2.x);


    }


}
