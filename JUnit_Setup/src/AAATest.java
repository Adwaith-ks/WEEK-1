import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Test;

public class AAATest {
    Calculator calc;

    @BeforeEach
    public void setup() {
        calc=new Calculator();
        System.out.println("Setup completed");
    }

    @AfterEach
    public void cleanup() {
        calc=null;
        System.out.println("Cleanup completed");
    }

    @Test
    public void testAdditionAAA() {
        int a=20;
        int b=10;
        int result=calc.add(a,b);
        assertEquals(30,result);
    }

    @Test
    public void testSubtractionAAA() {
        int a=20;
        int b=10;
        int result=calc.subtract(a,b);
        assertEquals(10,result);
    }
}