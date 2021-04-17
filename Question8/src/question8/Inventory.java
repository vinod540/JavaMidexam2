/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package question8;

import java.util.ArrayList;

/**
 *
 * @author S542412
 */
class Inventory
{
	ArrayList<Item> items = new ArrayList<Item>();
	void addItem(Item i)
	{
		items.add(i);
	}
	int totalCost()
	{
		int total = 0;
		for(Item i : items)
		total = total + i.cost();
		return total;
	}
}
