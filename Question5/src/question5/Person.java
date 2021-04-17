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
public class Person {
    protected String name;
    private String address;
    private String phoneNumber;
    private String emailAddress;
    public Person(String name, String address, String phoneNumber, String emailAddress) 
        {
	    this.name = name;
	    this.address = address;
	    this.phoneNumber = phoneNumber;
	    this.emailAddress = emailAddress;
	}
	public Person() {}
	@Override
	public String toString() {
	return this.getClass()+"\n"+"Person Name  "+this.name;
	}
}
