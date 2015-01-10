package foo.bar.math;

import java.util.Random;

import org.junit.Assert;
import org.junit.Test;

public class PolynomialBaseTest {

	@Test
	public void defaultConstructor() {
		Polynomial p = new Polynomial();
		Assert.assertEquals("Empty polynomial must have degree equals to 0", 0, p.getDeegree());
	}
	
	
	@Test
	public void getAndSetCoefficient() {
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
	public void getAndSetCoefficientArgumentsValidation() {
		Polynomial p = new Polynomial();
		
		p.setCoefficent(-1, 0.2);
	}
	
	@Test
	public void computeFor() {
		// x^2 + 3x + 4 
		Polynomial p = new Polynomial();
		p.setCoefficent(2, 1);
		p.setCoefficent(1, 3);
		p.setCoefficent(0, 4);
		
		Assert.assertEquals("x^2 + 3x + 4 =  14 for x = 2 instead is different", 14, p.computeFor(2), 0);
	}
	
	@Test
	public void multiply() {
		
		Random rnd = new Random(1234);
		for(int d=0; d<100; d++) {
			
			int polinomialLength = rnd.nextInt(50);
			
			double x = rnd.nextDouble();
			
			// prepare polynomial
			Polynomial p = new Polynomial();
			for(int l=0; l<polinomialLength; l++) {
				int deegree = rnd.nextInt(Integer.MAX_VALUE);
				double coefficient = rnd.nextDouble();
				p.setCoefficent(deegree, coefficient);
			}
			
			double value = p.computeFor(x);
			double multiplyFactor = rnd.nextInt(10) + rnd.nextDouble() - 5;  
			
			p.multiply(multiplyFactor);
			
			Assert.assertEquals("multiplication error", value * multiplyFactor, p.computeFor(x), 0);
		}
	}

	
}
