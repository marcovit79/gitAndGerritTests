package foo.bar.math;

import java.util.Random;

import org.junit.Assert;
import org.junit.Test;

public class PolynomialBaseTest {

	@Test
	public void defaultConstructorTest() {
		Polynomial p = new Polynomial();
		Assert.assertEquals("Empty polynomial must have degree equals to 0", 0, p.getDeegree());
	}
	
	
	@Test
	public void getAndSetCoefficientTest() {
		Polynomial p = new Polynomial();
		
		p.setCoefficent(0, 0.2);
		Assert.assertEquals("Setter or getter failed for degree 0", 0.2, p.getCoefficent(0), 0);
		
		p.setCoefficent(10, 0.5);
		Assert.assertEquals("Setter or getter failed for degree 10", 0.5, p.getCoefficent(10), 0);
		
		Random rnd = new Random(1234);
		for(int i=0; i<100; i++) {
			int deegree = rnd.nextInt(Integer.MAX_VALUE);
			double coefficient = rnd.nextDouble();
			
			p.setCoefficent(deegree, coefficient);
			Assert.assertEquals("Setter or getter failed for degree "+deegree, 
				                           coefficient, p.getCoefficent(deegree), 0);
		}
		
	}
	
	@Test(expected=IllegalArgumentException.class) 
	public void getAndSetCoefficientTestArgumentsValidation() {
		Polynomial p = new Polynomial();
		
		p.setCoefficent(-1, 0.2);
	}
	
	@Test
	public void computeForTest() {
		// x^2 + 3x + 4 
		Polynomial p = new Polynomial();
		p.setCoefficent(2, 1);
		p.setCoefficent(1, 3);
		p.setCoefficent(0, 4);
		
		Assert.assertEquals("x^2 + 3x + 4 =  14 for x = 2 instead is different", 14, p.computeFor(2), 0);
	}

	
}
