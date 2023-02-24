import java.util.LinkedList;
public class Hierarchy {
    private static LinkedList<Person> ml = new LinkedList<>();
    public static void addPerson(Person employee, Person manager){
        if(ml.isEmpty()){
            ml.add(manager);
            ml.add(employee);
        }
        else if(ml.contains(manager)){
            int index = ml.indexOf(manager);
            ml.add(index+1, employee);
        }
    }

    public static void printHierarch(){
        System.out.print("The Hierarchy until now is as follows : ");

        for (Person listElement : ml) {
            System.out.print(listElement.getPersonName() + " -> ");
        }
        System.out.println("");
    }
}
