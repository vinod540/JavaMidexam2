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
public class Student extends Person {
    private String grade;
    private final String status = "Graduate";
    public Student(String name, String address,String phoneNumber, String emailAddress, String grade) {
    super(name, address, phoneNumber, emailAddress);
    this.grade = grade;
     }
    public Student() {}
    @Override
    public String toString() {
    return this.getClass()+"\n"+"Person Name  "+this.name;
	}
	
}
