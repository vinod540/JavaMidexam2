/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package question6;
import java.util.Scanner;

/**
 *
 * @author Vinod Kumar Reddy Nellore
 */
public class TriangleDriver {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner in = new Scanner(System.in);
        System.out.println("Answer6: Vinod Kumar Reddy Nellore");
	System.out.println("Enter three sides of the triangle : ");
	double side1 = in.nextDouble();
	double side2 = in.nextDouble();
	double side3 = in.nextDouble();
	System.out.println("Enter Color : ");
	String color = in.next();
	System.out.println("Enter is triangle filled (true/false) : ");
	boolean isFilled = in.nextBoolean();
	Triangle triangle = new Triangle(side1, side2, side3, color, isFilled);
	System.out.println("Area of Triangle : "+triangle.area());
	System.out.println("Perimeter of Triangle : "+triangle.perimeter());
	System.out.println("Color of Triangle : "+triangle.getColor());
	System.out.println("Triangle Filled : "+triangle.isFilled());

	}

}

    
    

