import java.io.File;
public class DeleteFile {
    public DeleteFile(String filePathName){
        try {
            // Creating an object of a file
            File f0 = new File(filePathName);
            if (f0.delete()) {
                System.out.println("File deleted successfully");
            }
            else {
                System.out.println("Failed to delete the file");
            }
        }  catch (SecurityException exception) {
            System.out.println("An unexpected error is occurred.");
            exception.printStackTrace();
        }
    }
}
