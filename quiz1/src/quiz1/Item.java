package quiz1;

import java.util.Comparator;

public class Item {
	private int price;
	
	public Item(int p){
		this.price = p;
	}
	
	public int getPrice(){
		return this.price;
	}
	
	public static Comparator<Item> compareByPrice()//create factory method
	   {
	      return new Comparator<Item>() 
	      {
			@Override
			public int compare(Item o1, Item o2) {
				return o1.getPrice() - o2.getPrice();
			}
	      };
	   }
}
