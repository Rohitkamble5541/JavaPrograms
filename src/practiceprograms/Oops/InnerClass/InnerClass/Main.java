package practiceprograms.Oops.InnerClass.InnerClass;

class OuterClass {

    int x = 5;


    class InnerClass{

        int z=10;

    }
}

public class Main{
    public static void main(String[] args) {

        OuterClass outobj = new OuterClass();
        OuterClass.InnerClass innerobj = outobj.new InnerClass();
        System.out.println(outobj.x + innerobj.z);

    }

}
