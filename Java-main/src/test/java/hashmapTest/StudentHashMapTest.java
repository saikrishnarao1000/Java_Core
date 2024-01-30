package hashmapTest;

import Collections.Student;
import hashmaps.StudentHashMap;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import java.util.HashMap;

public class StudentHashMapTest {

    @Test
    void testGetStudentByName() {
        HashMap<String, Student> studentMap = new HashMap<>();
        studentMap.put("John", new Student("John", "Doe", 3.8));
        studentMap.put("Alice", new Student("Alice", "Smith", 3.9));
        studentMap.put("Bob", new Student("Bob", "Johnson", 3.5));

        assertEquals("John", StudentHashMap.getStudentByName("John", studentMap).getFirstName());
        assertEquals("Smith", StudentHashMap.getStudentByName("Alice", studentMap).getLastName());
        assertEquals(3.5, StudentHashMap.getStudentByName("Bob", studentMap).getGPA());
    }
}
