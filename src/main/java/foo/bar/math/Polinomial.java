package foo.bar.math;

import java.util.ArrayList;
import java.util.List;

public class Polinomial {

	private final List<Double> coefficients = new ArrayList<Double>();
	
	
	public int getDeegree() {
		return this.coefficients.size();
	}
	
}
