package studio7;

public class Fraction {
	private int numerator;
	private int denominator;
	
	public Fraction() {
		numerator = 0;
		denominator = 0;
	}
	
	public Fraction(int n, int d) {
		numerator = n;
		denominator = d;
	}
	
	public String addFraction(Fraction fraction1, Fraction fraction2) {
		int newDenom = fraction1.denominator * fraction2.denominator;
		// cross multiplication
		int newNum1 = fraction1.numerator * fraction2.denominator;
		int newNum2 = fraction2.numerator * fraction1.denominator;
		int newNumTotal = newNum1 + newNum2;
		
			for (int i = newDenom / 2; i > 0; i--) {
			if (newNumTotal % i == 0 && newDenom % i == 0) {
				newNumTotal /= i;
				newDenom /= i;
			}
		}
		return (newNumTotal + "/" + newDenom);
	}
	
	public String multiplyFraction(Fraction fraction2) {
		int newNumerator = numerator * fraction2.numerator;
		int newDenominator = denominator * fraction2.denominator;
		return newNumerator + "/" + newDenominator;
	}
	
	public String reciprocateFraction() {
		return denominator + "/" + numerator;
	}
	
	public String simplifyFraction() {
		for(int i = (numerator + denominator); i <= 0; i--) {
			if(numerator % i == 0 && denominator % i == 0) {
				numerator /= i;
				denominator /= i;
			}
		}
		
		return numerator + "/" + denominator;
	}
}
