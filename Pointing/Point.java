package Pointing;

public class Point {
	// data fields
	int x;
	int y;

	// Constructor Point
	public Point() {
		x = 0;
		y = 0;

	}

	// Constructor Point(int x, int y)
	public Point(int x, int y) {
		this.x = x;
		this.y = y;

	}

	// Copy constructor Point
	public Point(Point other) {
		this.x = other.x;
		this.y = other.y;
	}

	// Get and Set methods for X and Y
	public int getX() {
		return x;
	}

	public int getY() {
		return y;
	}

	public void setX(int X) {
		this.x = X;
	}

	public void setY(int Y) {
		this.y = Y;
	}

	// toString method to print X and Y
	@Override
	public String toString() {
		return "X:" + this.x + " Y:" + this.y;
	}

	// Method to check if X = Y
	public boolean equals(Point p) {
		if (p.x == p.y)
			return true;
		return false;

	}

	// Method to change X and Y values
	public void move(int dx, int dy) {
		this.x += dx;
		this.y += dy;
	}

	// Method to tell the distance between X and Y
	public double distance(Point p) {
		return (((this.x - p.x) ^ 2) + ((this.y - p.y) ^ 2)) ^ (1 / 2);
	}

	// Method to get the midpoint of X and Y
	public int getPointInHalfWay() {
		return (this.x + this.y) / 2;
	}

	// Method to print the line equation of point one and point two
	public String LineEquation(int x1, int y1, int x2, int y2) {
		int dx = x2 - x1;
		int dy = y2 - y1;
		int slope = (dy / dx);
		int b = 0 - ((slope * x1) - y1);
		return "line equation is: y = " + slope + "x" + " + " + b;
	}

}
