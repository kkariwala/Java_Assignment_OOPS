import org.json.simple.parser.JSONParser;
import org.json.simple.JSONArray;
import java.io.FileReader;
import org.json.simple.JSONObject;
import java.io.FileNotFoundException;
import java.io.IOException;
import org.json.simple.parser.ParseException;

public class Main {
    public static void main(String[] args) {
        JSONParser jsonParser = new JSONParser();

        try (FileReader reader = new FileReader("/Users/kkariwala/Desktop/Aspire InfoLabs/OOPS Concepts/Java_Assignment_OOPS/RecursionJSON/src/temp.json"))
        {
            //Read JSON file
            Object obj = jsonParser.parse(reader);
            JSONArray employeeList = new JSONArray();
            employeeList.add(obj);
            System.out.println(employeeList);
            //Iterate over employee array
            employeeList.forEach(emplyee -> System.out.println(emplyee));

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ParseException e) {
            e.printStackTrace();
        }
    }
}