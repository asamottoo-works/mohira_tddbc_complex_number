package org.mohirara.tddbc.complex;

import static java.lang.Math.abs;

public class ImaginaryNumber {
	private final int realPart;
	private final int imaginaryPart;

	public ImaginaryNumber(int realPart, int imaginaryPart) {
		this.realPart = realPart;
		this.imaginaryPart = imaginaryPart;
	}

	public String getNotation() {
		return String.format("%d %s %si", this.realPart, this.getImaginaryPartSign(), this.getImaginaryPartNotation());
	}

	private String getImaginaryPartNotation(){
		int absImaginaryPart = abs(this.imaginaryPart);
		if (absImaginaryPart==1) return "";
		return String.valueOf(absImaginaryPart);
	}

	private String getImaginaryPartSign() {
		return this.imaginaryPart < 0 ? "-" : "+";
	}
}
