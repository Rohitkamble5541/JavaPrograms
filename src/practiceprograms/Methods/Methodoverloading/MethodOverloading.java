package practiceprograms.Methods.Methodoverloading;

public class MethodOverloading {

    static int Mymethod(int a , int b)
    {
        return a+b;

    }
    static double Mymethod(double x , double y)

    {
        return x+y;
    }

    static void Mymethod()
    {
        System.out.println("i am called out");
    }

    public static void main(String[] args) {

        int resultint = Mymethod(5,3);
        System.out.println("Integers addition result is:-" + resultint);

        double resultdouble = Mymethod(4.5,6.9);
        System.out.println("Double addition result is:-" + resultdouble);

        Mymethod();
    }
}
