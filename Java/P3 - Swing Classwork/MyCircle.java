// Program: Assignment One
// Written by: Timothy Shee
// File Name: MyCircle.java
// Program Description: This program emulates the variety of shapes and includes functions 
// to calculate information about each including width, area, and perimeter
// Files in this project: MyShape.java, MyLine.java, MyBoundedShape.java, MyCircle.java, 
// MyPoint.java, MyRectangle.java, MyShapeTest.java, MySquare.java
// Most difficult aspect: I needed to rewrite the constructor in every file because
// my constructor was initially written as (double x1, double x2, double y1, double y2)
// so the inputs did not work. I needed to implement getArea() and getPerimeter() methods.
// Time Spent: 20 min
// Files in this project: MyShape.java, MyLine.java, MyBoundedShape.java, MyCircle.java, 
// MyPoint.java, MyRectangle.java, MyShapeTest.java, MySquare.java
//               
//Revision History
// Date:                   By:                  Action:

// ---------------------------------------------------

// 2/6/19                  Timothy Shee         Created file
// 2/9/19				   Timothy Shee         Added Documentation
import java.awt.Color;
//This class holds the fundamental attributes of a rectangle
//with the specific methods to find radius, area, and perimeter(circumference)
public class MyCircle extends MyBoundedShape{
	private double radius;
	//Default constructor
	public MyCircle() {
		super();
	}
	//Initializes instance
	//@param x1, y1, x2, y2
	public MyCircle(double x1, double y1, double x2, double y2) {
		super(x1, y1, x2, y2);
		radius = getRadius();
	}
	//Initializes instance
	//@param x1, y1, x2, y2, color, filled
	public MyCircle(double x1, double y1, double x2, double y2, Color color, boolean filled) {
		super(x1, y1, x2, y2, color, filled);
		radius = getRadius();
	} 
	//Calculates radius where two coordinates represent a square and the circle is transcribed
	//in the middle of the square, therefore the width/2 is the radius
	//@return calculated radius
	double getRadius() {
		return (double)getWidth()/2.0;
	} 
	//Formats radius
	//@return formatted radius
	public double getFormattedRadius() {
		return Double.parseDouble(String.format("%.2f", radius));
	}
	//Gets area
	//@param area
	public double getArea() {
		//A = pi * r^2
		return Math.PI * Math.pow(radius, 2);
	}
	//Gets perimeter/circumference
	//@return perimeter/circumference
	public double getPerimeter() {
		// P = 2 * pi * radius
		return 2 * Math.PI * radius;
	}
	//Gets name
	//@return name
	public String getName() {
		return "Circle";
	}
	//Gets string representation of data member info
	//@return data member info
	public String toString() {
		String result = getCoordinatesAsString() + '\n';
		result += String.format("Circle's radius is %.2f \n",  radius);
		result += String.format("Circle's area is %.2f \n", getArea());
		result += String.format("Circle's perimeter is %.2f \n", getPerimeter());
		return result;
	}
}
