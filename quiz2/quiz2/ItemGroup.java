import java.util.ArrayList;

public class ItemGroup {
	private ArrayList<Item> itemGroup;
	
	public ItemGroup(){
		this.itemGroup = new ArrayList<Item>();
	}
	
	public ItemGroup(ItemGroup group){
	    ArrayList<Item> cloneList = new ArrayList<Item>();
		
		for (Item a : group.itemGroup){
			cloneList.add(a);
		}
		
		this.itemGroup = cloneList;
	}
	
	public ArrayList<Item> getList(){
		return this.itemGroup;
	}
	
	public void add(Item i){
		itemGroup.add(i);
	}
	
	public void remove(Item i){
		if (itemGroup.contains(i)){
			itemGroup.remove(itemGroup.indexOf(i));
		}else{
			System.out.println("no such item");
		}
	}
	
	public void getDiscount(){
		if (itemGroup.size()>2){
			System.out.println("15%");
		}else{
			System.out.println("10%");
		}
	}
}
