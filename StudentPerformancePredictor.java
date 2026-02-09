import java.util.Scanner;

public class StudentPerformancePredictor {

public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.println("Enter student name: ");
    String name = sc.nextLine();

    System.out.println("Enter marks in Math (0-100): ");
    int math = sc.nextInt();

    System.out.println("Enter marks in Science (0-100): ");
    int science = sc.nextInt();

    System.out.println("Enter marks in English (0-100): ");
    int english = sc.nextInt();

    double average = (math + science + english) / 3.0;

    System.out.println("\n--- Student Performance Report ---");
    System.out.println("Name: " + name);
    System.out.println("Average Marks: " + average);
    System.out.println("Prediction: " + predictPerformance(average));
}

public static String predictPerformance(double average) {
    if (average >= 90) {
        return "Excellent - Likely to be a Top Performer";
    } else if (average >= 75) {
        return "Good - Has Potential to Excel";
    } else if (average >= 50) {
        return "Average - Needs Improvement";
    } else {
        return "Poor - High Risk of Failure";
    }
}
}