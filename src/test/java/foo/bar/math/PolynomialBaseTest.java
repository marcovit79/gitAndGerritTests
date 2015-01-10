package foo.bar.math;

import org.junit.Assert;
import org.junit.Test;


public class PolynomialBaseTest {

	@Test
	public void polinomialDefaultConstructorTest() {
		Polynomial p = new Polynomial();
		Assert.assertEquals("Empty polynomial must have degree equals to 0", 0, p.getDeegree());
	}
	
}
