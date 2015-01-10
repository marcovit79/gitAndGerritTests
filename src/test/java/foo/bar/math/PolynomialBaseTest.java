package foo.bar.math;

import org.junit.Assert;
import org.junit.Test;
import java.util.Random;

public class PolynomialBaseTest {

	@Test
	public void defaultConstructorTest() {
		Polynomial p = new Polynomial();
		Assert.assertEquals("Empty polynomial must have degree equals to 0", 0, p.getDeegree());
	}
	
	
	@Test
	public void getAndSetCoefficientTest() {
		Polynomial p = new Polynomial();
		
		Random rnd = new Random(1234);
		for(int i=0; i<100; i++) {
			int deegree = rnd.nextInt(Integer.MAX_VALUE);
			double coefficient = rnd.nextDouble();
			
			p.setCoefficent(deegree, coefficient);
			Assert.assertEquals("Setter or getter failed for degree "+deegree, 
				                           coefficient, p.getgetCoefficent(deegree));
		}
	}
	
}
