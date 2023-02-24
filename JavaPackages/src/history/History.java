package history;

import java.util.*;

public class History {
    private static Deque <String> d1;
    private static int MaxDequeSize;
    private static int numCurrentElements;

    public History(int maxSize){
        d1 = new ArrayDeque<>();
        MaxDequeSize = maxSize;
        numCurrentElements = 0;
    }

    public static void addTransaction(String transaction){
        if(numCurrentElements > 4){
            d1.removeLast();
            numCurrentElements--;
        }
        d1.addFirst(transaction);
        numCurrentElements++;
    }

    public static void printLastTransaction(){
        System.out.println("===================================================================");
        System.out.println("The previous transactions (max " + MaxDequeSize + " last are)");
        for (Iterator itr = d1.descendingIterator();
             itr.hasNext();) {
            System.out.println(itr.next());
        }
        System.out.println("===================================================================");
    }
}
