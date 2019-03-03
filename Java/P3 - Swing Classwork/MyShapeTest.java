// Program: Assignment One
// Written by: Timothy Shee
// File Name: MyShapeTest.java
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
import java.util.ArrayList;
//This class tests the shapes project by outputting information about each
//created shape
public class MyShapeTest {
	public static void main(String[] args) {
		// instantiate all the objects to be tested
		MyLine line1= new MyLine(12, 13, 20, 25);
		MyCircle circle1 = new MyCircle(12, 16, 34, 45);
		MyCircle circle2= new MyCircle(10, 15, 20, 25);
		MyRectangle rect1 = new MyRectangle(23, 35, 25, 13);
		MyRectangle rect2 = new MyRectangle(12, 20, 15, 30);
		MySquare squ1 = new MySquare(20, 25, 30, 35);
		MySquare squ2 = new MySquare(12, 20, 20, 28);
		System.out.println(formatCoordinate(line1));
		//My Code
		//ArrayList to hold all the shapes listed above
		ArrayList<MyShape> arr = new ArrayList<MyShape>();
		arr.add(line1);
		arr.add(circle1);
		arr.add(circle2);
		arr.add(rect1);
		arr.add(rect2);
		arr.add(squ1);
		arr.add(squ2);
		//Outputting all the shapes and formatting the output to be similar for all shapes
		for (MyShape a: arr) {
			System.out.println(formatCoordinate(a));
		}
		//Finds max of each shape: circle, rectangle, square
		System.out.println("-----------------");
		MyBoundedShape a = new MyCircle();
		MyBoundedShape b = new MyRectangle();
		MyBoundedShape c = new MySquare();
		for (MyShape temp: arr) {
			if (temp instanceof MyCircle) {
				a = MyBoundedShape.max(a, (MyBoundedShape)temp);
			}
			else if (temp instanceof MyRectangle) {
				b = MyBoundedShape.max(b, (MyBoundedShape)temp);
			}
			else if (temp instanceof MySquare) {
				c = MyBoundedShape.max(c, (MyBoundedShape)temp);
			}
		}
		System.out.println("The max circle's radius is " + ((MyCircle)a).getFormattedRadius());
		System.out.println("The max rectangle's width is " + ((MyRectangle)b).getWidth() + " and height is " + ((MyRectangle)b).getHeight());
		System.out.println("The max square's width is " + ((MySquare)c).getWidth());
	}
	//Formats a given shape's String representation from toString()
	//@param a shape
	private static String formatCoordinate(MyShape a) {
		String result = "Coordinates of ";
		result += a.getName() + " are: \n";
		result += a.toString() + '\n';
		return result;
	}
}
