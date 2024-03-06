package practiceprograms.File_Handling;

import java.io.File;

public class DeleteFolder {
    public static void main(String[] args) {
        File myObj = new File("C:\\Users\\Rohit\\Test");
        if (myObj.delete()) {
            System.out.println("Deleted the folder: " + myObj.getName());
        } else {
            System.out.println("Failed to delete the folder.");
        }
    }
}