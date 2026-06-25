import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

// Creating a file 
public class CreateFile {
    public static void main(String[] args) {
        String fileName= "journey.txt";
        File myobj = new File(fileName);
        try {
           
            if (myobj.createNewFile()){
                System.out.println("File created: " + myobj.getName() );

            }else{
                System.out.println("File already already exists.Updating contents....");

                try (FileWriter Writer = new FileWriter(fileName)){
                    Writer.write("My java roadmap as a beginner ");
                    
                } 
                System.out.println("File Updated successfuilly");

            }

        } catch (IOException e) {
            System.out.println("An error occured");
            e.printStackTrace();
        }
    }
}