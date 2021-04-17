/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package question1;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.Scanner;

/**
 *
 * @author Vinod Kumar Reddy Nellore
 */
public class Question1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    
		//Creating object of ArrayList to add integer elements
		ArrayList<Integer> list = new ArrayList<Integer>();
		Scanner in = new Scanner(System.in);//Scanner class is used to read input from user during runtime
		System.out.println("Answer1: Vinod Kumar Reddy Nellore");
                System.out.print("Enter ten integers: ");
		for(int i=1;i<=10;i++)
			list.add(in.nextInt());//add the given integer element into to list
		removeDuplicate(list);//calling removeDuplicate() method to remove duplicate elements
	}
	public static void removeDuplicate(ArrayList<Integer> list)
	{
		LinkedHashSet<Integer> uniqueList = new LinkedHashSet<Integer>();//LinkedHashSet class is used to remove the duplicate elements
		uniqueList.addAll(list);//adds the list of elements into LinkedHashSet object
                
		System.out.print("The distinct integers are ");
		for(Integer ele : uniqueList)//Iterating uniqueList using Enhanced for loop
			System.out.print(ele+" ");
	}
}

    

