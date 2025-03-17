import java.util.*;

public class Student implements Comparable<Student> {
    private int studentId;
    private String name;
    private double gpa;

    // Constructor to initialize the properties
    public Student(int studentId, String name, double gpa) {
        this.studentId = studentId;
        this.name = name;
        this.gpa = gpa;
    }

    // Getter methods
    public int getStudentId() {
        return studentId;
    }

    public String getName() {
        return name;
    }

    public double getGpa() {
        return gpa;
    }

    // Implementing the compareTo method to sort by GPA
    @Override
    public int compareTo(Student other) {
        if (this.gpa < other.gpa) {
            return -1;  // Current object has a smaller GPA, so it comes first
        } else if (this.gpa > other.gpa) {
            return 1;   // Current object has a larger GPA, so it comes last
        } else {
            return 0;   // GPAs are equal
        }
    }

    // Override the toString method to print student details
    @Override
    public String toString() {
        return "StudentID: " + studentId + ", Name: " + name + ", GPA: " + gpa;
    }

    public static void main(String[] args) {
        // Creating a list of students
        List<Student> students = new ArrayList<>();
        students.add(new Student(101, "Alice", 3.5));
        students.add(new Student(102, "Bob", 3.8));
        students.add(new Student(103, "Charlie", 3.2));
        students.add(new Student(104, "David", 3.5));
        students.add(new Student(105, "Eve", 4.0));

        // Sorting students by GPA in ascending order
        Collections.sort(students);

        // Displaying the sorted list
        System.out.println("Sorted Students by GPA:");
        for (Student student : students) {
            System.out.println(student);
        }
    }
}

