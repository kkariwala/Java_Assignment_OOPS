package studentpackage;
import java.util.*;
public class Student {
    private ArrayList<Integer> marks;
    private int totalMarks;

    public Student(){
        this.marks = new ArrayList<>();
        this.totalMarks = 0;
    }

    public void add(int mark){
        marks.add(mark);
        totalMarks+=mark;
    }

    public int getTotalMarks(){
        return totalMarks;
    }
}
