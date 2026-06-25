import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class AssertionsTest {
    @Test
    public void testAssertions() {
        assertEquals(10,5+5);
        assertTrue(10>5);
        assertFalse(5>10);
        assertNotNull("JUnit");
        assertNull(null);
    }
}