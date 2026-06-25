import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class CalculatorTest {
    @Test
    public void testAddition() {
        Calculator calc=new Calculator();
        assertEquals(8,calc.add(5,3));
    }

    @Test
    public void testSubtraction() {
        Calculator calc=new Calculator();
        assertEquals(5,calc.subtract(10,5));
    }
}