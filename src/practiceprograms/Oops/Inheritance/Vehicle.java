package practiceprograms.Oops.Inheritance;

public class Vehicle {

    protected String brand = "Ford";        // Vehicle attribute

    public void honk() {                    // Vehicle method
        System.out.println("Tuut, tuut!");
    }
}


    class Cars extends Vehicle{

        private String modelname = "Mustang";

        public static void main(String[] args)
        {
            // Create a myCar object

            Cars mycars = new Cars();

            mycars.honk(); // Call the honk() method (from the Vehicle class) on the myCars object

            // Display the value of the brand attribute (from the Vehicle class) and the value of the modelName from the Cars class

            System.out.println("\nBrand is:-" + mycars.brand + "\nmodel name is:-" + mycars.modelname);


        }

    }

