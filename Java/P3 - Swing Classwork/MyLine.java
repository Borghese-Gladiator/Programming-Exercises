// Program: Assignment One
// Written by: Timothy Shee
// File Name: MyLine.java
// Program Description: This program emulates the variety of shapes and includes functions 
// to calculate information about each including width, area, and perimeter
// Most difficult aspect: I needed to rewrite the constructor in every file because
// my constructor was initially written as (double x1, double x2, double y1, double y2)
// so the inputs did not work. I also needed to write "Line" for name
// Time Spent: 20 min
// Files in this project: MyShape.java, MyLine.java, MyBoundedShape.java, MyCircle.java, 
// MyPoint.java, MyRectangle.java, MyShapeTest.java, MySquare.java
//               
//Revision History
// Date:                   By:                  Action:

// ---------------------------------------------------

// 2/6/19                  Timothy Shee         Created file
// Files in this project: MyShape.java, MyLine.java, MyBoundedShape.java, MyCircle.java, 
// MyPoint.java, MyRectangle.java, MyShapeTest.java, MySquare.java
import java.awt.Color;
//This class holds the fundamental attributes of a line
public class MyLine extends MyShape {
	//Default constructor
	public MyLine() {
		super();
	}
	//Initialize instance
	//@param x1, y1, x2, y2
	public MyLine(double x1, double y1, double x2, double y2) {
		super(x1, y1, x2, y2);
	}

	//Initialize instance
	//@param x1, y2, x2, y2, color
	public MyLine(double x1, double y1, double x2, double y2, Color color) {
		super(x1, y1, x2, y2, color);
	}
	//Gets name
	//@return name
	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return "Line";
	}
	//Gets string representation of data member info
	//@return data member info
	public String toString() {
		return getCoordinatesAsString();
	}
}
