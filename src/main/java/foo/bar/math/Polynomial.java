package foo.bar.math;

import java.util.Map;
import java.util.SortedMap;
import java.util.TreeMap;

public class Polynomial {

	private final SortedMap<Integer, Double> coefficients = new TreeMap<Integer, Double>();
	
	
	public int getDeegree() {
		int deegree = (this.coefficients.isEmpty()) ? 0 : this.coefficients.lastKey();  
		return deegree;
	}
	
	public void setCoefficent(int deegree, double coefficient) {
		this.checkDeegreeParameter(deegree);
		if(coefficient == 0.0) {
			this.coefficients.remove(deegree);
		} else {
			this.coefficients.put(deegree, coefficient);
		}
	}
	
	public double getCoefficent(int deegree) {
		this.checkDeegreeParameter(deegree);
		return this.coefficients.get(deegree);
	}
	
	private void checkDeegreeParameter(int deegree) {
		if(deegree < 0) {
			throw new IllegalArgumentException("deegree must be 0 or positive");
		}
	}
	
	public double computeFor(double x) {
		double result = 0;
		for(Map.Entry<Integer, Double> monome: this.coefficients.entrySet()) {
			int degree = monome.getKey();
			double coefficient = monome.getValue(); 
			result = result + Math.pow(x, degree) * coefficient;
		}
		return result;
	}
}
