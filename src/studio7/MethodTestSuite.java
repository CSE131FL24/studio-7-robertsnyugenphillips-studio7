package studio7;

public class MethodTestSuite {

	public static void main(String[] args) {
		Die newDie = new Die(6);
		System.out.println(newDie.dieRoller());
		
		Rectangle rectangle1 = new Rectangle(10, 10);
		Rectangle rectangle2 = new Rectangle(5, 4);
		System.out.println(rectangle1.area());
		System.out.println(rectangle1.perimeter());
		System.out.println(rectangle1.isSquare());
		System.out.println(rectangle1.areaGreaterThan(rectangle1, rectangle2));
		
		Fraction threeFourths = new Fraction(3,4);
		Fraction twoFourths = new Fraction(2,4);
		Fraction tenTwentieths = new Fraction(10, 20);
		System.out.println(threeFourths.addFraction(threeFourths, twoFourths));
		System.out.println(threeFourths.multiplyFraction(twoFourths)); // 6/16
		System.out.println(threeFourths.reciprocateFraction()); // 4/3
		System.out.println(tenTwentieths.simplifyFraction()); // 1/2
	}
}
