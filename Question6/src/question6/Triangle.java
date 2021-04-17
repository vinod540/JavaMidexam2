/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package question6;

/**
 *
 * @author Vinod Kumar Reddy Nellore
 */
public class Triangle extends GeometricObject
{
 private double side1;
 private double side2;
 private double side3;
 private String color;
 private boolean isFilled;
	
public Triangle(double side1, double side2, double side3, String color, boolean isFilled) 
{
   this.side1 = side1;
   this.side2 = side2;
   this.side3 = side3;
   this.color = color;
   this.isFilled = isFilled;
}

@Override
public double area() 
{
double s=(side1 +side2 + side3)/2;
double area=Math.sqrt(s*(s-side1) * (s-side2) * (s-side3));
return area;
}

@Override
public double perimeter() 
{
double perimeter = side1 + side2 + side3;
return perimeter;
}

@Override
public String getColor() 
{
 return color;
}

@Override
public boolean isFilled() 
{
return isFilled;
}
	
}   

