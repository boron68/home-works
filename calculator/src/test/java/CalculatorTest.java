
import org.example.Calculator;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CalculatorTest {

    private final Calculator calc = new Calculator();

    @Test
    void testAdd() {
        assertEquals(10.0, calc.add(7.0, 3.0));
    }

    @Test
    void testSubtract() {
        assertEquals(4.0, calc.subtract(7.0, 3.0));
    }

    @Test
    void testMultiply() {
        assertEquals(21.0, calc.multiply(7.0, 3.0));
    }

    @Test
    void testDivide() {
        assertEquals(2.0, calc.divide(6.0, 3.0));
    }

    @Test
    void testDivideByZero() {
        assertThrows(IllegalArgumentException.class, () -> calc.divide(5.0, 0));
    }
}