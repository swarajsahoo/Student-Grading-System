
import java.util.*;

public class StudentGradingSystemMain {
    public static void main(String[] args) {
        GradingSystem gradingSystem = new GradingSystem();

        // Creating students
        Student student1 = new Student("Alice", 85);
        Student student2 = new Student("Bob", 72);
        Student student3 = new Student("Charlie", 95);
        Student student4 = new Student("David", 60);
        Student student5 = new Student("Eve", 45);

        // Adding students to grading system
        gradingSystem.addStudent(student1);
        gradingSystem.addStudent(student2);
        gradingSystem.addStudent(student3);
        gradingSystem.addStudent(student4);
        gradingSystem.addStudent(student5);

        // Displaying student info
        gradingSystem.displayAllStudents();

        // Displaying average marks
        System.out.println("\nAverage Marks of all students: " + gradingSystem.calculateAverageMarks());

        // Displaying the ranking
        gradingSystem.displayRanking();
    }
}
