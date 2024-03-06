package practiceprograms.Oops.InnerClass.Innerclas2OuterClass;

/*
Access Outer Class From Inner Class
One advantage of inner classes, is that they can access attributes and methods of the outer class:

 */

class OuterClass {

    int x = 5;

    class Innerclass5 {
        public int myInnerMethod() {
            return x;
        }
    }
}

    public class Main5 {
        public static void main(String[] args) {

            OuterClass outobje6 = new OuterClass();
            OuterClass.Innerclass5 innerobj6 = outobje6.new Innerclass5();
            System.out.println(innerobj6.myInnerMethod());

        }
    }

