package practiceprograms.Oops.InnerClass.PrivateInnerClass;

/*
Private Inner Class
Unlike a "regular" class, an inner class can be private or protected.
If you don't want outside objects to access the inner class, declare the class as private:
 */

class PrivateInnerClass {

    int z = 4;
    //private class InnerClass2
    {
        int y =10;
    }
}

public class Main2{
    public static void main(String[] args) {

        PrivateInnerClass probject = new PrivateInnerClass();
      //  PrivateInnerClass.InnerClass2 innerobj = probject.new InnerClass2();
       // System.out.println(probject.z+innerobj.y);

    }

}
