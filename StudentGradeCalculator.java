import java.util.Scanner;
public class StudentGradeCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double math, science, english,telugu,hindi,social, total, average;
        char grade;
        System.out.print("Enter marks for Math: ");
        math = scanner.nextDouble();
        System.out.print("Enter marks for Science: ");
        science = scanner.nextDouble();
        System.out.print("Enter marks for English: ");
        english = scanner.nextDouble();
        System.out.print("Enter marks for telugu: ");
           telugu = scanner.nextDouble();
        System.out.print("Enter marks for hindi: ");
        hindi= scanner.nextDouble();
        System.out.print("Enter marks for social: ");
        social= scanner.nextDouble();
        total = math + science + english+telugu+hindi+social;
        average = total / 6;
        if (average >= 90) {
            grade = 'A';
        } else if (average >= 80) {
            grade = 'B';
        } else if (average >= 70) {
            grade = 'C';
        } else if (average >= 60) {
            grade = 'D';
        } else {
            grade = 'F';
        }
        System.out.println("\nTotal Marks: " + total);
        System.out.println("Average Marks: " + average);
        System.out.println("Grade: " + grade);
        scanner.close();
    }
}

