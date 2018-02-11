
public abstract class AutomatedInventory extends Inventory{

	public AutomatedInventory(String pName) {
		super(pName);
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public void dispose(Item pItem, int pQuantity)
	{
		this.locate();
		this.grab();
		int amount = aInventory.get(pItem);
		amount -= pQuantity;
		aInventory.put(pItem, amount);
	}
	
	protected abstract void locate();//make this protected
	
	protected abstract void grab();
	
	

}
