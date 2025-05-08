
public class Student {
    private String name;
    private int marks;
    private String grade;
    private double averageMarks;

    // Constructor
    public Student(String name, int marks) {
        this.name = name;
        this.marks = marks;
        this.grade = assignGrade(marks);
        this.averageMarks = marks;
    }

    // Assign grade based on marks
    private String assignGrade(int marks) {
        if (marks >= 90) {
            return "A";
        } else if (marks >= 75) {
            return "B";
        } else if (marks >= 50) {
            return "C";
        } else {
            return "F";
        }
    }

    // Getters and Setters
    public String getName() {
        return name;
    }

    public int getMarks() {
        return marks;
    }

    public String getGrade() {
        return grade;
    }

    public double getAverageMarks() {
        return averageMarks;
    }

    @Override
    public String toString() {
        return "Name: " + name + ", Marks: " + marks + ", Grade: " + grade + ", Average Marks: " + averageMarks;
    }
}
