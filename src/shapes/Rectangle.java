package shapes;

public class Rectangle {
	//fields
	private double length;
	private double width;
	private double area;
	private double perimeter;
	
	//methods
	public Rectangle() {
		this.length=1;
		this.width=1;
		this.area = findArea();
		this.perimeter = findPerimeter();
	}
	
	public Rectangle(double side) {
		
	}
	
	public Rectangle(double length, double width) {
		
	}
	
	
	private double findPerimeter() {
		return length+length+width+width;
	}
	
	private double findArea() {
		return length*width;
	}
	
	public void printStats() {
		
	}

	public double getLength() {
		return length;
	}

	public void setLength(double length) {
		this.length = length;
	}

	public double getWidth() {
		return width;
	}

	public void setWidth(double width) {
		this.width = width;
	}

	public double getArea() {
		return length*width;
	}

	public double getPerimeter() {
		return length+length+width+width;
	}
	
	
}
