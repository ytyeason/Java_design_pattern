import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

/**
 * Represents the inventory of a 
 * physical grocery store.
 */
public class Inventory implements Iterable<Item>
{
	private final String aName; // Unique
	private final HashMap<Item, Integer> aInventory = new HashMap<>();
	
	private ArrayList<SellLoggerObserver> observerList;
	
	/**
	 * Creates a new inventory with no items in it,
	 * and identified uniquely with pName.
	 * @param pName A unique identifier for this inventory.
	 */
	public Inventory(String pName)
	{
		aName = pName;
		this.observerList = new ArrayList<SellLoggerObserver>();
	}
	
	/**
	 * @return The unique name of this inventory.
	 */
	public String getName()
	{
		return aName;
	}
	
	/**
	 * Adds pQuantity number of items to the inventory.
	 * @param pItem The type of item to add.
	 * @param pQuantity The amount to add.
	 */
	public void stock(Item pItem, int pQuantity)
	{
		int amount = 0;
		if( aInventory.containsKey(pItem))
		{
			amount = aInventory.get(pItem);
		}
		amount += pQuantity;
		aInventory.put(pItem, amount);
	}
	
	/**
	 * Removes pQuantity of items from the inventory,
	 * for example by selling them or tossing them in
	 * the garbage.
	 * @param pItem The type of item to dispose of
	 * @param pQuantity The amount to dispose.
	 * @pre aInventory.containsKey(pItem) && pQuantity >= aInventory.get(pItem)
	 */
	public void dispose(Item pItem, int pQuantity)
	{
		int amount = aInventory.get(pItem);
		amount -= pQuantity;
		aInventory.put(pItem, amount);
		this.notifyAllObservers(pItem, pQuantity);
	}
	
	/**
	 * @param pItem The item to check for availability.
	 * @return How many of the items are available in the inventory.
	 */
	public int available(Item pItem)
	{
		if( aInventory.containsKey(pItem))
		{
			return aInventory.get(pItem);
		}
		else
		{
			return 0;
		}
	}
	
	public void addObserver(sellLogger s){
		observerList.add(s);
	}
	
	//TODO:a remove observer to do
	
	
	public void notifyAllObservers(Item p, int q){
		for (SellLoggerObserver s : observerList){
			s.ItemRemoved(p,q);
		}
	}

	@Override
	public Iterator<Item> iterator()
	{
		return aInventory.keySet().iterator();
	}
}