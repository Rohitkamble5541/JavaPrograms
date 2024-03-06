package practiceprograms.Methods;

public class Multiple_parameters {

    static  void Main3(String name , int age)
    {
        System.out.println(name + " age is :- "+age );

    }

    public static void main(String[] args) {

        Main3("Rohit",30); // calling method
        Main3("Akshay" , 30);
        Main3("Abhishek" , 36);
    }

}

/*
Note that when you are working with multiple parameters,
the method call must have the same number of arguments as there are parameters,
and the arguments must be passed in the same order.

 */



