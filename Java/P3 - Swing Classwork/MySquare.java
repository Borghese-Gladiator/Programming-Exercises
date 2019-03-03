// Program: Assignment One
// Written by: Timothy Shee
// File Name: MySquare.java
// Program Description: This program emulates the variety of shapes and includes functions 
// to calculate information about each including width, area, and perimeter
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
//This class holds the fundamental attributes of a square
//with the specific methods to find area and perimeter
public class MySquare extends MyBoundedShape{
	//Default constructor
	public MySquare() {
		super();
	}
	//Initializes instance
	//@param x1, y1, x2, y2
	public MySquare(double x1, double y1, double x2, double y2) {
		super(x1, y1, x2, y2);
	}
	//Initializes instance
	//@param x1, y1, x2, y2, color, filled
	public MySquare(double x1, double y1, double x2, double y2, Color color, boolean filled) {
		super(x1, y1, x2, y2, color, filled);
	}
	//Gets area
	//@return area
	public double getArea() {
		//A = side^2
		//could use either getHeight() and getWidth() because
		//the definition of a square is that height == width
		return Math.pow(getWidth(), 2);
	}
	//Gets perimeter
	//@return perimeter
	public double getPerimeter() {
		// P = 4*s
		return 4 * getWidth();
	}
	//Gets name
	//@return name
	public String getName() {
		// TODO Auto-generated method stub
		return "Square";
	}
	//Gets string representation of data member info
	//@return data member info
	public String toString() {
		String result = getCoordinatesAsString() + '\n';
		result += String.format("Square's width is %.2f \n",  getWidth());
		result += String.format("Square's area is %.2f \n",getArea());
		result += String.format("Square's perimeter is %.2f \n", getPerimeter());
		return result;
	}
}
