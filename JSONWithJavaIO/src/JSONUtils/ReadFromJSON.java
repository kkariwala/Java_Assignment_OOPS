package JSONUtils;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.util.StringTokenizer;
import java.nio.file.Paths;
import java.util.Scanner;
import java.io.FileNotFoundException;
public class ReadFromJSON {
    private static byte [] rawData;
    private static String stringData;
    public static void ReadFromJSON(String pathName){
        try {
            // Create f1 object of the file to read data
            File f1 = new File(pathName);
            stringData = Files.readString(Paths.get(pathName));
            StringTokenizer st = new StringTokenizer(stringData,"{");
            while (st.hasMoreTokens()) {
                System.out.println(st.nextToken());
            }
        } catch (FileNotFoundException exception) {
            System.out.println("Unexcpected error occurred!");
            exception.printStackTrace();
        } catch (IOException e) {
            System.out.println("Unexcpected error occurred!");
            e.printStackTrace();
            throw new RuntimeException(e);
        }
    }
}