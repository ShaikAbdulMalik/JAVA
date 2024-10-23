import java.util.Random;

public class Dice {
    public static void main(String[] args){
        
        Random random = new Random();
        
        // Generates a random number between 1 and 6 (inclusive)
        int x = random.nextInt(6) + 1;

        System.out.println(x);
    }
}
