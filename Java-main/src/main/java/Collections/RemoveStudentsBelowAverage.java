package Collections;

import java.util.ArrayList;


public class RemoveStudentsBelowAverage {

    public static void main(String[] args) {
        ArrayList<Student> studentList = createStudentList();
        displayStudents("Students before removal:", studentList);

        double averageGPA = calculateAverageGPA(studentList);
        removeStudentsBelowAverage(studentList, averageGPA);

        displayStudents("Students after removal:", studentList);
    }

    private static ArrayList<Student> createStudentList() {
        ArrayList<Student> studentList = new ArrayList<>();
        studentList.add(new Student("John", "Doe", 3.5));
        studentList.add(new Student("Alice", "Smith", 3.2));
        studentList.add(new Student("Bob", "Johnson", 3.8));
        studentList.add(new Student("Eva", "Williams", 3.0));
        return studentList;
    }

    private static void displayStudents(String message, ArrayList<Student> studentList) {
        System.out.println(message);
        for (Student student : studentList) {
            System.out.println(student.firstName + " " + student.lastName + " - GPA: " + student.gpa);
        }
    }

    public static double calculateAverageGPA(ArrayList<Student> studentList) {
        double totalGPA = 0;
        for (Student student : studentList) {
            totalGPA += student.gpa;
        }
        return totalGPA / studentList.size();
    }

    public static void removeStudentsBelowAverage(ArrayList<Student> studentList, double averageGPA) {
        studentList.removeIf(student -> student.gpa < averageGPA);
    }
}
