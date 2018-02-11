package quiz1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class QuestionOne{
	public static void main(String[] args){
		 List<Item> list = new ArrayList<Item>();

	      list.add(new Item(12));
	      list.add(new Item(4));
	      list.add(new Item(5));
	      list.add(new Item(7));
	      list.add(new Item(6));
	      list.add(new Item(9));
	      
	      Collections.sort(list, Item.compareByPrice());
	      
	      for(Item a: list){
	    	  System.out.println(a.getPrice());
	      }
	}
	

}
