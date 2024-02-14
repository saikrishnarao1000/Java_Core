package hashmaps;

import Collections.Student;

import java.util.HashMap;

public class StudentHashMap {
    public static void main(String[] args) {
        // Creating hashmap of students
        HashMap<String, Student> studentMap = new HashMap<>();

        // Adding students to the hashmap
        studentMap.put("John", new Student("John", "Doe", 3.8));
        studentMap.put("Alice", new Student("Alice", "Smith", 3.9));
        studentMap.put("Bob", new Student("Bob", "Johnson", 3.5));
        studentMap.put("Emma", new Student("Emma", "Brown", 3.7));
        studentMap.put("James", new Student("James", "Wilson", 3.6));
        studentMap.put("Olivia", new Student("Olivia", "Lee", 3.8));
        studentMap.put("Michael", new Student("Michael", "Taylor", 3.4));
        studentMap.put("Sophia", new Student("Sophia", "Anderson", 3.9));

        // Retrieve a student object by name
        String studentName = "Alice";
        Student foundStudent = getStudentByName(studentName, studentMap);
        if (foundStudent != null) {
            System.out.println("Found student: " + foundStudent.getFirstName() + " " + foundStudent.getLastName() + " with GPA " + foundStudent.getGPA());
        } else {
            System.out.println("Student not found.");
        }
    }

    public static Student getStudentByName(String name, HashMap<String, Student> studentMap) {
        return studentMap.get(name);
    }
}
