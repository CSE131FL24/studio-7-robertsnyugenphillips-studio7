package studio7;

public class Rectangle {
	private int length;
	private int width;
	
	public Rectangle() {
		length = 0;
		width = 0;
	}
	
	public Rectangle(int l, int w) {
		length = l;
		width = w;
	}
	
	// methods
	public int area() {
		return length * width;
	}
	
	public int perimeter() {
		return (2 * length) + (2 * width);
	}
	
	public boolean isSquare() {
		if (length == width) {
			return true;
		}
		else {
			return false;
		}
	}
	
	public int getLength() {
		return length;
	}

	public void setLength(int length) {
		this.length = length;
	}

	public int getWidth() {
		return width;
	}

	public void setWidth(int width) {
		this.width = width;
	}
	
	// returns if area of rect1 is greater than area of rect2
	public boolean areaGreaterThan (Rectangle rect1, Rectangle rect2) {
		if (rect1.area() > rect2.area()) {
			return true;
		} else {
			return false;
		}
	}
}
