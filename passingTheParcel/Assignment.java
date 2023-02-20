import java.util.*;
public class Assignment {
    public static int getNonNullIndex(String [] contestant, int index){
        /*
        *
        * */
        while(contestant[index] == null){
            index++;
            index = index % contestant.length;
        }
        return index;
    }

    public static int incrementWithMod(int index, int mod){
        return (index+1)%mod;
    }
    public static int getWinnerIndex(String[] contestant, int[] SongStopsInSec){
        int itr = contestant.length,index = 0,songArrayIndex = 0;
        while (itr > 1){
            for(int i = 0 ; i < SongStopsInSec[songArrayIndex];i++){
                index = incrementWithMod(index, contestant.length);
                index = getNonNullIndex(contestant,index);
            }
            contestant[index] = null;
            index = getNonNullIndex(contestant,index);
            itr--;
            songArrayIndex = incrementWithMod(songArrayIndex, SongStopsInSec.length);
        }
        return index;
    }

    public static void main(String[] args) {
        int numberOfContestants,numberOfSongStops;

        //Creating a new scanner to take inputs
        Scanner sc= new Scanner(System.in);

        //Reading the number of contestants from the user
        System.out.println("Enter the number of Contestants");
        numberOfContestants = sc.nextInt();

        //Creating a String array for the name of each contestants
        String [] contestantNames = new String[numberOfContestants];

        //Taking user input for names of contestants.
        System.out.println("Enter the names of students");
        for(int i = 0 ; i < contestantNames.length;i++){
            contestantNames[i] = sc.next();
        }

        //Reading the number of song stops from the user
        System.out.println("Enter number of elements in the Song Stops Array");
        numberOfSongStops = sc.nextInt();

        //Creating an integer array for the number of Song Stops
        int [] SongStopsInSeconds = new int[numberOfSongStops];

        //Taking user input for Song Stops
        for(int i = 0 ; i < numberOfSongStops; i++){
            SongStopsInSeconds[i] = sc.nextInt();
        }

        //Computing the winner
        System.out.println("The winner is at Index = " + getWinnerIndex(contestantNames,SongStopsInSeconds));
    }
}
