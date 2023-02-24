public class Main {
    public static void main(String[] args) {

        Address a1 = new Address("201, Peepal Colive","Bengaluru","Karnataka","India","500063");
        Person p1 = new Person("Kunal",a1,"kkariwala@equinix.com","+91 9167574752",24000.0);

        Address a2 = new Address("blahshshs","Bengaluru","Karnataka","India","500063");
        Person p2 = new Person("ManagerOfKunal",a2,"kkariwala@equinix.com","+91 8888888888",24000.0);

        Address a3 = new Address("blahshshs","Bengaluru","Karnataka","India","500063");
        Person p3 = new Person("EmployeeOfKunal",a3,"kkariwala@equinix.com","+91 8888888888",24000.0);

        p1.getPersonDetails();
        p2.getPersonDetails();
        p3.getPersonDetails();
        Hierarchy.addPerson(p1,p2);
        Hierarchy.addPerson(p3,p1);
        Hierarchy.printHierarch();
    }
}