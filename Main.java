import java.util.ArrayList;
import java.util.Random;

public class Main {
    public static void main(String [] args){
        Random shots = new Random();

        ArrayList<Integer> chamberIn = new ArrayList<>();
        chamberIn.add(1,1);
        chamberIn.add(1,2);
        chamberIn.add(2,2);
        chamberIn.add(3,2);
        chamberIn.add(3,3);
        chamberIn.add(2,4);
        chamberIn.add(4,3);
        chamberIn.add(3,4);
        chamberIn.add(4,4);
        chamberIn.add(3,5);

    }
}
