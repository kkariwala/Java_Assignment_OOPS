import java.io.File;
import java.util.Scanner;
import java.io.FileNotFoundException;
public class ReadFile {
    public ReadFile(String pathName){
        try {
            // Create f1 object of the file to read data
            File f1 = new File(pathName);
            Scanner dataReader = new Scanner(f1);
            while (dataReader.hasNextLine()) {
                String fileData = dataReader.nextLine();
                System.out.println(fileData);
            }
            dataReader.close();
        } catch (FileNotFoundException exception) {
            System.out.println("Unexcpected error occurred!");
            exception.printStackTrace();
        }
    }
}
