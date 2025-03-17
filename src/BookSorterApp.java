import java.util.*;

public class BookSorterApp {
    public static void main(String[] args) {
        // Step 1: Create a list of Student objects
        List<Student> students = new ArrayList<>();
        students.add(new Student(1, "Alice", 3.5));
        students.add(new Student(2, "Bob", 3.8));
        students.add(new Student(3, "Charlie", 3.5));
        students.add(new Student(4, "David", 3.9));
        students.add(new Student(5, "Eve", 3.2));

        // Step 2: Sort the list of students based on GPA
        Collections.sort(students);

        // Step 3: Print the sorted list
        System.out.println("Students sorted by GPA (ascending order):");
        for (Student student : students) {
            System.out.println(student);
        }

        // Step 4: Edge Case: Students with the same GPA
        System.out.println("\nTesting with students having the same GPA:");
        List<Student> sameGpaStudents = new ArrayList<>();
        sameGpaStudents.add(new Student(6, "Frank", 3.5));
        sameGpaStudents.add(new Student(7, "Grace", 3.5));
        Collections.sort(sameGpaStudents);
        
        System.out.println("Sorted students with same GPA (alphabetically by name):");
        for (Student student : sameGpaStudents) {
            System.out.println(student);
        }
    }
}
