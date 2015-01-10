package foo.bar.math;

import org.junit.Assert;
import org.junit.Test;


public class PolinomialBaseTest {

	@Test
	public void simpleTest() {
		Polinomial p = new Polinomial();
		Assert.assertEquals("Empty polynomial must have degree equals to 0", 0, p.getDeegree());
	}
	
}
