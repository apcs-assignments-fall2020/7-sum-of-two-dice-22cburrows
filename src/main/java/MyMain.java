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
        for (int i = 0; i < totals.length; i++){
            int assign = totals[i]-2;
            sums[assign] = sums[assign] + 1;

        }
        return sums;
    }


    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("How many pair of dice would you like to roll?");
        int dice = scan.nextInt();

        int[] array = sumwoDice(dice);

        for (int i = 0; i < 11; i++){
            double percent = array[i]/dice;
            System.out.println("% of rolls where sum == " + (i + 3) + ": " +  percent);
    }
}

