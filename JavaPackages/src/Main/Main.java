package Main;
import history.History;
import operations.*;
import studentpackage.Student;

public class Main {
    public static void main(String[] args) {
        Add a = new Add();
        Subtraction s = new Subtraction();
        Multiplication m = new Multiplication();
        Division d = new Division();
        History h1 = new History(5);
        double d1 = 123.4;
        double d2 = 1.234e2;
        float f1  = 123.4f;
        float f2 = 124.6f;
        long l1 = 3;
        long l2 = 4;
        int i1 = 5;
        int i2 = 6;
        System.out.println(a.addition(i1,i2));
        System.out.println(a.addition(d1,d2));
        System.out.println(a.addition(f1,f2));
        System.out.println(a.addition(f1,d1));
        h1.printLastTransaction();
        System.out.println(a.addition(l1,l2));
        System.out.println(a.addition(f1,d1));
        h1.printLastTransaction();
        System.out.println(s.subtract(i1,i2));
        System.out.println(s.subtract(d1,d2));
        h1.printLastTransaction();
        System.out.println(m.multiply(i1,i2));
        System.out.println(m.multiply(d1,d2));
        h1.printLastTransaction();
        System.out.println(d.divide(i1,i2));
        System.out.println(d.divide(d1,d2));
        h1.printLastTransaction();
        Student s1 = new Student();
        studentpackage.Add a1 = new studentpackage.Add();
        a1.add(s1,4);
        System.out.println("Total marks are = " + s1.getTotalMarks());
        a1.add(s1,9);
        System.out.println("Total marks are = " + s1.getTotalMarks());
    }
}
