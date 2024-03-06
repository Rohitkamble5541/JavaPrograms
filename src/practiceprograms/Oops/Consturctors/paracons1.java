package practiceprograms.Oops.Consturctors;

public class paracons1 {

    int modelnumber ;
    String modelname;

    public paracons1(int refmodelnumber , String refmodelname){
        modelname = refmodelname;
        modelnumber = refmodelnumber;

    }

    public static void main(String[] args) {
        paracons1 pr1 = new paracons1(1969 , "Mustang");
        System.out.println(pr1.modelnumber + " " + pr1.modelname);
    }

    // Outputs 1969 Mustang
}
