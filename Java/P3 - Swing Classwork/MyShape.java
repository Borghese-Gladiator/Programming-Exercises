// Program: Assignment One
// Written by: Timothy Shee
// File Name: MyShape.java
// Program Description: This program emulates the variety of shapes and includes functions 
// to calculate information about each including width, area, and perimeter
// Files in this project: MyShape.java, MyLine.java, MyBoundedShape.java, MyCircle.java, 
// MyPoint.java, MyRectangle.java, MyShapeTest.java, MySquare.java
import java.awt.Color;
//This class holds the fundamental attributes of a shape which are coordinates
public abstract class MyShape {
	public abstract String getName();
	private double x1;
	private double x2;
	private double y1;
	private double y2;
	private MyPoint point1;
	private MyPoint point2;
	private Color color;
	//Default constructor
	public MyShape() {
		this.x1 = 0;
		this.x2 = 0;
		this.y1 = 0;
		this.y2 = 0;
		point1 = null;
		point2 = null;
		color = null;
	}
	//Initializes instance
	//@param x1, y1, x2, y2
	public MyShape(double x1, double y1, double x2, double y2) {
		this.x1 = x1;
		this.x2 = x2;
		this.y1 = y1;
		this.y2 = y2;
		point1 = new MyPoint(x1, y1);
		point2 = new MyPoint(x2, y2);
	}
	//Initializes instance
	//@param x1, y1, x2, y2, oolor
	public MyShape(double x1, double y1, double x2, double y2, Color color) {
		this.x1 = x1;
		this.x2 = x2;
		this.y1 = y1;
		this.y2 = y2;
		point1 = new MyPoint(x1, y1);
		point2 = new MyPoint(x2, y2);
		this.color = color;
	}
	//Gets coordinates as a string
	//@return coordinates as a string
	public String getCoordinatesAsString() {
		return point1.toString() + ", " + point2.toString();
	}
	//Generated getters and setters
	public Color getColor() {
		return color;
	}
	public void setColor(Color color) {
		this.color = color;
	}
	public MyPoint getPoint1() {
		return point1;
	}
	public MyPoint getPoint2() {
		return point2;
	}
	public double getX1() {
		return x1;
	}
	public double getX2() {
		return x2;
	}
	public double getY1() {
		return y1;
	}
	public double getY2() {
		return y2;
	}
}
