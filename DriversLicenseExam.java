import Java.util.Scanner;
public class DriversLicenseExam {
    public static final int passing = 15;
    public static void main(String[] args) {
        java.util.Scanner input = new Scanner(System.int);
    
        char[] answers = {
            'A', 'D', 'B', 'B', 'C', 'B', 'A', 'B', 'C', 'D', 
            'A', 'C', 'D', 'B', 'D', 'C', 'C', 'A', 'D', 'B'  
        };
    
    char[] Sanswers = new char[20];

    for (int i = 0; i< Sanswers.length; i++){
        System.out.println("Enter answers for question" + (i+1) + ": ");
        String value = input.nextLine().toUpperCase();
        
    }

}
}
