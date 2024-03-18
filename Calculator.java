import java.util.Scanner;

public class GradeCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to the Student Grade Calculator!");
        System.out.print("Enter the number of subjects: ");
        int numSubjects = scanner.nextInt();

        double totalMarks = 0;
        double totalCredits = 0;

        for (int i = 1; i <= numSubjects; i++) {
            System.out.println("\nEnter details for Subject " + i + ":");
            System.out.print("Enter marks: ");
            double marks = scanner.nextDouble();
            System.out.print("Enter credits: ");
            double credits = scanner.nextDouble();

            totalMarks += marks;
            totalCredits += credits;
        }

        double gpa = calculateGPA(totalMarks, totalCredits);
        System.out.println("\nTotal GPA: " + gpa);

        scanner.close();
    }

    public static double calculateGPA(double totalMarks, double totalCredits) {
        return totalMarks / totalCredits;
    }
}
