/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package question5;

/**
 *
 * @author Vinod Kumar Reddy Nellore
 */
public class Staff extends Employee{
private String title;

public Staff(String name, String address, String phoneNumber, String emailAddress, String office, int salary, String dataHired, String title) 
{
 super(name, address, phoneNumber, emailAddress, office, salary, dataHired);
 this.title = title;
}
  public Staff() {}
  @Override
  public String toString() {
  return this.getClass()+"\n"+"Person Name  "+this.name;
	}
	    
}
