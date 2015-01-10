package foo.bar.math;

import java.util.ArrayList;
import java.util.List;

public class Polynomial {

	private final List<Double> coefficients = new ArrayList<Double>();
	
	
	public int getDeegree() {
		return this.coefficients.size();
	}
	
}
