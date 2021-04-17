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
public class Employee extends Person {
 private String office;
	private int salary;
	private String dataHired;
	public Employee(String name, String address, String phoneNumber, String emailAddress, String office, int salary,String dataHired) {
	super(name, address, phoneNumber, emailAddress);
	this.office = office;
	this.salary = salary;
	this.dataHired = dataHired;
	}
	public Employee() {}
	@Override
	public String toString() {
	return this.getClass()+"\n"+"Person Name  "+this.name;
	}
	   
}
