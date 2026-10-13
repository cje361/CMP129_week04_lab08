import java.util.Random;
import java.util.Scanner;

public class Lottery {

    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        Random random = new Random();

        int[] lottery = new int[5];
        int[] user = new int[5];

        for (int i = 0; i < lottery.length; i++) {
            lottery[i] = random.nextInt(10);
        }

        for (int i = 0; i < user.length; i++) {
            System.out.print("Enter digit " + (i + 1) + " (0-9): ");
            user[i] = keyboard.nextInt();

            while (user[i] < 0 || user[i] > 9) {
                System.out.print("Invalid. Enter a digit from 0 to 9: ");
                user[i] = keyboard.nextInt();
            }
        }

        int matches = 0;
        for (int i = 0; i < lottery.length; i++) {
            if (lottery[i] == user[i]) {
                matches++;
            }
        }

        System.out.println();
        System.out.print("Lottery numbers: ");
        for (int i = 0; i < lottery.length; i++) {
            System.out.print(lottery[i] + " ");
        }
        System.out.println();

        System.out.print("Your numbers:    ");
        for (int i = 0; i < user.length; i++) {
            System.out.print(user[i] + " ");
        }
        System.out.println();

        System.out.println("Matching digits: " + matches);

        if (matches == lottery.length) {
            System.out.println("Congratulations! You are a grand prize winner!");
        }

    }
}
