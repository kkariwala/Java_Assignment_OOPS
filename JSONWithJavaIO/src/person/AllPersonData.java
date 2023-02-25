package person;

import java.util.ArrayList;

public class AllPersonData {
    public static ArrayList<Person> allPersons = new ArrayList<>();

    public static void addToAllPersons(Person p){
        allPersons.add(p);
    }

    public static void printAllPersons(){
        for(Person p : allPersons){
            p.getPersonDetails();
        }
    }
}
