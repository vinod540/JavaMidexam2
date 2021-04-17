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
public class Faculty extends Employee {
  private int officeHours;
	private int numberOfTeachingSubjects;
	public Faculty(String name, String address, String phoneNumber, String emailAddress, String office, int salary,String dataHired, int officeHours, int numberOfTeachingSubjects) {
	super(name, address, phoneNumber, emailAddress, office, salary, dataHired);
	this.officeHours = officeHours;
	this.numberOfTeachingSubjects = numberOfTeachingSubjects;
	}
	public Faculty() {}
	@Override
	public String toString() {
		return this.getClass()+"\n"+"Person Name "+this.name;
	}
	  
}
