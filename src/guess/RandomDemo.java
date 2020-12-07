package guess;

import java.sql.SQLOutput;
import java.util.Random;

public class RandomDemo {
    public static void main(String[] args) {
        Random rand = new Random();


        int r = rand.nextInt(100)+1;
        System.out.println(r);
    }
}
