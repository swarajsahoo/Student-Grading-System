
import java.util.*;

public class GradingSystem {
    private List<Student> students;

    // Constructor
    public GradingSystem() {
        students = new ArrayList<>();
    }

    // Add student to the list
    public void addStudent(Student student) {
        students.add(student);
    }

    // Calculate average marks for all students
    public double calculateAverageMarks() {
        double totalMarks = 0;
        for (Student student : students) {
            totalMarks += student.getMarks();
        }
        return totalMarks / students.size();
    }

    // Sort students based on marks
    public void sortStudentsByMarks() {
        students.sort((s1, s2) -> Integer.compare(s2.getMarks(), s1.getMarks()));  // Descending order
    }

    // Rank students based on marks
    public void displayRanking() {
        sortStudentsByMarks();
        System.out.println("\nStudent Ranking:");
        int rank = 1;
        for (Student student : students) {
            System.out.println("Rank " + rank + ": " + student.getName() + " - " + student.getMarks() + " marks");
            rank++;
        }
    }

    // Display all students
    public void displayAllStudents() {
        System.out.println("\nStudent Information:");
        for (Student student : students) {
            System.out.println(student);
        }
    }
}
