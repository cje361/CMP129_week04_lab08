import java.util.Scanner;

public class DriversLicenseExam {
        public static final int PASSING_SCORE = 15;

    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        char[] correctAnswers = {
            'A', 'D', 'B', 'B', 'C', 'B', 'A', 'B', 'C', 'D',
            'A', 'C', 'D', 'B', 'D', 'C', 'C', 'A', 'D', 'B'
        };

        char[] studentAnswers = new char[20];

        for (int i = 0; i < studentAnswers.length; i++) {
            System.out.print("Enter the answer for question " + (i + 1) + ": ");
            String input = keyboard.nextLine().toUpperCase();

            while (!input.equals("A") && !input.equals("B")
                    && !input.equals("C") && !input.equals("D")) {
                System.out.print("Invalid. Enter A, B, C, or D: ");
                input = keyboard.nextLine().toUpperCase();
            }

            studentAnswers[i] = input.charAt(0);
        }

        int correct = totalCorrect(correctAnswers, studentAnswers);
        int incorrect = correctAnswers.length - correct;

        System.out.println();
        if (correct >= PASSING_SCORE) {
            System.out.println("The student passed the exam.");
        } else {
            System.out.println("The student failed the exam.");
        }

        System.out.println("Correct answers: " + correct);
        System.out.println("Incorrect answers: " + incorrect);

        System.out.print("Questions missed: ");
        for (int i = 0; i < correctAnswers.length; i++) {
            if (studentAnswers[i] != correctAnswers[i]) {
                System.out.print((i + 1) + " ");  
            }
        }
        System.out.println();

    }

    public static int totalCorrect(char[] key, char[] answers) {
        int count = 0;
        for (int i = 0; i < key.length; i++) {
            if (answers[i] == key[i]) {
                count++;
            }
        }
        return count;
    }
}