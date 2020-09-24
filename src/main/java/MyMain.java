import java.util.Scanner;

public class MyMain {

    // Rolls a single die
    // Returns a random integer between 1 and 6
    public static int rollDie() {
        int die = (int) (Math.random() * 6) + 1;
        return die;
    }

    // Rolls two dice n times
    // This method returns an int array of size 11, where each element is
    // the number of times a certain sum of two dice was rolled
    public static int[] sumOfTwoDice(int n) {
        int[] sums = new int[11];
        int[] totals = new int[n];
        for (int i = 0; i < n; i++){
            totals[i] = rollDie() + rollDie();
        }
        for (int i = 2; i < (totals.length + 2); i++){
            if ()
            for (int i2 = 0; )

        }
        return sums;
    }


    public static void main(String[] args) {
        // YOUR CODE HERE
    }
}
