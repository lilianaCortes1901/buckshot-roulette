//Creating a custom class with two field (live and blanks) to store objects of this
//class in an arraylist

public class Bullets {
    int live;
    int blanks;

    //Constructor
    public Bullets(int live, int blanks){
        this.live = live;
        this.blanks = blanks;
    }

    public String toString(){
        return "Bullets{live=" + live + ", blanks=" + blanks + "}";
    }
}
