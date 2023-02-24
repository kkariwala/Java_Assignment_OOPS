public class Main {
    public static void main(String[] args) {
        String pathName = "/Users/kkariwala/Desktop/Aspire InfoLabs/OOPS Concepts/Java_Assignment_OOPS/FileOperations/src/normalText.txt";
        CreateFile c1 = new CreateFile(pathName);
        FileInfo f1 = new FileInfo(pathName);
        ReadFile r1 = new ReadFile(pathName);
        DeleteFile d1 = new DeleteFile(pathName);
    }
}