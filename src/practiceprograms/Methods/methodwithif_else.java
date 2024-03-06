package practiceprograms.Methods;

public class methodwithif_else {

      static void Mymethod(int age)
      {
          if (age<18)
          {
              System.out.println("you have not access granted");
          }

          else
          {
              System.out.println("you have grant access");
          }

      }

    public static void main(String[] args) {

          Mymethod(20);

    }

}


