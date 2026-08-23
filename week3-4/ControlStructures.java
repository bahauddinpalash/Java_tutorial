import java.util.Scanner;

public class ControlStructures {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("==========================================");
        System.out.println("   BIT1123 OOP - WEEK 3-4 LAB TUTORIAL    ");
        System.out.println("==========================================");

        System.out.print("\nEnter your Student Score (0 - 100): ");
        int score = input.nextInt();

        System.out.print("Your Grade Status: ");
        if (score >= 80 && score <= 100) {
            System.out.println("Grade A (Excellent)");
        } else if (score >= 65) {
            System.out.println("Grade B (Good)");
        } else if (score >= 50) {
            System.out.println("Grade C (Pass)");
        } else if (score >= 0) {
            System.out.println("Grade F (Fail)");
        } else {
            System.out.println("Invalid Score Entered!");
        }

        System.out.println("\n--- FOR LOOP: Printing Tutorial Numbers ---");
        for (int i = 1; i <= 5; i++) {
            System.out.println("Completed Tutorial Task #" + i);
        }

        input.close();
    }
}