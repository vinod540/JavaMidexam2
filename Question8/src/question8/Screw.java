/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package question8;

/**
 *
 * @author S542412
 */
class Screw extends Item
{
	private int screwCost;
	Screw()
	{
	  screwCost = 30;
	}
	int cost()
	{
	  return screwCost;
	}
}

