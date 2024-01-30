package SetsTest;

import org.junit.jupiter.api.Test;
import sets.RemoveDuplicates;

import static junit.framework.Assert.assertEquals;

public class RemoveDuplicatesTest {

    @Test
    void testRemoveDuplicates() {
        assertEquals("helo", RemoveDuplicates.removeDuplicates("hello"));
        assertEquals("abc", RemoveDuplicates.removeDuplicates("abc"));
        assertEquals("abcdef", RemoveDuplicates.removeDuplicates("abcdef"));
        assertEquals("abcd", RemoveDuplicates.removeDuplicates("aabbccd"));
        assertEquals("abcd", RemoveDuplicates.removeDuplicates("abcdabcd"));
        assertEquals("xyz", RemoveDuplicates.removeDuplicates("xyzxyz"));
        assertEquals(" ", RemoveDuplicates.removeDuplicates(" "));
        assertEquals("", RemoveDuplicates.removeDuplicates(""));
    }
}
