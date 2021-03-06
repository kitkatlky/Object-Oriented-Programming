/*
Write a class named GroceryList that represents a person's list of items to buy from the 
market, and another class named GroceryItemOrder that represents a request to purchase 
a particular item in a given quantity (example: 4 boxes of cookies).

The GroceryList class should use an array field to store the grocery items, as well as 
keeping track of its size (number of items in the list so far). Assume that a grocery list 
will have no more than 10 items. A GroceryList object should have the following methods:

        public GroceryList()
        Constructs a new empty grocery list.
        
        public void add(GroceryItemOrder item)
        Adds the given item order to this list, if the list is not full (has fewer than 10 items).
        
        public double getTotalCost()
        Returns the total sum cost of all grocery item orders in this list.
        
The GroceryItemOrder class should store an item quantity and price per unit. 
A GroceryItemOrder object should have the following methods:

        public GroceryItemOrder(String name, int quantity, double pricePerUnit) 
        Constructs an item order to purchase the item with the given name, in the given quantity,
        which costs the given price per unit.
        
        public double getCost()
        Returns the total cost of this item in its given quantity. For example, 4 boxes of 
        cookies that are 2.30 per unit have a cost of 9.20.
        
        public void setQuantity(int quantity)
        Sets this grocery item's quantity to be the given value.
*/


public class GroceryList{
	GroceryItemOder[] your_item;
	int num_in_list;

	public GroceryList(){
		your_item=new GroceryItemOder[10];
		num_in_list=0;
	}

	public void add(GroceryItemOder item){
		if(num_in_list<=10){
		your_item[num_in_list]=item;
		num_in_list++;
	}
	}

	public double getTotalCost(){
		double sum=0;
		for(int i=0;i<your_item.length;i++){
			sum+=your_item[i].getCost();
	}
	return sum;
	}
}
