package com.Preparation;

public class Complex {

	private double re, im;
	
	public Complex (double re, double im) {
		this.re = re;
		this.im = im;
	}
	
	@Override
	public boolean equals(Object o) {
		if (o==this) {
			return true;
		}
		if(!(o instanceof Complex)) {
			return false;
		}
		
		//typecast o to Complex so that we can compare data members
		Complex c = (Complex) o;
		
		//compare the data members and return accord.
		return Double.compare(re, c.re) == 0
				&& Double.compare(im, c.im) == 0;
		
		
	}
}
