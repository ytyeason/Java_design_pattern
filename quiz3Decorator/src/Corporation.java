import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/**
 * Represents a company that owns and operates
 * one or more grocery stores, each with its own inventory.
 */
public class Corporation implements Iterable<BasicInventory>
{
	private Map<String, BasicInventory> aInventories = new HashMap<String, BasicInventory>();
	
	/**
	 * @param pInventory An inventory to add to the corporation.
	 */
	public void addInventory(BasicInventory pInventory)
	{
		aInventories.put(pInventory.getName(), pInventory);
	}

	@Override
	public Iterator<BasicInventory> iterator()
	{
		return aInventories.values().iterator();
	}

}