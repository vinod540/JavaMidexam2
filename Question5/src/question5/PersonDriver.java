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
public class PersonDriver {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
      Person person = new Person("Aparna", "123, New Jersey","1111111111","aparna@gmail.com");
      System.out.println("Answer5: Vinod Kumar Reddy Nellore");  
      System.out.println(person);
      Student student = new Student("Ramya","245, New Jersey","2222222222","ramya@gmail.com","Class XII");
      System.out.println(student);
      Employee employee = new Employee("Raj","345, Texas","3333333333","raj@gmail.com","Infosys",5000,"23-Feb-2015");
      System.out.println(employee);
      Faculty faculty = new Faculty("Ramu","456, Texas","4444444444","ramu@gmail.com","TCS",4000,"12-Feb-2016",8,3);
      System.out.println(faculty);
      Staff staff = new Staff("Vamshi","1234, New Jersey","5555555555","vamshi@gmail.com","Wipro",3000,"23-March-2018","Accountant");
      System.out.println(staff);
		
	}

}
