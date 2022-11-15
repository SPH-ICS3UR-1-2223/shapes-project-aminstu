package shapes;

public class Triangle {
	private double sideA;
	private double sideB;
	private double sideC;
	private double perimeter;
	private double area;
	
	//Methods
	public Triangle() {
		this.sideA=this.sideB=this.sideC=1;
		this.perimeter=findPerimeter();
		this.area=findArea();
	}
	
	public Triangle(double a, double b, double c) {
		this.sideA=a;
		this.sideB=b;
		this.sideC=c;
		this.perimeter=findPerimeter();
	}
	
	private double findPerimeter() {
		return sideA+sideB+sideC;
	}
	
	private double findArea() {
		return sideA*sideB/2;
	}
	
	public void printStats() {
		
	}

	public double getSideA() {
		return sideA;
	}

	public void setSideA(double sideA) {
		this.sideA = sideA;
	}

	public double getSideB() {
		return sideB;
	}

	public void setSideB(double sideB) {
		this.sideB = sideB;
	}

	public double getSideC() {
		return sideC;
	}

	public void setSideC(double sideC) {
		this.sideC = sideC;
	}

	public double getPerimeter() {
		return perimeter;
	}

	public double getArea() {
		return area;
	}
	
	
}
