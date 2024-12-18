import java.util.ArrayList;
import java.util.Random;

public class Main {
    public static void main(String [] args){
        ArrayList<Bullets> chamberIn = new ArrayList<>();
        chamberIn.add(new Bullets(1,1));
        chamberIn.add(new Bullets(1,2));
        chamberIn.add(new Bullets(2,2));
        chamberIn.add(new Bullets(3,2));
        chamberIn.add(new Bullets(3,3));
        chamberIn.add(new Bullets(2,4));
        chamberIn.add(new Bullets(4,3));
        chamberIn.add(new Bullets(3,4));
        chamberIn.add(new Bullets(4,4));
        chamberIn.add(new Bullets(3,5));

        Random random= new Random();
        int chamberBullets = random.nextInt(chamberIn.size());

        //retrieve the randomly selected set of bullets for a chamber
        Bullets chamber = chamberIn.get(chamberBullets);
        System.out.println("Chamber in this round: " + chamber);
    }
}
