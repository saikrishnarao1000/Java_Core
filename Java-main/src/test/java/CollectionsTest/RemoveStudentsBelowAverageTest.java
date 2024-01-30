package CollectionsTest;

import Collections.RemoveStudentsBelowAverage;
import Collections.Student;
import org.junit.jupiter.api.Test;
import java.util.ArrayList;
import static org.junit.jupiter.api.Assertions.*;

class RemoveStudentsBelowAverageTest {

    @Test
    void testRemoveStudentsBelowAverage() {
        // Create test data
        ArrayList<Student> studentList = new ArrayList<>();
        studentList.add(new Student("John", "Doe", 3.5));
        studentList.add(new Student("Alice", "Smith", 3.2));
        studentList.add(new Student("Bob", "Johnson", 3.8));
        studentList.add(new Student("Eva", "Williams", 3.0));

        // Calculate expected average GPA
        double totalGPA = 3.5 + 3.2 + 3.8 + 3.0;
        double expectedAverageGPA = totalGPA / studentList.size();

        // Call the method to be tested
        RemoveStudentsBelowAverage.removeStudentsBelowAverage(studentList, expectedAverageGPA);

        // Verify that students with GPA below the average are removed
        for (Student student : studentList) {
            assertTrue(student.gpa >= expectedAverageGPA);
        }
    }

    @Test
    void testCalculateAverageGPA() {
        // Create test data
        ArrayList<Student> studentList = new ArrayList<>();
        studentList.add(new Student("John", "Doe", 3.5));
        studentList.add(new Student("Alice", "Smith", 3.2));
        studentList.add(new Student("Bob", "Johnson", 3.8));
        studentList.add(new Student("Eva", "Williams", 3.0));

        // Call the method to be tested
        double averageGPA = RemoveStudentsBelowAverage.calculateAverageGPA(studentList);

        // Verify the calculated average GPA
        double expectedAverageGPA = (3.5 + 3.2 + 3.8 + 3.0) / studentList.size();
        assertEquals(expectedAverageGPA, averageGPA);
    }
}
