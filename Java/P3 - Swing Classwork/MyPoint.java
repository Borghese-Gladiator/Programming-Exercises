// Program: Assignment One
// Written by: Timothy Shee
// File Name: MyPoint.java
// Program Description: This program emulates the variety of shapes and includes functions 
// to calculate information about each including width, area, and perimeter
// Files in this project: MyShape.java, MyLine.java, MyBoundedShape.java, MyCircle.java, 
// MyPoint.java, MyRectangle.java, MyShapeTest.java, MySquare.java
// Most difficult aspect: I needed to rewrite the constructor in every file because
// my constructor was initially written as (double x1, double x2, double y1, double y2)
// so the inputs did not work. I needed to write stuff.
// Time Spent: 20 min
// Files in this project: MyShape.java, MyLine.java, MyBoundedShape.java, MyCircle.java, 
// MyPoint.java, MyRectangle.java, MyShapeTest.java, MySquare.java
//               
//Revision History
// Date:                   By:                  Action:

// ---------------------------------------------------

// 2/6/19                  Timothy Shee         Created file

public class MyPoint {
	private double x;
	private double y;
	//Initializes instance 
	//@param x, y
	public MyPoint(double x, double y) {
		this.x = x;
		this.y = y;
	}
	//Gets string representation of data member info
	//@return data member info
	//toString() to display x, y coordinate with one decimal place as (x, y) for example: (2.4, 10.0)
	public String toString() {
		return "(" + roundToOneDecimal(x) + ", " + roundToOneDecimal(y) + ")";
	}
	//Rounds to one decimal
	//@param a double
	//@return rounded double
	private double roundToOneDecimal(double num) {
		return (int)((10 * num) + 0.5) / 10.0;
	}
	//Generated getters and setters
	public double getX() {
		return x;
	}
	public void setX(double x) {
		this.x = x;
	}
	public double getY() {
		return y;
	}
	public void setY(double y) {
		this.y = y;
	}
}
