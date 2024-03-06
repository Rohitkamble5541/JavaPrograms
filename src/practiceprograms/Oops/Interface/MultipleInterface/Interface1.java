package practiceprograms.Oops.Interface.MultipleInterface;

// Multiple Interfaces
// To implement multiple interfaces, separate them with a comma:

interface Interface1 {

    public void FirstInterface();
}

interface Interface2{

    public void SecondInterface();
}


class MyInterface implements Interface1 , Interface2 {

    @Override
    public void FirstInterface() {
        System.out.println("It's First Interface call");

    }

    @Override
    public void SecondInterface() {
        System.out.println("It's Second Interface call");
    }
}

 class Runnable3 {

     public static void main(String[] args) {

         MyInterface myinobj = new MyInterface();
         myinobj.FirstInterface();
         myinobj.SecondInterface();

     }
 }
