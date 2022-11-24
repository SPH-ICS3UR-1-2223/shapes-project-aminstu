package shapes;

public class Circle {

private double radius;
private double circumference;
private double area;

//Methods
public Circle() {
radius = 1;
circumference=findCircumference();
area=findArea();
}

public Circle(double r) {
	this.radius =r;
	circumference=findCircumference();
	area=findArea();  



}

private double findCircumference() {
return Math.PI * radius * 2;
}

private double findArea() {
area= Math.PI* Math.pow(radius, 2);
return area;
}

public void printStats() {
System.out.println("Circle");
System.out.println("Radius ="+this.radius);
System.out.println("Circumference ="+this.circumference);
System.out.println("Area ="+this.area);
}

public double getRadius() {

return radius;
}


public void setRadius(double radius) {
this.radius = radius;
}

public double getCircumference() {
return circumference;
}

public double getArea() {
return area;
}


}
