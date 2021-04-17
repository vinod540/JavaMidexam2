/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package question9;

/**
 *
 * @author Vinod Kuamr Reddy Nellore
 */

    interface Fruit
{
	int cost();
}
class Apple implements Fruit
{
	int appleCost;
	Apple(int appleCost)
	{
	 this.appleCost = appleCost;
	}
        @Override
	public int cost()
	{
	 return appleCost;
	}
}
class Mango implements Fruit
{
	int mangoCost;
	Mango(int mangoCost)
	{
	 this.mangoCost = mangoCost;
	}
        @Override
	public int cost()
	{
	 return mangoCost;
	}
}
      public class Question9 {
	public static void main(String[] args) {
	Fruit apple = new Apple(20);
        System.out.println("Answer9: Vinod Kumar Reddy Nellore");
	System.out.println("Apple Cost = "+apple.cost());//Apple Cost = 20
	Fruit mango = new Mango(30);
	System.out.println("Mango Cost = "+mango.cost());//Mango Cost = 30
	}
}

