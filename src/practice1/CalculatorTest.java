package practice1;

import static org.junit.Assert.assertEquals;
import org.junit.jupiter.api.Test;

class CalculatorTest {

	@Test
	void testAdd() {
		Calculator calc = new Calculator();
        int result = calc.add(10, 20);
        assertEquals(30, result);
    }
}
