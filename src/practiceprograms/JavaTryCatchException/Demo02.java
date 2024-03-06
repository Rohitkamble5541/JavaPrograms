package practiceprograms.JavaTryCatchException;

public class Demo02 {

    public static void main(String[] args) {



        try {
            int array [] = {1,2,3,4,5,6,7,8,9};
            System.out.println(array[12]);
        }
        catch (Exception e)
        {
            System.out.println("Something went wrong.");
        }
        finally {
            System.out.println("The 'try catch' is finished.");
        }

    }
}
