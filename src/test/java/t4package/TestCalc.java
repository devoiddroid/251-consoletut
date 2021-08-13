package t4package;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TestCalc {
	@Test
	public void testAdd() {
		Assertions.assertEquals(3, Calc.add(1, 2));
	}
}