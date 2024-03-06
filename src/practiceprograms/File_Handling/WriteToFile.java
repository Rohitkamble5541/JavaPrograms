package practiceprograms.File_Handling;

import java.io.File;
import java.io.FileWriter;

public class WriteToFile {

    public static void main(String[] args) {

        try {

            FileWriter mywriter = new FileWriter("filename.txt");
            mywriter.write("Files in Java might be tricky, but it is fun enough!");
            mywriter.close();
            System.out.println("Succefully wrote to the file");
        }catch (Exception e)
        {
            System.out.println("An error occured...");
            e.printStackTrace();

        }
    }
}
