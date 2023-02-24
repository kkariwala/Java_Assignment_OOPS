import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class Person {
    private String name;
    private Address address;
    private String email;
    private String phoneNumber;
    private double salary;

    private Person manager;

    private boolean checkEmail(String email){
        String regex = "^[\\w!#$%&amp;'*+/=?`{|}~^-]+(?:\\.[\\w!#$%&amp;'*+/=?`{|}~^-]+)*@(?:[a-zA-Z0-9-]+\\.)+[a-zA-Z]{2,6}$";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(email);
        return matcher.matches();
    }

    private boolean checkNumber(String phoneNumber){
        String regex =
                "^(\\+\\d{1,2}( )?)?((\\(\\d{3}\\))|\\d{3})[- .]?\\d{3}[- .]?\\d{4}$"
                + "|^(\\+\\d{1,2}( )?)?(\\d{3}[ ]?){2}\\d{3}$"
                + "|^(\\+\\d{1,2}( )?)?(\\d{3}[ ]?)(\\d{2}[ ]?){2}\\d{2}$";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(phoneNumber);
        return matcher.matches();
    }

    public Person(String name, Address address, String email, String phoneNumber, double salary){
        if(!checkEmail(email)){
            System.out.println("Incorrect format of email");
            return;
        }
        else if(!checkNumber(phoneNumber)){
            System.out.println("Incorrect format of phone Number");
            return;
        }
        this.name = name;
        this.address = address;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.salary = salary;
        this.manager = manager;
    }

    public void getPersonDetails(){
        System.out.println(this.name + " | " + this.email + " | " + this.phoneNumber + " | " + this.salary + " | " + this.address.getAddress());
    }

    public String getPersonName(){
        return this.name;
    }
}
