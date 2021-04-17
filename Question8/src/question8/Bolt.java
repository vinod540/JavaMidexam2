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
class Bolt extends Item
{
	private int boltCost;
	Bolt()
	{
	  boltCost = 20;
	}
	int cost()
	{
	  return boltCost;
	}
}
