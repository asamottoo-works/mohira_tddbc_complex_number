package org.mohirara.tddbc.complex;

import java.io.StringWriter;

public class PurelyImaginaryNumber {


	private final int imaginaryPart;

	public PurelyImaginaryNumber(int imaginaryPart) {
		this.imaginaryPart = imaginaryPart;
		String msg = "imaginaryPart must be NOT 0";
		if (imaginaryPart == 0) throw new IllegalArgumentException(msg);
	}

	public String getNotation() {
		if (this.imaginaryPart == 1) return "i";
		if (this.imaginaryPart == -1) return "-i";
		return this.imaginaryPart + "i";
	}

	public boolean isSame(PurelyImaginaryNumber other) {
		return this.imaginaryPart == other.imaginaryPart;
	}

	public PurelyImaginaryNumber getConjugate() {
		return new PurelyImaginaryNumber(- this.imaginaryPart);
	}
}
