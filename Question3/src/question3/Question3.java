/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package question3;

import java.util.ArrayList;

/**
 *
 * @author Vinod Kumar Reddy Nellore
 */
    public class Question3 {
    public static void main(String[] args) {
    ArrayList list = new ArrayList();
    System.out.println("Answer3: Vinod Kumar Reddy Nellore");
    Loan loan = new Loan("PL123",50000);
    Circle circle = new Circle(5);
    //Adding Loan class object, Data class object, String class object and Circle object to the ArrayList
     list.add(loan);
     list.add(new java.util.Date());
     list.add("Welcome");
     list.add(circle);
    //Diplaying the elements present in ArrayList
     for(int i=0;i<list.size();i++)
     System.out.println(list.get(i));
	}
}
    class Loan
   {
     private String loactAccountNumber;
     private int loanAmount;
     public Loan(String loactAccountNumber, int loanAmount) {
     this.loactAccountNumber = loactAccountNumber;
     this.loanAmount = loanAmount;
	}
     public Loan() {}
     @Override
     public String toString() {
     return "Loan [loactAccountNumber=" + loactAccountNumber + ", loanAmount=" + loanAmount + "]";
	}	
}
    class Circle
    {
    private int radius;

    public Circle(int radius) {
    this.radius = radius;
    }
    public Circle() {}
    @Override
    public String toString() {return "Circle [radius=" + radius + "]";
	}	
}