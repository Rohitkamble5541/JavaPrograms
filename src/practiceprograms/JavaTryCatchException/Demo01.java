package practiceprograms.JavaTryCatchException;

public class Demo01 {

//    try {
//        //  Block of code to try
//    }
//catch(Exception e) {
//        //  Block of code to handle errors
//    }

    public static void main(String[] args) {

try {
    int array [] = {1,2,3,4,5};
    System.out.println(array[8]);

   }
catch (Exception e) {

    System.out.println("something went to wrong...");
}

    }
}
