package studio7;

public class Die {
	private int sides;
	
	public Die() {
		sides = 0;
	}
	
	public Die(int n) {
		sides = n;
	}
	
	// methods
	public int dieRoller() {
		return (int) ((Math.random() * sides) + 1);
	}
}
