// Program: Assignment One
// Written by: Timothy Shee
// File Name: MyBoundedShape.java
// Program Description: This program emulates the variety of shapes and includes functions 
// to calculate information about each including width, area, and perimeter
// Most difficult aspect: I needed to rewrite the constructor in every file because
// my constructor was initially written as (double x1, double x2, double y1, double y2)
// so the inputs did not work
// Time Spent: 20 min
// Files in this project: MyShape.java, MyLine.java, MyBoundedShape.java, MyCircle.java, 
// MyPoint.java, MyRectangle.java, MyShapeTest.java, MySquare.java
//               
//Revision History
// Date:                   By:                  Action:

// ---------------------------------------------------

// 2/6/19                  Timothy Shee         Created file

import java.awt.Color;
//This class holds the fundamental attributes of a bounded shape which can be filled or not filled
//It includes a method to compare different bounded shapes
public abstract class MyBoundedShape extends MyShape implements Comparable<MyBoundedShape>{
	private boolean filled;
	//Default constructor
	public MyBoundedShape() {
		super();
	}
	//Initialize instance
	//@param x1, y1, x2, y2
	public MyBoundedShape(double x1, double y1, double x2, double y2) {
		super(x1, y1, x2, y2);
	}
	//Initialize instance
	//@param x1, y2, x2, y2, color, filled or not
	public MyBoundedShape(double x1, double y1, double x2, double y2, Color color, boolean filled) {
		super(x1, y1, x2, y2, color);
		this.setFilled(filled);
	}
	//Finds the upper left x
	//@return upper left x
	public double getUppperLeftX() {
		return Math.min(getX1(), getX2());
	}
	//Finds upper left y
	//@return upper left y
	public double getUpperLeftY() {
		return Math.min(getY1(), getY2());
	}
	//Finds width of shape
	//@return width
	public double getWidth() {
		return Math.abs(getX1() - getX2());
	}
	//Finds height of shape
	//@return height
	public double getHeight() {
		return Math.abs(getY1() - getY2());
	}
	//Finds if this instance is filled or not
	//@return filled or not
	public boolean isFilled() {
		return filled;
	}
	//Sets filled data member
	//@param filled or not
	public void setFilled(boolean filled) {
		this.filled = filled;
	}
	//Calculates area
	//@return area
	public abstract double getArea();
	//Calculates perimeter
	//@return perimeter
	public abstract double getPerimeter();
	//Finds larger shape
	//@param first shape, second shape
	//@return larger shape
	public static MyBoundedShape max(MyBoundedShape o1, MyBoundedShape o2) {
		if (o1.compareTo(o2) > 0)      
			return o1;
		else       
			return o2;
	}
	//Compares this instance and another shape
	//@param another shape
	//@return difference in areas of this instance minus the other instance
	//where the result is represented by 1, 0, -1 for some reason
	//should be one line: return getArea() - o.getArea();
	public int compareTo(MyBoundedShape o) {
		// TODO Auto-generated method stub
		double a1 = getArea();
		double a2 = o.getArea();
		if (a1 > a2) {
			return 1;
		}
		else if (a1 == a2) {
			return 0;
		}
		else {
			return -1;
		}
	}
}