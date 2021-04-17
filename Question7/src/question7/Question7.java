/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package question7;


/**
 *
 * @author Vinod Kumar Reddy Nellore
 */
enum OperatingSystem {WINDOWS, LINUX, MAC, SOLARIES}
public class Question7 {
	public static void main(String[] args) {
        System.out.println("Answer7: Vinod Kumar Reddy Nellore");
	OperatingSystem os = OperatingSystem.WINDOWS;
	switch (os)
	{
           case WINDOWS: System.out.println("Your Operating System is Windows");break;
           case LINUX: System.out.println("Your Operating System is Linux");break;
           case MAC: System.out.println("Your Operating System is Mac");break;
           case SOLARIES: System.out.println("Your Operating System is Solaries");break;
	}
	//Traversing Enum 
	for(OperatingSystem os1 : OperatingSystem.values())
        System.out.println(os1);		
	}

}

    