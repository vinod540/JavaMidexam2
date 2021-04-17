/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package question8;


/**
 *
 * @author Vinod Kumar Reddy Nellore
 */
 public class Driver {
	public static void main(String[] args) {
	Inventory i = new Inventory();
	Item n1 = new Nut();
	Item n2 = new Nut();
	Item n3 = new Nut();
	i.addItem(n1);
	i.addItem(n2);
	i.addItem(n3);
	Item b1 = new Bolt();
	Item b2 = new Bolt();
	i.addItem(b1);
	i.addItem(b2);
	Item s1 = new Screw();
	i.addItem(s1);
        System.out.println("Answer8: Vinod Kumar Reddy Nellore ");
	System.out.println("Total Cost = "+i.totalCost());
	}
}

