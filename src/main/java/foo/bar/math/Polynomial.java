package foo.bar.math;

import java.util.ArrayList;
import java.util.List;

public class Polynomial {

	private final List<Double> coefficients = new ArrayList<Double>();
	
	
	public int getDeegree() {
		return this.coefficients.size();
	}
	
	public void setCoefficent(int deegree, double coefficient) {
		throw new UnsupportedOperationException("not yet implemented");
	}
	
	public double getCoefficent(int deegree) {
		throw new UnsupportedOperationException("not yet implemented");
	}
	
	public double computeFor(double x) {
		throw new UnsupportedOperationException("not yet implemented");
	}
}
