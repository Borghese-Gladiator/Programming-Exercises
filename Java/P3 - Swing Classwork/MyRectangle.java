// Program: Assignment One
// Written by: Timothy Shee
// File Name: MyRectangle.java
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
import java.awt.Color;
//This class holds the fundamental attributes of a rectangle
//with the specific methods to find area and perimeter
public class MyRectangle extends MyBoundedShape {
	//Default constructor
	public MyRectangle() {
		super();
	}
	//Initializes instance
	//@param x1, y1, x2, y2
	public MyRectangle(double x1, double y1, double x2, double y2) {
		super(x1, y1, x2, y2);
	}
	//Initializes instance
	//@param x1, y1, x2, y2, color, filled
	public MyRectangle(double x1, double y1, double x2, double y2, Color color, boolean filled) {
		super(x1, y1, x2, y2, color, filled);
	}
	//Gets area
	//@return area
	public double getArea() {
		//A = Length * Width
		return getHeight() * getWidth();
	}
	//Gets perimeter
	//@return perimeter
	public double getPerimeter() {
		//P = 2*Length + 2*Height
		return (2 * getHeight()) + (2 * getWidth());
	}
	//Gets name
	//@return name
	public String getName() {
		return "Rectangle";
	}

	//Gets string representation of data member info
	//@return data member info
	public String toString() {
		String result = getCoordinatesAsString() + '\n';
		
		result += String.format("Rectangle's width is %.2f",  getWidth());
		result += String.format(" and height is %.2f \n",getHeight());
		result += String.format("Rectangle's area is %.2f \n",getArea());
		result += String.format("Rectangle's perimeter is %.2f \n", getPerimeter());
		return result;
	}
}
